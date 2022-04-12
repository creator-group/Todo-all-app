package com.emrecantezguren.todolist.loginscreen

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.emrecantezguren.todolist.databinding.ActivityLoginScreenBinding

class LoginScreen : AppCompatActivity() {

    private lateinit var binding: ActivityLoginScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupOnClickListeners()
    }

    private fun setupOnClickListeners(){

    }

    //anti-return to animation
    override fun onBackPressed() {
        moveTaskToBack(true)
    }

    companion object {
        fun getIntent(context: Context) =
            Intent(context, ActivityLoginScreenBinding::class.java)
    }
}