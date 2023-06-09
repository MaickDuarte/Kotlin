package com.example.dadoaleatorio

fun main() {
    val meuDado = Dice(6)
    val resultado = meuDado.roll()
    val numeroEscolhido = 5
/* utilizando if para verificar se o dado que caiu é o mesmo que eu escolhi */
    if(resultado == numeroEscolhido){
        println("Você escolheu ${numeroEscolhido} e o dado caiu ${resultado}, PARABENS!!!")
    } else {
        println("Você escolheu ${numeroEscolhido} e o dado caiu ${resultado}, sinto muito :(")
    }
/* utilizando when para notificar sempre que meu dado escolhido por o que caiu*/
    when(resultado){
        numeroEscolhido -> println("PARABENS, VOCÊ GANHOU!!!!")
        1 -> println("Sinto muito, caiu 1")
        2 -> println("Infelizmente caiu 2")
        3 -> println("caiu 3, mas da proxima vez vai")
        4 -> println("caiu 4, mas nao desiste")
        6 -> println("F, caiu 6")
    }
}

class Dice (val lados: Int) {

    fun roll(): Int {
        return (1..lados).random()
    }
}