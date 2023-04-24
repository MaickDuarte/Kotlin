package br.com.maick

import java.math.BigDecimal
import java.math.RoundingMode

fun main(){
    //String
    val nome = "Maick"
    val tamanhoNome = nome.count()//Pega o tamanho da string
    println(tamanhoNome)

    val splitNome = nome.split("")//Separa por caractere
    println(splitNome)

    val dropLastNome = nome.dropLast(2)//Remove ultimas 2 letras do nome
    println(dropLastNome)

    val dropNome = nome.drop(2)//remove as 2 primeiras letras do nome
    println(dropNome)

    val containsNome = nome.contains('a')//na string nome tem a letra 'a'?
    println(containsNome)

    //Array
    val array = arrayOf(31, 22, 1, 5, 6, 84, 8, 3, 10)
    val sumOfArray = array.sumOf {it}//soma itens dentro do array
    println(sumOfArray)

    val reverseArray = array.reversedArray()
    println("${arrayToString(reverseArray)}")

    val sortArray = array.sortedArray()
    println("${arrayToString(sortArray)}")

    // BigDecimal
    val bigDecimal = BigDecimal("2")
    val powBigDecimal = bigDecimal.pow(3)//elevar a 3
    println(powBigDecimal)
    val divideBigDecimal = bigDecimal.divide(BigDecimal("3"), 8, RoundingMode.HALF_UP)
    //                     2.divide(vai dividir por 3, 8 casas decimais e arredondar pra cima)
    println(divideBigDecimal)

}

fun arrayToString(array: Array<Int>) = array.fold(""){acc, i ->"$acc $i"}