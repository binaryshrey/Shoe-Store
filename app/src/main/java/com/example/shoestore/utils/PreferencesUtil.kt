package com.example.shoestore.utils

import android.app.Activity
import android.content.Context

class PreferencesUtil {


    companion object {

        private const val USER_LOGIN_STATE = "isLoggedIn"
        // store login state in sharedPreferences
        fun storeLoginStateToPreferences(activity: Activity, isLoggedIn: Boolean) {
            val sharedPreferences = activity.getPreferences(Context.MODE_PRIVATE) ?: return
            sharedPreferences.edit().putBoolean(USER_LOGIN_STATE, isLoggedIn).apply()
        }
        // get login state in sharedPreferences
        fun getLoginStateFromPreferences(activity: Activity): Boolean {
            val sharedPreferences = activity.getPreferences(Context.MODE_PRIVATE)
            return sharedPreferences.getBoolean(USER_LOGIN_STATE, false)
        }
    }
}