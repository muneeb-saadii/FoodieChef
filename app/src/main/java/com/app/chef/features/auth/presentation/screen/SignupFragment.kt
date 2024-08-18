package com.app.chef.features.auth.presentation.screen

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import com.app.chef.R
import com.app.chef.core.utils.Resource
import com.app.chef.core.utils.TAGS
import com.app.chef.databinding.LayoutDoubleCardLayoutBinding
import com.app.chef.features.auth.presentation.base.AuthBaseFrag

class SignupFragment: AuthBaseFrag() {

    private val TAG = javaClass.simpleName

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        b = LayoutDoubleCardLayoutBinding.inflate(layoutInflater, container,false)

        Log.i(TAG, "onCreateView")

        b.titleTxt.text = "Sign Up"
        b.sloganTxt.text = "Please signup to create new account"
        b.tvType1.text = "Sign Up"
        b.signupOptnArea.visibility = View.GONE
        b.operationArea.visibility = View.GONE
        b.backImgView.visibility = View.VISIBLE
        b.field1Area.visibility = View.VISIBLE
        b.field2Area.visibility = View.VISIBLE
        b.field3Area.visibility = View.VISIBLE
        b.field4Area.visibility = View.VISIBLE
        b.otpArea.rootArea.visibility = View.GONE

        b.backImgView.setOnClickListener {
            findNavController().popBackStack(R.id.signinFragment, false)
        }

        b.tvType1.setOnClickListener {
            if(! b.etField3.text.toString().equals(b.etField4.text.toString())){
                myApp.showMessage(it, "Passwords doesn't match!")
                return@setOnClickListener
            }
            if (b.etField1.text.isNotEmpty() && b.etField2.text.isNotEmpty() && b.etField3.text.isNotEmpty()
                && b.etField4.text.isNotEmpty() ){
                viewModel.registerUser(b.etField2.text.toString(), b.etField3.text.toString())
            }else
                myApp.showMessage(it, "Please enter all fields")
        }
        return b.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        b.res = res

        viewModel.signupResult.observe(viewLifecycleOwner, Observer { response ->
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
                        findNavController().navigate(R.id.action_signupFragment_to_signinFragment)
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



    override fun onDestroyView() {
        super.onDestroyView()
        viewModel.signupResult.removeObservers(viewLifecycleOwner)
        viewModel.signupResult.value = null
    }
}