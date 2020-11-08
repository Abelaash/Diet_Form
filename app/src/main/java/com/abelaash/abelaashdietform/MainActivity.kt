package com.abelaash.abelaashdietform

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClick(view: View) {
        if (switch1.isChecked){
            if (radio1.isChecked) {
                if (checkBox.isChecked && checkBox2.isChecked) {
                    textView.text = switch1.text.toString() + ": " + radio1.text + " " + checkBox.text + " and " + checkBox2.text
                } else if (checkBox.isChecked) {
                    textView.text = switch1.text.toString() + ": " + radio1.text + " " + checkBox.text
                } else if (checkBox2.isChecked) {
                    textView.text = switch1.text.toString() + ": " + radio1.text + " " + checkBox2.text
                } else {
                    textView.text = switch1.text.toString() + ": " + radio1.text
                }
            }

            if (radio2.isChecked) {
                textView.text = radio2.text
                if (checkBox.isChecked && checkBox2.isChecked) {
                    textView.text = switch1.text.toString() + ":" + radio2.text + " " + checkBox.text + " and " + checkBox2.text
                } else if (checkBox.isChecked) {
                    textView.text = switch1.text.toString() + ": " + radio2.text + " " + checkBox.text
                } else if (checkBox2.isChecked) {
                    textView.text = switch1.text.toString() + ": " + radio2.text + " " + checkBox2.text
                } else {
                    textView.text = switch1.text.toString() + ": " + radio2.text
                }
            }

            if (radio3.isChecked) {
                textView.text = radio3.text
                if (checkBox.isChecked && checkBox2.isChecked) {
                    textView.text = switch1.text.toString() + ": " + radio3.text + " " + checkBox.text + " and " + checkBox2.text
                } else if (checkBox.isChecked) {
                    textView.text = switch1.text.toString() + ": " + radio3.text + " " + checkBox.text
                } else if (checkBox2.isChecked) {
                    textView.text = switch1.text.toString() + ": " + radio3.text + " " + checkBox2.text
                } else {
                    textView.text = switch1.text.toString() + ": " + radio3.text
                }
            }
        }
    }

    fun onReset(view: View) {
        radioGroup.clearCheck()
        switch1.isChecked = false
        checkBox.isChecked = false
        checkBox2.isChecked = false
        textView.text = ""
    }

}