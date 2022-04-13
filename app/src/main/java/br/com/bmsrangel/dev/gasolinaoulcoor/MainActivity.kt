package br.com.bmsrangel.dev.gasolinaoulcoor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botao = findViewById<Button>(R.id.btCalcular)
        val textoGasolina = findViewById<EditText>(R.id.editGasolina)
        val textoAlcool = findViewById<EditText>(R.id.editAlcool)
        val textoResultado = findViewById<TextView>(R.id.textResultado)
        botao.setOnClickListener {
            val precoGasolina = textoGasolina.text.toString().toDouble()
            val precoAlcool = textoAlcool.text.toString().toDouble()

            val resultadoCalculo = precoAlcool / precoGasolina
            if (resultadoCalculo <= 0.7) {
                // Álcool
                textoResultado.setText("Melhor utilizar Álcool")
            } else {
                // Gasolina
                textoResultado.setText("Melhor usar Gasolina")
            }
            // alcool / gasolina <= 0.7 -> alcool

//            resultado.setText(texto)

        }
    }


}