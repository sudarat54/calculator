package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var a = ""
        var b = 0
        var c = ""
        var d : Double = 0.0

        button32.setOnClickListener {
            textView4.setText("0")
        }
        button36.setOnClickListener {
            if (textView4.text == "0") {
                textView4.setText("")
                textView4.setText(textView4.text.toString() + "7")
            } else {
                textView4.setText(textView4.text.toString() + "7")
            }
        }
        button37.setOnClickListener {
            if (textView4.text == "0") {
                textView4.setText("")
                textView4.setText(textView4.text.toString() + "8")
            } else {
                textView4.setText(textView4.text.toString() + "8")
            }
        }
        button38.setOnClickListener {
            if (textView4.text == "0") {
                textView4.setText("")
                textView4.setText(textView4.text.toString() + "9")
            } else {
                textView4.setText(textView4.text.toString() + "9")
            }
        }
        button40.setOnClickListener {
            if (textView4.text == "0") {
                textView4.setText("")
                textView4.setText(textView4.text.toString() + "4")
            } else {
                textView4.setText(textView4.text.toString() + "4")
            }
        }
        button41.setOnClickListener {
            if (textView4.text == "0") {
                textView4.setText("")
                textView4.setText(textView4.text.toString() + "5")
            } else {
                textView4.setText(textView4.text.toString() + "5")
            }
        }
        button42.setOnClickListener {
            if (textView4.text == "0") {
                textView4.setText("")
                textView4.setText(textView4.text.toString() + "6")
            } else {
                textView4.setText(textView4.text.toString() + "6")
            }
        }
        button44.setOnClickListener {
            if (textView4.text == "0") {
                textView4.setText("")
                textView4.setText(textView4.text.toString() + "1")
            } else {
                textView4.setText(textView4.text.toString() + "1")
            }
        }
        button45.setOnClickListener {
            if (textView4.text == "0") {
                textView4.setText("")
                textView4.setText(textView4.text.toString() + "2")
            } else {
                textView4.setText(textView4.text.toString() + "2")
            }
        }
        button46.setOnClickListener {
            if (textView4.text == "0") {
                textView4.setText("")
                textView4.setText(textView4.text.toString() + "3")
            } else {
                textView4.setText(textView4.text.toString() + "3")
            }
        }
        button51.setOnClickListener {
            if (textView4.text == "0") {
                textView4.setText("0")
            } else {
                textView4.setText(textView4.text.toString() + "0")
            }
        }
        button33.setOnClickListener {
            if (textView4.text == "0" || textView4.text.length.toString() == "1") {
                textView4.setText("0")
            } else {
                textView4.setText(textView4.text.toString().dropLast(1))
            }
        }
        button52.setOnClickListener {
            if (!textView4.text.toString().contains(".")) {
                textView4.text = textView4.text.toString() + "."
            }
        }
        button35.setOnClickListener {
            c = "/"
            a = textView4.text.toString()
            textView4.setText("0")
        }
        button39.setOnClickListener {
            c = "*"
            a = textView4.text.toString()
            textView4.setText("0")
        }
        button43.setOnClickListener {
            c = "-"
            a = textView4.text.toString()
            textView4.setText("0")
        }
        button47.setOnClickListener {
            c = "+"
            a = textView4.text.toString()
            textView4.setText("0")
        }
        button34.setOnClickListener {
            c = "%"
            a = textView4.text.toString()
            textView4.setText("0")
        }
        button53.setOnClickListener {
            if (c == "/") {
                d = (a.toString().toDouble() / textView4.text.toString().toDouble())
                textView4.setText(d.toString())
            } else if (c == "") {
                d = (a.toString().toDouble() * textView4.text.toString().toDouble())
                textView4.setText(d.toString())
            } else if (c == "-") {
                d = (a.toString().toDouble() - textView4.text.toString().toDouble())
                textView4.setText(d.toString())
            } else if (c == "+") {
                d = (a.toString().toDouble() + textView4.text.toString().toDouble())
                textView4.setText(d.toString())
            }else if (c == "%") {
                d = (a.toString().toDouble() % textView4.text.toString().toDouble())
                textView4.setText(d.toString())
            }
        }
    }

}
