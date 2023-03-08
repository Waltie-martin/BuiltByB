package com.example.auth2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.analytics.FirebaseAnalytics
import com.google.firebase.analytics.ktx.analytics
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class MainActivity : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth;
    private lateinit var analytics: FirebaseAnalytics

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Obtain the FirebaseAnalytics instance.
        analytics = Firebase.analytics
        // ...
        // Initialize Firebase Auth
        auth = Firebase.auth
    }

    fun toRegister(view: View){
        val email = findViewById<EditText>(R.id.etemail)
        val password = findViewById<EditText>(R.id.etpwd)
        auth.createUserWithEmailAndPassword(email.text.toString().trim(), password.text.toString()).addOnCompleteListener { task ->
            if (task.isSuccessful){
                val i = Intent(this,Rhome::class.java)
                startActivity(i)
                finish()
            }
        }.addOnFailureListener { exception ->
            Toast.makeText(applicationContext,exception.localizedMessage, Toast.LENGTH_LONG).show()
        }
    }

    fun toLogin(view: View){
        val i = Intent(this,login::class.java)
        startActivity(i)
        finish()
    }
}