package br.com.caio.minha_calc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var numberOne:Double = 0.0
    var operadorType : Int = 0
    lateinit var ltResultado: TextView
    lateinit var ltExpressao: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ltResultado = findViewById(R.id.resultado)
        ltExpressao = findViewById(R.id.lt_expressao)
        val botaoapagador: Button = findViewById(R.id.botaoapagar)
        val botaoigual: Button = findViewById(R.id.btnIgual)


        botaoigual.setOnClickListener {
            var numberTwo: Double = ltExpressao.text.toString().toDouble()

            var resp: Double = 0.0
            when(operadorType){
                1-> resp = numberOne + numberTwo
                2 -> resp = numberOne - numberTwo
                3 -> resp = numberOne * numberTwo
                4 -> resp = numberOne / numberTwo
            }
            ltResultado.setText("")
            ltExpressao.setText("")
            ltExpressao.setText(resp.toString())
        }
    botaoapagador.setOnClickListener {
            ltResultado.setText("")
            ltExpressao.setText("")
            numberOne = 0.0
            operadorType = 0
         }
    }

    fun onPress(view: View){
       // val tv_num2: TextView = findViewById(R.id.resultado)
        var numTwo: String = ltExpressao.text.toString()

        when(view.id){
            R.id.numeroZero -> ltExpressao.setText(numTwo+ "0")
            R.id.numeroUm -> ltExpressao.setText(numTwo+"1")
            R.id.numeroDois -> ltExpressao.setText(numTwo+"2")
            R.id.numeroTres -> ltExpressao.setText(numTwo+"3")
            R.id.numeroQuatro -> ltExpressao.setText(numTwo+"4")
            R.id.numeroCinco -> ltExpressao.setText(numTwo+"5")
            R.id.numeroSeis -> ltExpressao.setText(numTwo+"6")
        R.id.numeroSete -> ltExpressao.setText(numTwo+"7")
            R.id.numeroOito -> ltExpressao.setText(numTwo+"8")
            R.id.numeroNove -> ltExpressao.setText(numTwo+"9")
            R.id.btnPonto -> ltExpressao.setText(numTwo+".")
            }
        }
    fun clickOperation(view: View){
        numberOne = ltExpressao.text.toString().toDouble()
        var numerodoisText: String = ltExpressao.text.toString()
        when(view.id){
            R.id.operadorSoma ->{
                ltResultado.setText(numerodoisText+ "+")
                ltExpressao.setText("")
                operadorType = 1
            }
            R.id.operadorMenos -> {
                ltResultado.setText(numerodoisText+ "-")
                ltExpressao.setText("")
                operadorType = 2
            }
            R.id.operadorMultiplicacao -> {
                ltResultado.setText(numerodoisText+ "*")
                ltExpressao.setText("")
                operadorType = 3

            }

            R.id.operadorDivisao ->{
                ltResultado.setText(numerodoisText+ "÷")
                ltExpressao.setText("")
                operadorType = 4
            }
        }
    }
    }








