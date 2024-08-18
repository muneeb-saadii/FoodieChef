package com.app.chef.features.auth.presentation.screen

import android.app.Activity
import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.KeyEvent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import androidx.core.widget.doOnTextChanged
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import com.app.chef.R
import com.app.chef.core.utils.Resource
import com.app.chef.core.utils.TAGS
import com.app.chef.databinding.LayoutDoubleCardLayoutBinding
import com.app.chef.databinding.LayoutOtpSixDigitsBinding
import com.app.chef.features.auth.presentation.base.AuthBaseFrag

class ForgetPassFragment: AuthBaseFrag() {

    private val TAG = javaClass.simpleName
    private var isOtpView=false

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        b = LayoutDoubleCardLayoutBinding.inflate(layoutInflater, container, false)

        Log.i(TAG, "onCreateView");

        configViews(false)
        b.signupOptnArea.visibility = View.GONE
        b.backImgView.setOnClickListener {
            if(isOtpView){
                configViews(true)
                return@setOnClickListener
            }
            findNavController().popBackStack(R.id.signinFragment, false)
        }
        SetupOtpSwitches(b.otpArea, requireActivity())

        return b.root
    }



    private fun configViews(isToggle:Boolean) {

        if(isToggle)
            isOtpView = !isOtpView

        if(!isOtpView){

            b.titleTxt.text = "Reset Password"
            b.sloganTxt.text = "Enter email to get reset link"
            b.tvType1.text = "Reset Password"
            b.signupOptnArea.visibility = View.GONE
            b.operationArea.visibility = View.GONE
            b.field1Area.visibility = View.GONE
            b.backImgView.visibility = View.VISIBLE
            b.field2Area.visibility = View.VISIBLE
            b.field3Area.visibility = View.GONE
            b.field4Area.visibility = View.GONE
            b.otpArea.rootArea.visibility = View.GONE

            b.etField2.invalidate()
        }else{

            b.titleTxt.text = "Reset Password"
            b.sloganTxt.text = "Enter OTP we've sent to your email for verification"
            b.tvType1.text = "Verify"
            b.field2Area.visibility = View.GONE
            b.otpArea.rootArea.visibility = View.VISIBLE

            b.otpArea.etOtp1.invalidate()
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        b.res = res
        b.tvType1.setOnClickListener {
            if(!isOtpView){
                if(b.etField2.text.toString().isNotEmpty()){
                    viewModel.resetLinkToMail(b.etField2.text.toString())
                }
//                configViews(true)
            }
//            findNavController().popBackStack()
        }


        viewModel.resetPassResult.observe(viewLifecycleOwner, Observer { response ->

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
                        findNavController().popBackStack()
                    }
                }
                is Resource.Error -> {
//                    hideProgressBar()
                    Log.e(TAGS.API_ERR, "An error occurred: $response ${response::class.simpleName}")
                    response?.let { it ->
                        Log.e(TAGS.API_ERR, "An error occurred: ${it.message}")
                        myApp.showToast(it.message.toString())
                        findNavController().popBackStack()
                    }
                }
            }
        })
    }


    class SetupOtpSwitches(area: LayoutOtpSixDigitsBinding, context: Activity) {

        init {
            area.apply {

                etOtp1.doOnTextChanged { text, start, before, count ->
                    if (count == 1)
                        etOtp2.requestFocus()
                }
                etOtp1.setOnKeyListener { _, keyCode, event ->
                    if (keyCode == KeyEvent.KEYCODE_DEL && event.action == KeyEvent.ACTION_DOWN) {
                        val imm = context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
                        imm.hideSoftInputFromWindow(etOtp1.windowToken, 0)
                        true // Return true to indicate the event was handled
                    }
                    false
                }

                etOtp2.doOnTextChanged { text, start, before, count ->
                    if (count == 1)
                        etOtp3.requestFocus()
                    else if(count == 0)
                        etOtp1.requestFocus()
                }
                etOtp2.setOnKeyListener { _, keyCode, event ->
                    if (keyCode == KeyEvent.KEYCODE_DEL && event.action == KeyEvent.ACTION_DOWN) {
                        etOtp1.requestFocus()
                        true // Return true to indicate the event was handled
                    }
                    false
                }

                etOtp3.doOnTextChanged { text, start, before, count ->
                    if (count == 1)
                        etOtp4.requestFocus()
                    else if(count == 0)
                        etOtp2.requestFocus()
                }
                etOtp3.setOnKeyListener { _, keyCode, event ->
                    if (keyCode == KeyEvent.KEYCODE_DEL && event.action == KeyEvent.ACTION_DOWN) {
                        etOtp2.requestFocus()
                        true // Return true to indicate the event was handled
                    }
                    false
                }

                etOtp4.doOnTextChanged { text, start, before, count ->
                    if (count == 1)
                        etOtp5.requestFocus()
                    else if(count == 0)
                        etOtp3.requestFocus()
                }
                etOtp4.setOnKeyListener { _, keyCode, event ->
                    if (keyCode == KeyEvent.KEYCODE_DEL && event.action == KeyEvent.ACTION_DOWN) {
                        etOtp3.requestFocus()
                        true // Return true to indicate the event was handled
                    }
                    false
                }

                etOtp5.doOnTextChanged { text, start, before, count ->
                    if (count == 1)
                        etOtp6.requestFocus()
                    else if(count == 0)
                        etOtp4.requestFocus()
                }
                etOtp5.setOnKeyListener { _, keyCode, event ->
                    if (keyCode == KeyEvent.KEYCODE_DEL && event.action == KeyEvent.ACTION_DOWN) {
                        etOtp4.requestFocus()
                        true // Return true to indicate the event was handled
                    }
                    false
                }

                etOtp6.doOnTextChanged { text, start, before, count ->
                    if (count == 1){
                        val imm = context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
                        imm.hideSoftInputFromWindow(etOtp6.windowToken, 0)
                    }
                    else if(count == 0)
                        etOtp5.requestFocus()
                }
                etOtp6.setOnKeyListener { _, keyCode, event ->
                    if (keyCode == KeyEvent.KEYCODE_DEL && event.action == KeyEvent.ACTION_DOWN) {
                        etOtp5.requestFocus()
                        true // Return true to indicate the event was handled
                    }
                    false
                }
            }
        }
    }
}
