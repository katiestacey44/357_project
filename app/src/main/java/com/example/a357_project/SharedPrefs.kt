package com.example.a357_project

import android.content.Context
import android.content.SharedPreferences

class SharedPrefs private constructor(private val context: Context) {

    companion object {
        private const val SHARED_PREF_NAME = "my_pref"
        private const val KEY_CITY = "city"

        @Volatile
        private var instance: SharedPrefs? = null

        fun getInstance(context: Context): SharedPrefs {
            return instance ?: synchronized(this) {
                instance ?: SharedPrefs(context.applicationContext).also { instance = it }
            }
        }
    }

    private val prefs: SharedPreferences by lazy {
        context.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE)
    }

    fun setValue(key: String, value: String) {
        prefs.edit().putString(key, value).apply()
    }

    fun getValue(key: String): String? {
        return prefs.getString(key, null)
    }

    fun setValueOrNull(key: String?, value: String?) {
        if (key != null && value != null) {
            prefs.edit().putString(key, value).apply()
        } else if (key != null) {
            prefs.edit().remove(key).apply()
        }
    }

    fun getValueOrNull(key: String?): String? {
        return if (key != null) {
            prefs.getString(key, null)
        } else null
    }

    fun ClearCityValue() {
        prefs.edit().remove(KEY_CITY).apply()
    }
}
