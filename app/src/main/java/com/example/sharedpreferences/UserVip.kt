package com.example.sharedpreferences

import android.app.Application

class UserVip: Application() {

    companion object {
        lateinit var prefs:Prefs
    }
    override fun onCreate() {
        super.onCreate()
        prefs = Prefs(applicationContext)
    }
}