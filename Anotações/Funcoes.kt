package br.com.maick

import java.math.BigDecimal

fun main() {
    val precoDosProdutos = arrayOf(
        BigDecimal("1.99"), BigDecimal("1.99"), BigDecimal("31.99"), BigDecimal("21.99"), BigDecimal("10.99"), BigDecimal("5.99"), BigDecimal("3.99")
    )
    val precoDosProdutos2 = arrayOf(
        BigDecimal("2.99"), BigDecimal("1" + "0.99"), BigDecimal("28.39"), BigDecimal("210.99"), BigDecimal("10.99"), BigDecimal("5.99"), BigDecimal("3.99")
    )
    val precoDosProdutos3 = arrayOf(
        BigDecimal("13.99"), BigDecimal("17.99"), BigDecimal("31.99"), BigDecimal("21.59"), BigDecimal("101.99"), BigDecimal("5.99"), BigDecimal("3.99")
    )

    //Vou chamar a função criada na linha 25
    val chamandoFunCalculo = somarProdutos(precoDosProdutos)
    println(chamandoFunCalculo)
    val chamandoFunCalculo2 = somarProdutos(precoDosProdutos2)
    println(chamandoFunCalculo2)
    val chamandoFunCalculo3 = somarProdutos(precoDosProdutos3)
    println(chamandoFunCalculo3)
}

fun somarProdutos(lista: Array<BigDecimal>): BigDecimal{
//fun nomeFunção(param: Array<tipoDadoArray>): TipoDadoFunVaiRetornar{}
    var precoTotal = BigDecimal.ZERO
    for(preco in lista){
        precoTotal += preco
    }
    return precoTotal
}