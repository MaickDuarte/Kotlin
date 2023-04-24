package br.com.maick

fun main(){
    //Operadores numericos
    val n1 = 1
    val n2 = 2

    val soma = n1 + n2
    println(soma)

    val subtracao = n1 - n2
    println(subtracao)

    val divisao = 1.0 / 2.0
    println(divisao)

    val multiplicacao = n2 * n2
    println(multiplicacao)

    val resto = 10 % 3
    println(resto)

    //Contacentação
    val frase1 = "isso é "
    val frase2 = "um teste"

    println("Oi " + frase1 + frase2)
    println("Oi ${frase1}${frase2}")

    // Operadores de comparação
    println("1 == 1 -> ${1==1}")//true
    println("1 != 1 -> ${1!=1}")//false
    println(2 > 1)//true
    println(2 < 1)//false
    println(5 >= 5)//true
    println(5 <= 4)//false


}