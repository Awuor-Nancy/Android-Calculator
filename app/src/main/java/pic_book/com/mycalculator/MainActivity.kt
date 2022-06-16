package pic_book.com.mycalculator

//Create a calculator app that is capable of performing the following operations on any
//2 numbers: Addition, Subtraction, Modulus, Division.
//Use TextInputLayouts with TextInputEditTexts and be sure to validate your inputs
//appropriately. There also should only be one textview to display the result of all the
//operations.

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    lateinit var tilInput1: TextInputLayout
    lateinit var etInput1: EditText
    lateinit var tilInput2: TextInputLayout
    lateinit var etInput2: EditText
    lateinit var tvView: TextView
    lateinit var btnAdd: Button
    lateinit var btnSubtract: Button
    lateinit var btnModulus: Button
    lateinit var btnDivision: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tilInput1 = findViewById(R.id.tilInput1)
        etInput1 = findViewById(R.id.etInput1)

        tilInput2 = findViewById(R.id.tilInput2)
        etInput2 = findViewById(R.id.etInput2)

        tvView = findViewById(R.id.tvView)

        btnAdd = findViewById(R.id.btnAdd)
        btnAdd.setOnClickListener {
        add(12.6,10.3)
        }
        btnSubtract = findViewById(R.id.btnSubtract)
        btnSubtract.setOnClickListener {
         subtract(30.9,12.0)
        }
        btnDivision = findViewById(R.id.btnDivision)
        btnDivision.setOnClickListener {
         division(20.0,4.0)
        }

        btnModulus = findViewById(R.id.btnModulus)
        btnModulus.setOnClickListener {
          modulus(10.5,2.0)
        }
    }
    fun add(num1:Double,num2: Double){
       var sum = num1 + num2
        tvView.text = sum.toString()
    }
    fun subtract(num1:Double,num2:Double){
        var diff = num1 + num2
        tvView.text = diff.toString()
    }
    fun modulus(num1:Double,num2:Double){
        var mod = num1 % num2
        tvView.text = mod.toString()
    }
    fun division(num1:Double,num2:Double){
        var div = num1 / num2
        tvView.text = div.toString()
    }

    }



//btnMultiply.setOnClickListener {
//            var num1=etNumber.text.toString().toDouble()
//            var num2=etSecond.text.toString().toDouble()
//            multiply(num1,num2)
//        }
//btnSubstract.setOnClickListener {
////            var num1=etNumber.text.toString().toDouble()
//            var num2=etSecond.text.toString().toDouble()
//            subtract(num1,num2)
//        }
//
