package com.jessmobilesolutions.gametwo

import android.content.Context
import android.graphics.Typeface
import android.util.Log

object Fonts {
    lateinit var chalkboard: Typeface

    fun initializeFonts(context: Context) {
        try {
            chalkboard = Typeface.createFromAsset(context.assets, "chalkboard.ttf")
        }
        catch (e: Exception) {
            Log.d("Game2", e.localizedMessage)
        }
    }
}