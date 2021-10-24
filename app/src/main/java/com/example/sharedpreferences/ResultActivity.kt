package com.example.sharedpreferences

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import com.example.sharedpreferences.UserVip.Companion.prefs
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        initUI()
    }

    fun initUI(){
        btnCerrarSesion.setOnClickListener{
            prefs.wipe()
            onBackPressed()
        }
        val userName = prefs.getName()
        tvName.text = "Bienvenid@ ${userName}"
        if(prefs.getVIP()){
            setVIPColorBackground()
        }
    }

    fun setVIPColorBackground(){
        container.setBackgroundColor(ContextCompat.getColor(this, R.color.purple_200))
    }
}