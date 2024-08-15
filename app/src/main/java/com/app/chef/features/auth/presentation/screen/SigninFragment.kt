package com.app.chef.features.auth.presentation.screen

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.app.chef.R
import com.app.chef.core.utils.ColorsRes
import com.app.chef.databinding.LayoutDoubleCardLayoutBinding
import com.app.chef.features.auth.presentation.base.AuthenticationsActivity
import com.app.chef.features.auth.presentation.base.AuthBaseFrag
import com.app.chef.features.auth.data.AuthViewModel

class SigninFragment: AuthBaseFrag() {

    private val TAG = javaClass.simpleName

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        b.res = res
    }

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
            res.getColor(R.color.textview_accent_dark)
            res.getColor(R.color.textview_accent_dark, null)
        }

        return b.root
    }
}