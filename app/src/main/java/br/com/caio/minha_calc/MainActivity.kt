package br.com.caio.minha_calc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    val num1 = findViewById(R.id.editTextTextPersonName) as EditText
    val num2 = findViewById(R.id.editTextTextPersonName2) as EditText
    val num3 = findViewById(R.id.totalSoma) as EditText
    val bt1 = findViewById(R.id.bt1) as Button


        bt1.setOnClickListener{
            val val1 = num1.text.toString().toBigDecimal();
            val val2 = num2.text.toString().toBigDecimal();

            val resultado = val1 + val2;

            num3.setText(resultado.toString())
        }

    }
}