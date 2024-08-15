package com.app.chef.features.auth.presentation.base

import android.content.res.Resources
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.app.chef.R
import com.app.chef.core.helper.SharedPrefHelper
import com.app.chef.core.utils.ColorsRes
import com.app.chef.databinding.ActivityLoginSignupBinding
import com.app.chef.db.AppDatabase
import com.app.chef.features.auth.data.AuthViewModelProviderFact
import com.app.chef.features.auth.domain.repo.AuthRepository
import com.app.chef.features.auth.data.AuthViewModel
import com.google.firebase.remoteconfig.FirebaseRemoteConfig
import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings

class AuthenticationsActivity : AppCompatActivity() {

    private lateinit var b: ActivityLoginSignupBinding
    lateinit var viewModel: AuthViewModel
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityLoginSignupBinding.inflate(layoutInflater)
        setContentView(b.root)

        val authRepository = AuthRepository(AppDatabase(this))
        val vmProviderFactory = AuthViewModelProviderFact(authRepository)
        viewModel = ViewModelProvider(this, vmProviderFactory).get(AuthViewModel::class.java)

//        viewModel?.let{ setupWithNavController(findNavController(R.id.mainNavHostFrag)) }

        val navHostFragment = supportFragmentManager
            .findFragmentById(R.id.authNavHostFrag) as NavHostFragment
        navController = navHostFragment.navController
    }


    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp() || super.onSupportNavigateUp()
    }

    override fun onBackPressed() {
        val currentFragment = supportFragmentManager.primaryNavigationFragment?.childFragmentManager?.fragments?.firstOrNull()
        if (currentFragment is AuthBaseFrag) {
            if (currentFragment.onBackPressed()) {
                super.onBackPressed()
            }
        } else {
            super.onBackPressed()
        }
    }
}
