package com.example.dadoaleatorio

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botaoDeJogar: Button = findViewById(R.id.button) //salvando a referencia do objeto button na variavel
        jogar()//coloquei esse jogar antes do clicklistener para quando eu abrir o app, já ter um dado jogado

botaoDeJogar.setOnClickListener{//essa função fica aguardando um clicke para ser executada
            val toast = Toast.makeText(this, "Dado jogado!", Toast.LENGTH_SHORT)
            toast.show()//aparece uma mensagem curta na tela, tipo uma nuvemzinha
            jogar()
    //basicamente vai esperar o click, quando clicar, eu vou mostrar a nuvem de 'dado jogado' e chamar
    //a funcao jogar(), que joga o dado com o rodar() e atribui a ele uma imagem
        }
    }

    private fun jogar() {
        //pegando a referencia da minha imageview e atribuido no .setimageresource dela o valor do dado jogado
        val imagemDado: ImageView = findViewById(R.id.imageView)
        val dadoSorteado = rodar()
        imagemDado.setImageResource(dadoSorteado)
        imagemDado.contentDescription = rodar().toString()
    }
}