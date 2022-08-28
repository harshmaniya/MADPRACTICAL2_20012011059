package com.example.madpractical2_20012011059

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar


class MainActivity : AppCompatActivity() {
    private val TAG = "MainActivity"
    private lateinit var mycl : ConstraintLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mycl = findViewById(R.id.mycl)
        Log.i(TAG, "onCreate: function call.")
        Toast.makeText(this, "onCreate: function call.", Toast.LENGTH_SHORT).show()
        Snackbar.make(mycl,"onCreate: function call.",Snackbar.LENGTH_SHORT).show()
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "onStart: function call.")
        Toast.makeText(this, "onStart: function call.", Toast.LENGTH_SHORT).show()
        Snackbar.make(mycl,"onStart: function call.",Snackbar.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG, "onResume: function call.")
        Toast.makeText(this, "onResume: function call.", Toast.LENGTH_SHORT).show()
        Snackbar.make(mycl,"onResume: function call.",Snackbar.LENGTH_SHORT).show()
    }

    override fun onRestart() {
        super.onRestart()
        Log.i(TAG, "onRestart: function call.")
        Toast.makeText(this, "onRestart: function call.", Toast.LENGTH_SHORT).show()
        Snackbar.make(mycl,"onRestart: function call.",Snackbar.LENGTH_SHORT).show()
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "onPause: function call.")
        Toast.makeText(this, "onPause: function call.", Toast.LENGTH_SHORT).show()
        Snackbar.make(mycl,"onPause: function call.",Snackbar.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG, "onStop: function call.")
        Toast.makeText(this, "onStop: function call.", Toast.LENGTH_SHORT).show()
        Snackbar.make(mycl,"onDestroy: function call.",Snackbar.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "onDestroy: function call.")
        Toast.makeText(this, "onDestroy: function call.", Toast.LENGTH_SHORT).show()
        Snackbar.make(mycl,"onDestroy: function call.",Snackbar.LENGTH_SHORT).show()
    }
}