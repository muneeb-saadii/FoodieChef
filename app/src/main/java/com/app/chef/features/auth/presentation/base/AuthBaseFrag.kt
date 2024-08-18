package com.app.chef.features.auth.presentation.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.app.chef.core.utils.ColorsRes
import com.app.chef.core.utils.MyApp
import com.app.chef.databinding.LayoutDoubleCardLayoutBinding
import com.app.chef.features.auth.data.AuthViewModel

open class AuthBaseFrag: Fragment() {

    lateinit var b: LayoutDoubleCardLayoutBinding
    lateinit var res: ColorsRes
    lateinit var viewModel: AuthViewModel
    lateinit var myApp: MyApp


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel = (activity as AuthenticationsActivity).viewModel
        myApp = MyApp(requireContext())
        res = ColorsRes(requireContext(), resources)
    }



    fun onBackPressed(): Boolean {
        return true/*if (mInterstitialAd != null && isLoaded) {
            loadStitialAd {

            }
            // Don't exit
            false
        } else {
            // Exit app (null backstack)
            true
        }*/
    }
}