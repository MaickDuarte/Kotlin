package com.example.dadoaleatorio

fun main(){
    val meuPrimeiroDado = Dados2(6)
    println("O seu dado de ${meuPrimeiroDado.numLados} lados caiu com o lado ${meuPrimeiroDado.jogarDados()} para cima.")

    val meuSegundoDado = Dados2(20)
    println("O seu dado de ${meuSegundoDado.numLados} lados caiu com o lado ${meuSegundoDado.jogarDados()} para cima.")

}
class Dados2(var numLados:Int) {
    fun jogarDados(): Int {
       return (1..numLados).random()
    }
}