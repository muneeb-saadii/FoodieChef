package com.app.chef.features.auth.presentation.screen

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import com.app.chef.R
import com.app.chef.core.utils.ColorsRes
import com.app.chef.core.utils.Resource
import com.app.chef.core.utils.TAGS
import com.app.chef.databinding.LayoutDoubleCardLayoutBinding
import com.app.chef.features.auth.presentation.base.AuthenticationsActivity
import com.app.chef.features.auth.presentation.base.AuthBaseFrag
import com.app.chef.features.auth.data.AuthViewModel
import com.app.chef.features.dashboard.presentation.MainActivity
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.google.android.gms.common.api.ApiException
import com.google.firebase.auth.GoogleAuthProvider

class SigninFragment: AuthBaseFrag() {

    private val RC_SIGN_IN: Int = 100
    private val TAG = javaClass.simpleName


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
//        b = DataBindingUtil.inflate(layoutInflater, R.layout.layout_double_card_layout, container, false)
        b = LayoutDoubleCardLayoutBinding.inflate(inflater, container, false)

        Log.i(TAG, "onCreateView")

        b.otpArea.rootArea.visibility = View.GONE

        b.gotoSignup.setOnClickListener {
            findNavController().navigate(R.id.action_signinFragment_to_signupFragment)
        }

        b.forgetPassTxt.setOnClickListener {
            findNavController().navigate(R.id.action_signinFragment_to_forgetPassFragment)
        }

        b.tvType1.setOnClickListener {

            if (b.etField2.text.isNotEmpty() && b.etField3.text.isNotEmpty() ){
                viewModel.loginUser(b.etField2.text.toString(), b.etField3.text.toString())
            }else
                myApp.showMessage(it, "Please enter all fields")
        }

        return b.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupObservers()
        b.res = res

        val gso = GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
            .requestIdToken(getString(R.string.default_web_client_id))
            .requestEmail()
            .build()

        val mGoogleSignInClient = GoogleSignIn.getClient(requireActivity(), gso)

        b.ivGoogleOptn.setOnClickListener {
            val signInIntent = mGoogleSignInClient.signInIntent
            startActivityForResult(signInIntent, RC_SIGN_IN)
        }

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(requestCode == RC_SIGN_IN && resultCode == Activity.RESULT_OK){
            val task = GoogleSignIn.getSignedInAccountFromIntent(data)
            try {
                // Google Sign In was successful, authenticate with Firebase
                val account = task.getResult(ApiException::class.java)
                val credential = GoogleAuthProvider.getCredential(account.idToken, /*accessToken=*/ null)
                viewModel.loginWithGoogle(credential)

            } catch (e: ApiException) {
                // Google Sign In failed, update UI appropriately
            }
        }
    }

    private fun setupObservers() {
        viewModel.loginResult.observe(viewLifecycleOwner, Observer { response ->
            when(response){
                is Resource.Loading -> {
    //                    showProgressBar()
                }
                is Resource.Success -> {
    //                    hideProgressBar()
                    Log.e(TAGS.API_SUCCESS, "Response: $response ${response::class.simpleName}")
                    response.data?.let { msg ->
                        Log.e(TAGS.API_SUCCESS, "Response: ${response.data}")
                        myApp.showToast(msg)
                        startActivity(Intent(requireActivity(), MainActivity::class.java))
                        activity?.finishAffinity()
                    }
                }
                is Resource.Error -> {
    //                    hideProgressBar()
                    Log.e(TAGS.API_ERR, "An error occurred: $response ${response::class.simpleName}")
                    response?.let { it ->
                        Log.e(TAGS.API_ERR, "An error occurred: ${it.message}")
                        myApp.showToast(it.message.toString())
                    }
                }
            }
        })
        viewModel.googleLoginResult.observe(viewLifecycleOwner, Observer { response ->
            when(response){
                is Resource.Loading -> {
//                    showProgressBar()
                }
                is Resource.Success -> {
//                    hideProgressBar()
                    Log.e(TAGS.API_SUCCESS, "Response: $response ${response::class.simpleName}")
                    response?.let { it ->
                        Log.e(TAGS.API_SUCCESS, "Response: ${response.data}")
                        myApp.showToast(it.data!!)
                        startActivity(Intent(requireActivity(), MainActivity::class.java))
                        activity?.finishAffinity()
                    }
                }
                is Resource.Error -> {
//                    hideProgressBar()
                    Log.e(TAGS.API_ERR, "An error occurred: $response ${response::class.simpleName}")
                    response?.let { it ->
                        Log.e(TAGS.API_ERR, "An error occurred: ${it.message}")
                        myApp.showToast(it.message.toString())
                    }
                }
            }
        })
    }
}