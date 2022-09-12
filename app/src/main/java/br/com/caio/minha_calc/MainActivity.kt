package br.com.caio.minha_calc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var numero1:Double = 0.0
    var oper : Int = 0
    lateinit var lt_resultado: TextView
    lateinit var lt_expressao: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        lt_resultado = findViewById(R.id.resultado)
        lt_expressao = findViewById(R.id.lt_expressao)
        val botaoapagador: Button = findViewById(R.id.botaoapagar)
        val botaoigual: Button = findViewById(R.id.btn_igual)


        botaoigual.setOnClickListener {
            var numero2: Double = lt_expressao.text.toString().toDouble()

            var resp: Double = 0.0
            when(oper){
                1-> resp = numero1 + numero2
                2 -> resp = numero1 - numero2
                3 -> resp = numero1 * numero2
                4 -> resp = numero1 / numero2
            }
            lt_resultado.setText("")
            lt_expressao.setText("")
            lt_expressao.setText(resp.toString())
        }
    botaoapagador.setOnClickListener {
            lt_resultado.setText("")
            lt_expressao.setText("")
            numero1 = 0.0
            oper = 0
         }
    }

    fun onPress(view: View){
       // val tv_num2: TextView = findViewById(R.id.resultado)
        var num2: String = lt_expressao.text.toString()

        when(view.id){
            R.id.numero_zero -> lt_expressao.setText(num2+ "0")
            R.id.numero_um -> lt_expressao.setText(num2+"1")
            R.id.numero_dois -> lt_expressao.setText(num2+"2")
            R.id.numero_tres -> lt_expressao.setText(num2+"3")
            R.id.numero_quatro -> lt_expressao.setText(num2+"4")
            R.id.numero_cinco -> lt_expressao.setText(num2+"5")
            R.id.numero_seis -> lt_expressao.setText(num2+"6")
        R.id.numero_sete -> lt_expressao.setText(num2+"7")
            R.id.numero_oito -> lt_expressao.setText(num2+"8")
            R.id.numero_nove -> lt_expressao.setText(num2+"9")
            R.id.btn_ponto -> lt_expressao.setText(num2+".")
            }
        }
    fun clickOperation(view: View){
        numero1 = lt_expressao.text.toString().toDouble()
        var num2_text: String = lt_expressao.text.toString()
        when(view.id){
            R.id.operador_soma ->{
                lt_resultado.setText(num2_text+ "+")
                lt_expressao.setText("")
                oper = 1
            }
            R.id.operador_multiplicar -> {
                lt_resultado.setText(num2_text+ "*")
                oper = 2
            }
            R.id.calc_menos -> {
                lt_resultado.setText(num2_text+ "*")
                oper = 3

            }

            R.id.calc_dividir ->{
                lt_resultado.setText(num2_text+ "/")
            oper = 4
            }
        }
    }
    }








