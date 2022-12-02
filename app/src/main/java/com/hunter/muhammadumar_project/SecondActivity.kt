package com.hunter.muhammadumar_project

import android.annotation.SuppressLint
import android.os.Build
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import com.hunter.muhammadumar_project.CalendarUtils.selectedDate
import com.hunter.muhammadumar_project.databinding.ActivitySecondBinding
import java.time.format.TextStyle
import java.util.*

class SecondActivity : AppCompatActivity() {
    lateinit var binding: ActivitySecondBinding
    private var monthDayText: TextView? = null
    private var dayOfWeekTV: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initWidgets()
    }

    private fun initWidgets() {
        monthDayText = findViewById(R.id.monthDayText)
        dayOfWeekTV = findViewById(R.id.dayOfWeekTV)
    }

    @SuppressLint("NewApi")
    override fun onResume() {
        super.onResume()
        setDayView()
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun setDayView() {
        monthDayText!!.setText(CalendarUtils.monthDayFromDate(selectedDate!!))
        val dayOfWeek: String =
            selectedDate!!.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.getDefault())
        dayOfWeekTV!!.text = dayOfWeek

    }

    @SuppressLint("NewApi")
    fun nextDayAction(view: View) {
        selectedDate = selectedDate!!.plusDays(1)
        setDayView()
    }
    @SuppressLint("NewApi")
    fun previousDayAction(view: View) {
        selectedDate = selectedDate!!.minusDays(1)
        setDayView()
    }
}