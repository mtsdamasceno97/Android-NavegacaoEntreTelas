package com.example.idade

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var btnMainCalc: Button
    private lateinit var textNome: TextView
    private lateinit var textAno : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.btnMainCalc = findViewById(R.id.btnMainCalcular)
        this.btnMainCalc.setOnClickListener( { clickBotao(it) })

    }

    fun clickBotao(view: View){
        val intent = Intent(this, SegundaActivity::class.java)
        //val pessoa = Pessoa(
         //   nome = "Mateus",
          //  ano = 1997
        //)
        this.textNome = findViewById(R.id.editNome)
        this.textAno = findViewById(R.id.editAno)
        val pessoa = Pessoa(
            nome = textNome.text.toString(),
            ano = textAno.text.toString()
        )


        intent.putExtra("pessoa", pessoa )
        startActivity(intent)
    }
}