package br.com.caio.minha_calc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var numero1:Double = 0.0
    var operadorType : Int = 0
    lateinit var lt_Resultado: TextView
    lateinit var lt_Expressao: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        lt_Resultado = findViewById(R.id.resultado)
        lt_Expressao = findViewById(R.id.lt_expressao)
        val botaoapagador: Button = findViewById(R.id.botaoapagar)
        val botaoigual: Button = findViewById(R.id.btn_igual)


        botaoigual.setOnClickListener {
            var numero2: Double = lt_Expressao.text.toString().toDouble()

            var resp: Double = 0.0
            when(operadorType){
                1-> resp = numero1 + numero2
                2 -> resp = numero1 - numero2
                3 -> resp = numero1 * numero2
                4 -> resp = numero1 / numero2
            }
            lt_Resultado.setText("")
            lt_Expressao.setText("")
            lt_Expressao.setText(resp.toString())
        }
    botaoapagador.setOnClickListener {
            lt_Resultado.setText("")
            lt_Expressao.setText("")
            numero1 = 0.0
            operadorType = 0
         }
    }

    fun onPress(view: View){
       // val tv_num2: TextView = findViewById(R.id.resultado)
        var num2: String = lt_Expressao.text.toString()

        when(view.id){
            R.id.numero_Zero -> lt_Expressao.setText(num2+ "0")
            R.id.numero_Um -> lt_Expressao.setText(num2+"1")
            R.id.numero_Dois -> lt_Expressao.setText(num2+"2")
            R.id.numero_Tres -> lt_Expressao.setText(num2+"3")
            R.id.numero_Quatro -> lt_Expressao.setText(num2+"4")
            R.id.numero_Cinco -> lt_Expressao.setText(num2+"5")
            R.id.numero_Seis -> lt_Expressao.setText(num2+"6")
        R.id.numero_Sete -> lt_Expressao.setText(num2+"7")
            R.id.numero_Oito -> lt_Expressao.setText(num2+"8")
            R.id.numero_Nove -> lt_Expressao.setText(num2+"9")
            R.id.btn_Ponto -> lt_Expressao.setText(num2+".")
            }
        }
    fun clickOperation(view: View){
        numero1 = lt_Expressao.text.toString().toDouble()
        var num2_text: String = lt_Expressao.text.toString()
        when(view.id){
            R.id.operador_soma ->{
                lt_Resultado.setText(num2_text+ "+")
                lt_Expressao.setText("")
                operadorType = 1
            }
            R.id.calculador_menos -> {
                lt_Resultado.setText(num2_text+ "-")
                lt_Expressao.setText("")
                operadorType = 2
            }
            R.id.calc_multiplicador -> {
                lt_Resultado.setText(num2_text+ "*")
                lt_Expressao.setText("")
                operadorType = 3

            }

            R.id.calc_dividir ->{
                lt_Resultado.setText(num2_text+ "/")
                lt_Expressao.setText("")
                operadorType = 4
            }
        }
    }
    }








