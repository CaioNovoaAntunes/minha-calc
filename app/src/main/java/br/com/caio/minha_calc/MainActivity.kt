package br.com.caio.minha_calc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    val number1 = 0.0
    lateinit var tv_num1: TextView
    lateinit var tv_num2: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    tv_num1 = findViewById(R.id.resultado)
    tv_num2 = findViewById(R.id.expressao)


    }

    fun onPress(view: View){

        val tv_num2: TextView = findViewById(R.id.resultado)
        var num2: String = tv_num2.text.toString()

        when(view.id){
            R.id.numero_zero -> tv_num2.setText(num2+ "0")
            R.id.numero_um -> tv_num2.setText(num2+"1")
            R.id.numero_dois -> tv_num2.setText(num2+"2")
            R.id.numero_tres -> tv_num2.setText(num2+"3")
            R.id.numero_quatro -> tv_num2.setText(num2+"4")
            R.id.numero_cinco -> tv_num2.setText(num2+"5")
            R.id.numero_seis -> tv_num2.setText(num2+"6")
        R.id.numero_sete -> tv_num2.setText(num2+"7")
            R.id.numero_oito -> tv_num2.setText(num2+"8")
            R.id.numero_nove -> tv_num2.setText(num2+"9")
            R.id.btn_ponto -> tv_num2.setText(num2+".")
            }
        }
  /*  fun clickOperation(view: View){
        number1 = tv_num2.text.toString().toDouble()

        when(view.id){

        }

    }
   */

}






