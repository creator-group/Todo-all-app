package com.emrecantezguren.todolist.animation

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.CountDownTimer
import androidx.appcompat.app.AppCompatActivity
import com.emrecantezguren.todolist.databinding.ActivityAnimationBinding
import com.emrecantezguren.todolist.loginscreen.LoginScreen

class AnimationActivity : AppCompatActivity() {

    private lateinit var binding : ActivityAnimationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAnimationBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupOnClickListeners()
    }

    private fun setupOnClickListeners(){
        object: CountDownTimer(5000, 1000) {
            override fun onTick(millisUntilFinished: Long) {}

            override fun onFinish() {
                var intent = Intent(this@AnimationActivity, LoginScreen::class.java)
                startActivity(intent)
            }
        }.start()
    }
    companion object {
        fun getIntent(context: Context) =
            Intent(context, ActivityAnimationBinding::class.java)
    }
}