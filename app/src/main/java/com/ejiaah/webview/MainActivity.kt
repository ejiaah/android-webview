package com.ejiaah.webview

import android.content.Context
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.databinding.DataBindingUtil
import com.ejiaah.webview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.handlers = Handler(this)
    }

    companion object {
        private const val TAG = "MainActivity"
    }

    class Handler(val context: Context) {
        fun onClickListener(view: View) {
            when (view.id) {
                R.id.show_dialog_button -> {
                    val theme: Int
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                        theme = android.R.style.Theme_Material_NoActionBar
                    } else {
                        theme = android.R.style.Theme_Translucent_NoTitleBar
                    }

                    WebViewDialog(context, theme).show()
                }
                else -> {

                }
            }
        }
    }
}
