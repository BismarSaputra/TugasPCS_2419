package com.example.ayobantu.ui.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.ayobantu.R
import com.example.ayobantu.databinding.ActivityMainBinding
import com.example.ayobantu.ui.auth.AuthActivity
import com.example.ayobantu.ui.auth.AyobantuAuth

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.btnLogout.setOnClickListener {
            AyobantuAuth.logout(this){
                startActivity(Intent(this, AuthActivity::class.java))
                finish()
            }
        }

    }
}