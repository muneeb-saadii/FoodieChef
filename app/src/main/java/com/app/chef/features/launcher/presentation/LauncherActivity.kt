package com.app.chef.features.launcher.presentation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.view.WindowManager
import com.app.chef.core.helper.SharedPrefHelper
import com.app.chef.databinding.ActivityLauncherBinding
import com.app.chef.features.auth.presentation.base.AuthenticationsActivity
import com.google.firebase.remoteconfig.FirebaseRemoteConfig
import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings

class LauncherActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(ActivityLauncherBinding.inflate(layoutInflater).root)

        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        getAllColors()

        Handler(Looper.getMainLooper()).postDelayed({
//            startActivity(Intent(this, OnBoardingsActivity::class.java))
            startActivity(Intent(this, AuthenticationsActivity::class.java))
            finish()
        }, 3000) // 3 seconds delayed
    }

    val remoteConfig = FirebaseRemoteConfig.getInstance()

    // Set up Remote Config settings
    val configSettings = FirebaseRemoteConfigSettings.Builder()
        .setMinimumFetchIntervalInSeconds(0) // Fetch interval
        .build()

    private fun getAllColors() {
        remoteConfig.setConfigSettingsAsync(configSettings)


        // Fetch and activate Remote Config values
        remoteConfig.fetchAndActivate()
            .addOnCompleteListener { task ->
                if (task.isSuccessful) {
                    val allParams = remoteConfig.all
                    val colorsGroup = HashMap<String, String>()

                    Log.i(javaClass.simpleName, "ColorsRemoteConfig::::$allParams")
                    Log.i(javaClass.simpleName, "ColorsRemoteConfig:::: $colorsGroup")

                    for ((key, value) in allParams) {
                        if (key.startsWith("colors_")) {
                            colorsGroup[key] = value.asString()
                        }
                    }
                    SharedPrefHelper(baseContext).saveColorUtils(colorsGroup)

                } else {
                    Log.e("RemoteConfig", "Fetch failed")
                }
            }
    }
}