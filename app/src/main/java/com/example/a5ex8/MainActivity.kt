package com.example.a5ex8

import android.app.DatePickerDialog
import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.DatePicker
import android.widget.Spinner
import androidx.appcompat.app.AlertDialog
import com.google.android.material.datepicker.CalendarConstraints
import java.sql.Date
import java.sql.Time

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        AlertDialog.Builder (this)
            .setMessage("Vamos ver os estados!")
            .setTitle("Olá!")
            .setIcon(R.mipmap.ic_launcher_round)
            .setNeutralButton("Ok", null)
//            .setNegativeButton("Não", null)
            .show()
    }
}