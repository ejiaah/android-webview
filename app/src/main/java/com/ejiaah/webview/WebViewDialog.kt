package com.ejiaah.webview

import android.app.Dialog
import android.content.Context
import android.os.Build
import android.os.Bundle

class WebViewDialog(context: Context, themeResId: Int) : Dialog(context, themeResId) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dialog_webview)
    }
}