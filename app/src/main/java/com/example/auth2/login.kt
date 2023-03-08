package com.example.auth2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    fun toLogin1(view: View){
        val w = Intent(this,Rhome::class.java)
        startActivity(w)
    }
    fun gotoRegister(view: View){
        val i = Intent(this,MainActivity::class.java)
        startActivity(i)
    }
}