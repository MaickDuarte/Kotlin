package com.example.dadoaleatorio

fun main(){
}

fun rodar(): Int{
    val resultadoDoMeuDado = Dado(6)
    val resultado = resultadoDoMeuDado.jogarDados()

    val localDoDado = when(resultado){
        1 -> R.drawable.dado_1
        2 -> R.drawable.dado_2
        3 -> R.drawable.dado_3
        4 -> R.drawable.dado_4
        5 -> R.drawable.dado_5
        else -> R.drawable.dado_6
    }
    return localDoDado

}
class Dado(var numLados:Int) {
    fun jogarDados(): Int {
       return (1..numLados).random()
    }
}