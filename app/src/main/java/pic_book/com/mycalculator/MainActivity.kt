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
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    lateinit var tilInput1: TextInputLayout
    lateinit var etInput1: TextInputEditText
    lateinit var tilInput2: TextInputLayout
    lateinit var etInput2: TextInputEditText
    lateinit var tvOutput: TextView
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

        tvOutput = findViewById(R.id.tvOutput)

        btnAdd = findViewById(R.id.btnAdd)
        btnAdd.setOnClickListener {
            tvOutput.text = ""
            val num1 = etInput1.text.toString()
            val num2 = etInput2.text.toString()
            if (num1.isBlank()) {
                tilInput1.setError("number is required")
                return@setOnClickListener

            }

            if (num2.isBlank()) {
                tilInput2.setError("number is required")
                return@setOnClickListener

            }
            add(num1.toDouble(),num2.toDouble())

        }
        btnSubtract = findViewById(R.id.btnSubtract)
        btnSubtract.setOnClickListener {
            tvOutput.text = ""
            val num1 = etInput1.text.toString()
            val num2 = etInput2.text.toString()
            if (num1.isBlank()) {
                tilInput1.setError("number is required")
                return@setOnClickListener

            }
            if (num2.isBlank()) {
                tilInput2.setError("number is required")
                return@setOnClickListener

            }
            subtract(num1.toDouble(),num2.toDouble())

        }
        btnModulus = findViewById(R.id.btnModulus)
        btnModulus.setOnClickListener {
            tvOutput.text = ""
            val num1 = etInput1.text.toString()
            val num2 = etInput2.text.toString()
            if (num1.isBlank()) {
                tilInput1.setError("number is required")
                return@setOnClickListener

            }
            if (num2.isBlank()) {
                tilInput2.setError("number is required")
                return@setOnClickListener

            }
            modulus(num1.toDouble(),num2.toDouble())

        }
        btnDivision= findViewById(R.id.btnDivision)
        btnDivision.setOnClickListener {
            tvOutput.text = ""
            val num1 = etInput1.text.toString()
            val num2 = etInput2.text.toString()
            if (num1.isBlank()) {
                tilInput1.setError("number is required")
                return@setOnClickListener

            }

            if (num2.isBlank()) {
                tilInput2.setError("number is required")
                return@setOnClickListener

            }
            division(num1.toDouble(), num2.toDouble())
        }
    }

        fun add(num1: Double, num2: Double) {
            val total = num1 + num2
            tvOutput.text = total.toString()

        }
        fun subtract(num1: Double, num2: Double) {
            var diff = num1 + num2
            tvOutput.text = diff.toString()
        }

        fun modulus(num1: Double, num2: Double) {
            var mod = num1 % num2
            tvOutput.text = mod.toString()
        }
        fun division(num1: Double, num2: Double) {
            var div = num1 / num2
            tvOutput.text = div.toString()

        }
}
