package com.app.chef.ui.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.Window
import android.view.WindowManager
import com.app.chef.R
import com.app.chef.databinding.ActivityLauncherBinding

class LauncherActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(ActivityLauncherBinding.inflate(layoutInflater).root)

        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        Handler(Looper.getMainLooper()).postDelayed({
//            startActivity(Intent(this, OnBoardingsActivity::class.java))
            startActivity(Intent(this, LoginSignupActivity::class.java))
            finish()
        }, 3000) // 3 seconds delayed time
    }
}