package com.app.chef.features.auth.presentation.screen

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.app.chef.R
import com.app.chef.databinding.LayoutDoubleCardLayoutBinding
import com.app.chef.features.auth.presentation.base.AuthenticationsActivity
import com.app.chef.features.auth.presentation.base.AuthBaseFrag
import com.app.chef.features.auth.data.AuthViewModel

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
            findNavController().navigate(R.id.action_signupFragment_to_signinFragment)
        }
        return b.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        b.res = res
    }
}