package com.kyhsgeekcode.large

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val context = createPackageContext("com.kyhsgeekcode.large", 0)
        val assetManager = context.assets
        val s = assetManager.open("hello.txt").use {
            String(it.readBytes(), Charsets.UTF_8)
        }
        Toast.makeText(this, s, Toast.LENGTH_SHORT).show()
    }
}