package br.com.maick

import java.math.BigDecimal

fun main(){
    val precoDosProdutos = arrayOf(
        BigDecimal("1.99"), BigDecimal("1.99"), BigDecimal("31.99"), BigDecimal("21.99"),
        BigDecimal("10.99"), BigDecimal("5.99"), BigDecimal("3.99")
    )
    //for
    var precoTotal = BigDecimal.ZERO
    for(preco in precoDosProdutos){
        precoTotal = precoTotal + preco
    }
    println(precoTotal)
    //
    //While
    var i = 0
    var precoTotal2 = BigDecimal.ZERO
    while(i < precoDosProdutos.size){
        precoTotal2 += precoDosProdutos[i]
        i++
    }
    println(precoTotal2)
    //
    //DoWhile
    var j = 0
    var precoTotal3 = BigDecimal.ZERO
    do{
        precoTotal3 += precoDosProdutos[j]
        j++
    } while(j < precoDosProdutos.size)
    println(precoTotal3)
}