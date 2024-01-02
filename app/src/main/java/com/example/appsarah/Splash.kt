package com.example.appsarah

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.ncorti.slidetoact.SlideToActView

class Splash : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val splashScreen: SlideToActView = findViewById<SlideToActView>(R.id.slideToAct)


        splashScreen.onSlideCompleteListener = object : SlideToActView.OnSlideCompleteListener{
            override fun onSlideComplete(view: SlideToActView) {
                val intent = Intent(this@Splash,tablayoutactivity::class.java)
                startActivity(intent)
                finish()
            }
        }
    }
}
