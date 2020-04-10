package com.example.kotlintest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        doubler.setOnClickListener {
            val initialValue = Integer.parseInt(valToChange.text.toString())
            val doubledValue = initialValue * 2
            valToChange.text = doubledValue.toString()

            Snackbar.make(findViewById(R.id.rootLayout), "Changed value $initialValue to $doubledValue", Snackbar.LENGTH_SHORT).show()
        }
    }
}
