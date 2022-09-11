package br.com.caio.minha_calc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var numero1:Double = 0.0
    var oper : Int = 0
    lateinit var tv_num1: TextView
    lateinit var tv_num2: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv_num1 = findViewById(R.id.resultado)
        tv_num2 = findViewById(R.id.expressao)
        val botaoapagador: Button = findViewById(R.id.botaoapagar)
        val botaoigual: Button = findViewById(R.id.btn_igual)


        botaoigual.setOnClickListener {
            var numero2: Double = tv_num2.text.toString().toDouble()

            var resp: Double = 0.0
            when(oper){
                1-> resp = numero1 + numero2
                2 -> resp = numero1 - numero2
                3 -> resp = numero1 * numero2
                4 -> resp = numero1 / numero2
            }
            tv_num2.setText(resp.toString())
            tv_num1.setText("")
        }
    botaoapagador.setOnClickListener {
            tv_num1.setText("")
            tv_num2.setText("")
            numero1 = 0.0
            oper = 0
         }
    }

    fun onPress(view: View){
       // val tv_num2: TextView = findViewById(R.id.resultado)
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
    fun clickOperation(view: View){
        numero1 = tv_num2.text.toString().toDouble()
        var num2_text: String = tv_num2.text.toString()
        when(view.id){
            R.id.operador_soma ->{
                tv_num1.setText(num2_text+ "+")
                oper = 1
            }
            R.id.operador_multiplicar -> {
                tv_num1.setText(num2_text+ "*")
                oper = 2
            }
            R.id.calc_menos -> {
                tv_num1.setText(num2_text+ "*")
                oper = 3

            }

            R.id.calc_dividir ->{
                tv_num1.setText(num2_text+ "/")
            oper = 4
            }
        }
    }
    }








