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
        btnDivision= findViewById(R.id.btnDivision)
        btnModulus = findViewById(R.id.btnModulus)
        btnSubtract = findViewById(R.id.btnSubtract)


        btnAdd.setOnClickListener {
            tvView.text = ""
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
            add(12.0556,7.0)

        }

        btnSubtract.setOnClickListener {
            tvView.text = ""
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
            subtract(12.0,6.0)

        }
        btnModulus.setOnClickListener {
            tvView.text = ""
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
            modulus(12.0,5.0)

        }
        btnDivision.setOnClickListener {
            tvView.text = ""
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
            division(30.0,5.0)
        }
    }

        fun add(num1: Double, num2: Double) {
            val total = num1 + num2
            tvView.text = total.toString()

        }
        fun subtract(num1: Double, num2: Double) {
            var diff = num1 + num2
            tvView.text = diff.toString()
        }

        fun modulus(num1: Double, num2: Double) {
            var mod = num1 % num2
            tvView.text = mod.toString()
        }
        fun division(num1: Double, num2: Double) {
            var div = num1 / num2
            tvView.text = div.toString()

        }
}
