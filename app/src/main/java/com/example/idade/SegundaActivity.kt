package com.example.idade

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_segunda.*

class SegundaActivity : AppCompatActivity() {

    private lateinit var textTexto: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda)

        val pessoa = intent.extras?.getParcelable<Pessoa>("pessoa")
        this.textTexto = findViewById(R.id.textTexto)
        this.textTexto.text = "${pessoa?.nome}, você possui ${pessoa?.idade()} anos!"
        this.textTexto.setOnClickListener({ clickTexto(it) })
    }

    fun clickTexto(view: View){
        finish()
    }

}