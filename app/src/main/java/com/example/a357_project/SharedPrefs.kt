package com.example.a357_project

import android.content.Context

class SharedPrefs internal constructor(private val context: Context){

    companion object{
        private const val SHARED_PREF_NAME = "my_pref"
        private const val KEY_CITY = "city"


        private var instance : SharedPrefs? = null

        fun getInstance(context: Context) : SharedPrefs{
            if (instance == null){
                instance = SharedPrefs(context.applicationContext)
            }

            return instance!!
        }



    }
   private val prefs: SharedPrefs by lazy{

        context.getSharedprefences(SHARED_PREF_NAME, Context.MODE.PRIVATE)
    }

}

