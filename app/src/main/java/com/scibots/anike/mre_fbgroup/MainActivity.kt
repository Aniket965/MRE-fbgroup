package com.scibots.anike.mre_fbgroup;

import android.os.Build
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View
import android.view.WindowManager
import com.afollestad.materialdialogs.MaterialDialog



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // for making status bar completly transparent
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            val w = window // in Activity's onCreate() for instance
            w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS)
        }

    }

    fun share(view: View){
        val wrapInScrollView = true
        val dialog = MaterialDialog.Builder(this)
                .title(R.string.title)
                .customView(R.layout.share_details, wrapInScrollView)
                .positiveText(R.string.postive)
                .show()
    }
}