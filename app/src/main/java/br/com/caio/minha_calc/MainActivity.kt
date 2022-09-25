package br.com.caio.minha_calc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var numberOne:Double = 0.0
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
            var numberTwo: Double = lt_Expressao.text.toString().toDouble()

            var resp: Double = 0.0
            when(operadorType){
                1-> resp = numberOne + numberTwo
                2 -> resp = numberOne - numberTwo
                3 -> resp = numberOne * numberTwo
                4 -> resp = numberOne / numberTwo
            }
            lt_Resultado.setText("")
            lt_Expressao.setText("")
            lt_Expressao.setText(resp.toString())
        }
    botaoapagador.setOnClickListener {
            lt_Resultado.setText("")
            lt_Expressao.setText("")
            numberOne = 0.0
            operadorType = 0
         }
    }

    fun onPress(view: View){
       // val tv_num2: TextView = findViewById(R.id.resultado)
        var numTwo: String = lt_Expressao.text.toString()

        when(view.id){
            R.id.numero_Zero -> lt_Expressao.setText(numTwo+ "0")
            R.id.numero_Um -> lt_Expressao.setText(numTwo+"1")
            R.id.numero_Dois -> lt_Expressao.setText(numTwo+"2")
            R.id.numero_Tres -> lt_Expressao.setText(numTwo+"3")
            R.id.numero_Quatro -> lt_Expressao.setText(numTwo+"4")
            R.id.numero_Cinco -> lt_Expressao.setText(numTwo+"5")
            R.id.numero_Seis -> lt_Expressao.setText(numTwo+"6")
        R.id.numero_Sete -> lt_Expressao.setText(numTwo+"7")
            R.id.numero_Oito -> lt_Expressao.setText(numTwo+"8")
            R.id.numero_Nove -> lt_Expressao.setText(numTwo+"9")
            R.id.btn_Ponto -> lt_Expressao.setText(numTwo+".")
            }
        }
    fun clickOperation(view: View){
        numberOne = lt_Expressao.text.toString().toDouble()
        var num2_Text: String = lt_Expressao.text.toString()
        when(view.id){
            R.id.operador_soma ->{
                lt_Resultado.setText(num2_Text+ "+")
                lt_Expressao.setText("")
                operadorType = 1
            }
            R.id.calculador_menos -> {
                lt_Resultado.setText(num2_Text+ "-")
                lt_Expressao.setText("")
                operadorType = 2
            }
            R.id.calc_multiplicador -> {
                lt_Resultado.setText(num2_Text+ "*")
                lt_Expressao.setText("")
                operadorType = 3

            }

            R.id.calc_dividir ->{
                lt_Resultado.setText(num2_Text+ "/")
                lt_Expressao.setText("")
                operadorType = 4
            }
        }
    }
    }








