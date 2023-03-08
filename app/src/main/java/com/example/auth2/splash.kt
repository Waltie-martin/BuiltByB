package com.example.auth2

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView

class splash : AppCompatActivity() {

    val Time_Out = 4000L

    private lateinit var topanimation :Animation
    private lateinit var bottomanimamtion :Animation

    private lateinit var imgview: ImageView
    private lateinit var txtView: TextView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //hide status bar
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_splash)

        val actionBar = supportActionBar
        actionBar!!.hide()

        //make animation
        topanimation = AnimationUtils.loadAnimation(this,R.anim.top_anim)
        bottomanimamtion = AnimationUtils.loadAnimation(this,R.anim.bottom_anim)

        imgview = findViewById(R.id.imgV)
        txtView = findViewById(R.id.txtV)

        imgview.animation = topanimation
        txtView.animation = bottomanimamtion

        Handler().postDelayed({
            val i = Intent(this,login::class.java)
            startActivity(i)
            finish()
        }, Time_Out
        )
    }
}