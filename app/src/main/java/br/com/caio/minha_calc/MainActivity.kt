package br.com.caio.minha_calc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var botaoapagador: Button? = null
    var botaoigual: Button? = null
    var numberTwo: Double = 0.0
    var numberOne: Double = 0.0
    var operadorType: Int = 0
    lateinit var ltResultado: TextView
    lateinit var ltExpressao: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewLayout()
        onClickListener()
    }

    private fun onClickListener() {
        botaoigual?.setOnClickListener {
            expressaoVisor()
        }
        botaoapagador?.setOnClickListener {
            ltResultado.setText("")
            ltExpressao.setText("")
            numberOne = 0.0
            operadorType = 0
        }
    }

    private fun expressaoVisor() {
        var resp: Double = 0.0
        when (operadorType) {
            1 -> resp = numberOne + numberTwo
            2 -> resp = numberOne - numberTwo
            3 -> resp = numberOne * numberTwo
            4 -> resp = numberOne / numberTwo
        }
        ltResultado.setText("")
        ltExpressao.setText("")
        ltExpressao.setText(resp.toString())
    }

    private fun findViewLayout() {
        numberTwo = ltExpressao.text.toString().toDouble()
        ltResultado = findViewById(R.id.resultado)
        ltExpressao = findViewById(R.id.lt_expressao)
        botaoapagador = findViewById(R.id.botaoapagar)
        botaoigual = findViewById(R.id.btnIgual)
    }

    fun onPress(view: View) {
        // val tv_num2: TextView = findViewById(R.id.resultado)
        val numTwo: String = ltExpressao.text.toString()

        when (view.id) {
            R.id.numeroZero -> ltExpressao.text = numTwo + "0"
            R.id.numeroUm -> ltExpressao.text = numTwo + "1"
            R.id.numeroDois -> ltExpressao.text = numTwo + "2"
            R.id.numeroTres -> ltExpressao.text = numTwo + "3"
            R.id.numeroQuatro -> ltExpressao.text = numTwo + "4"
            R.id.numeroCinco -> ltExpressao.text = numTwo + "5"
            R.id.numeroSeis -> ltExpressao.text = numTwo + "6"
            R.id.numeroSete -> ltExpressao.text = numTwo + "7"
            R.id.numeroOito -> ltExpressao.text = numTwo + "8"
            R.id.numeroNove -> ltExpressao.text = numTwo + "9"
            R.id.btnPonto -> ltExpressao.text = numTwo + "."
        }
    }

    fun clickOperation(view: View) {
        numberOne = ltExpressao.text.toString().toDouble()
        var numerodoisText: String = ltExpressao.text.toString()
        when (view.id) {
            R.id.operadorSoma -> {
                ltResultado.setText(numerodoisText + "+")
                ltExpressao.setText("")
                operadorType = 1
            }
            R.id.operadorMenos -> {
                ltResultado.setText(numerodoisText + "-")
                ltExpressao.setText("")
                operadorType = 2
            }
            R.id.operadorMultiplicacao -> {
                ltResultado.setText(numerodoisText + "*")
                ltExpressao.setText("")
                operadorType = 3

            }

            R.id.operadorDivisao -> {
                ltResultado.setText(numerodoisText + "÷")
                ltExpressao.setText("")
                operadorType = 4
            }
        }
    }
}








