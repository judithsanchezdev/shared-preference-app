package com.example.sharedpreferences

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.sharedpreferences.UserVip.Companion.prefs
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initUI()
        checkUser()
    }

    fun checkUser(){
        if(prefs.getName().isNotEmpty()){
            goToDetail()
        }
    }

    fun initUI() {
        btnContinue.setOnClickListener { accessToDetail() }
    }

    fun accessToDetail() {
        if (etName.text.toString().isNotEmpty()) {
            prefs.saveName(etName.text.toString())
            prefs.saveVIP(cbVip.isChecked)
            goToDetail()
        } else {

        }
    }

    fun goToDetail() {
        startActivity(Intent(this, ResultActivity::class.java))
    }
}