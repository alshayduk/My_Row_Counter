package com.example.tensor_empty

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val countLoopButton = findViewById<Button>(R.id.loopCountButton)
        countLoopButton.setOnClickListener{
            countLoops()
        }

        val resetButton = findViewById<Button>(R.id.resetButton)
        resetButton.setOnClickListener{
            resetCounter()
        }

    }

    private fun resetCounter(){
        val showRowCount = findViewById<TextView>(R.id.countRows)
        val countToRowString = showRowCount.text.toString()
        var countRow = countToRowString.toInt()
        val showLoopCount = findViewById<TextView>(R.id.countLoops)
        val countToString = showLoopCount.text.toString()
        var count = countToString.toInt()
        count = 0
        showLoopCount.text = count.toString()
        countRow = 0
        showRowCount.text = countRow.toString()
    }

    private fun countLoops(){
        val numberOfLoops = findViewById<EditText>(R.id.numberOfLoops)
        val numberToString = numberOfLoops.text.toString()
        val countNumber = numberToString.toInt()
        val showRowCount = findViewById<TextView>(R.id.countRows)
        val countToRowString = showRowCount.text.toString()
        var countRow = countToRowString.toInt()
        val showLoopCount = findViewById<TextView>(R.id.countLoops)
        val countToString = showLoopCount.text.toString()
        var count = countToString.toInt()
        count++
        showLoopCount.text = count.toString()
        if (count > countNumber){
            count = 0
            showLoopCount.text = count.toString()
            countRow++
            showRowCount.text = countRow.toString()
        }

    }

}
