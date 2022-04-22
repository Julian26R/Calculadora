package com.ean.calculadora

import ResolverOperacion.division
import ResolverOperacion.multiplicacion
import ResolverOperacion.resta
import ResolverOperacion.suma
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import org.w3c.dom.Text
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //vista-modelo
        //llamado de botones
        val boton_suma = findViewById<Button>(R.id.BtnSumanAM)
        val boton_resta = findViewById<Button>(R.id.BtnRestaAM)
        val boton_multiplicacion = findViewById<Button>(R.id.BtnMultiplicacionAM)
        val boton_division = findViewById<Button>(R.id.BtnDivisionAM)
        val imagen = findViewById<ImageView>(R.id.ImVimagen)
        val boton_mensaje = findViewById<Button>(R.id.BtnOtraVentana)
        //boton suma
        boton_suma.setOnClickListener{
            val TxTNumeroUno = findViewById<EditText>(R.id.ETxTPrimerNumeroAM)
            val TxTNumeroDos = findViewById<EditText>(R.id.ETxTSegundoNumeroAM)
            val LbResultado = findViewById<TextView>(R.id.TxtVResultadoAM)

            try {
                val NumeroUno = TxTNumeroUno.text.toString().toInt()
                val NumeroDos = TxTNumeroDos.text.toString().toInt()
                val Resultado = suma(NumeroUno,NumeroDos)
                LbResultado.text = Resultado.toString()
            }catch (e:Exception){
                Toast.makeText(this,e.message,Toast.LENGTH_LONG).show()
            }
        }
        //boton resta
        boton_resta.setOnClickListener{
            val TxTNumeroUno = findViewById<EditText>(R.id.ETxTPrimerNumeroAM)
            val TxTNumeroDos = findViewById<EditText>(R.id.ETxTSegundoNumeroAM)
            val LbResultado = findViewById<TextView>(R.id.TxtVResultadoAM)

            try {
                val NumeroUno = TxTNumeroUno.text.toString().toInt()
                val NumeroDos = TxTNumeroDos.text.toString().toInt()
                val Resultado = resta(NumeroUno,NumeroDos)
                LbResultado.text = Resultado.toString()
            }catch (e:Exception){
                Toast.makeText(this,e.message,Toast.LENGTH_LONG).show()
            }
        }
        //boton Multiplicacion
        boton_multiplicacion.setOnClickListener{
            val TxTNumeroUno = findViewById<EditText>(R.id.ETxTPrimerNumeroAM)
            val TxTNumeroDos = findViewById<EditText>(R.id.ETxTSegundoNumeroAM)
            val LbResultado = findViewById<TextView>(R.id.TxtVResultadoAM)

            try {
                val NumeroUno = TxTNumeroUno.text.toString().toInt()
                val NumeroDos = TxTNumeroDos.text.toString().toInt()
                val Resultado = multiplicacion(NumeroUno,NumeroDos)
                LbResultado.text = Resultado.toString()
            }catch (e:Exception){
                Toast.makeText(this,e.message,Toast.LENGTH_LONG).show()
            }
        }
        //boton division
        boton_division.setOnClickListener{
            val TxTNumeroUno = findViewById<EditText>(R.id.ETxTPrimerNumeroAM)
            val TxTNumeroDos = findViewById<EditText>(R.id.ETxTSegundoNumeroAM)
            val LbResultado = findViewById<TextView>(R.id.TxtVResultadoAM)

            try {
                val NumeroUno = TxTNumeroUno.text.toString().toInt()
                val NumeroDos = TxTNumeroDos.text.toString().toInt()
                val Resultado = division(NumeroUno,NumeroDos)
                LbResultado.text = Resultado.toString()
            }catch (e:Exception){
                Toast.makeText(this,e.message,Toast.LENGTH_LONG).show()
            }
        }
        //Imagen
        imagen.setOnClickListener{
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://es.symbolab.com/solver"))
            startActivity(intent)
        }
        //Boton Otra Ventana
        boton_mensaje.setOnClickListener{
            val intent = Intent(this,Mensaje::class.java)
            startActivity(intent).
        }
    }
}