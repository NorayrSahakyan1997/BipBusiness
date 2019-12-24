package com.example.bipbusiness.utils

import android.annotation.SuppressLint
import android.content.Context
import android.content.SharedPreferences
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class SharedPreferencesHelper @SuppressLint("CommitPrefEdits") constructor(context: Context) {
    private val mShared: SharedPreferences
    private val mEditor: SharedPreferences.Editor
    private val personDetailsKey = "PersonDetails"
    fun setStringSharedPreferences(key: String?, value: String?) {
        mEditor.putString(key, value)
        mEditor.commit()
    }

    fun getStringSharedPreferences(key: String?, defaultValue: String?): String {
        return mShared.getString(key, defaultValue)
    }

    fun getStringSharedPreferences(key: String?): String {
        return mShared.getString(key, null)
    }

    fun setIntSharedPreferences(key: String?, value: Int) {
        mEditor.putInt(key, value)
        mEditor.commit()
    }

    fun getIntSharedPreferences(key: String?, defaultValue: Int): Int {
        return mShared.getInt(key, defaultValue)
    }

    fun getIntSharedPreferences(key: String?): Int {
        return mShared.getInt(key, 0)
    }

    fun setBooleanSharedPreferences(key: String?, value: Boolean?) {
        mEditor.putBoolean(key, value!!)
        mEditor.commit()
    }

    fun getBooleanSharedPreferences(key: String?): Boolean {
        return mShared.getBoolean(key, false)
    }

    fun setIntegerListSharedPreferences(key: String?, list: List<Int?>?) {
        val gson = Gson()
        val json = gson.toJson(list)
        mEditor.putString(key, json)
        mEditor.commit()
    }

    fun getIntegerListSharedPreferences(key: String?): List<Int> {
        val gson = Gson()
        val json = mShared.getString(key, null)
        return gson.fromJson(json, object : TypeToken<List<String?>?>() {}.type)
    }

    fun setStringListSharedPreferences(key: String?, list: List<String?>?) {
        val gson = Gson()
        val json = gson.toJson(list)
        mEditor.putString(key, json)
        mEditor.commit()
    }

    fun getStringListSharedPreferences(key: String?): List<String> {
        val gson = Gson()
        val json = mShared.getString(key, null)
        return gson.fromJson(json, object : TypeToken<List<String?>?>() {}.type)
    }

    fun deleteSharedPreferences() {
        mEditor.clear()
        mEditor.commit()
    }

    init {
        mShared = context.getSharedPreferences("Configs", Context.MODE_PRIVATE)
        mEditor = mShared.edit()
    }
}