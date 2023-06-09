package com.example.dadoaleatorio

//objetivo do exercicio: criar uma moeda que mostra os 2 lados, e tem varias cores

fun main(){
    val minhaMoeda = Moeda(25)
    println("Minha moeda custa ${minhaMoeda.valor}, é da cor ${minhaMoeda.cor} e deu ${minhaMoeda.caraOuCoroa()} quando jogada.")
}
class Moeda(val valor:Int){

    fun caraOuCoroa():String{
        val aleatorizar = (1..2).random()
        if(aleatorizar == 1){
            return "Cara"
        } else {
            return "Coroa"
        }

    }
    val cor = definirCor()
    fun definirCor(): String {
        when(valor){
            5 -> return "Bronze"
            10 -> return "Dourado"
            25 -> return "Dourado"
            50 -> return "Prata"
            100 -> return "Bordas douradas com interior Prateado"
            else -> return "Moeda inválida, por favor insira novamente"
        }
    }
}


