package com.app.chef.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.app.chef.R
import com.app.chef.databinding.ActivityLoginSignupBinding

class LoginSignupActivity : AppCompatActivity() {

    private lateinit var b: ActivityLoginSignupBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityLoginSignupBinding.inflate(layoutInflater)
        setContentView(b.root)



    }
}