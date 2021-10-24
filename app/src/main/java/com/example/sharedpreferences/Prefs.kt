package com.example.sharedpreferences

import android.content.Context

class Prefs (val context: Context){
    val SHARED_NAME ="Mydtb"
    val SHARED_USER_NAME="username"
    val SHARED_USER_VIP="uservip"
    val store = context.getSharedPreferences(SHARED_NAME, 0)

    fun saveName(name: String){
        store.edit().putString(SHARED_USER_NAME, name).apply()
    }

    fun saveVIP(vip:Boolean) {
        store.edit().putBoolean(SHARED_USER_VIP, vip).apply()
    }

    fun getName(): String {
        return store.getString(SHARED_USER_NAME, "")!!
    }

    fun getVIP():Boolean {
        return store.getBoolean(SHARED_USER_VIP, false)
    }

    fun wipe(){
        store.edit().clear().apply()
    }
}