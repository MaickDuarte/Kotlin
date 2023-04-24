package br.com.maick

import kotlin.random.Random
import kotlin.system.measureNanoTime
import kotlin.time.measureTime

fun main(){
//mapOf apenas para leitura dos elementos
//mutableMapOf para adicionar ou alterar elementos

    //map
//  val map1 = mapOf<Int, String> Não é obrigatorio especificar tipo dos dados
    val map1 = mapOf(
        1 to "Muito ruim",//a chave 1 representa o valor "muito ruim" e assim por diante
        2 to "ruim",
        3 to "Razoavel",
        4 to "Bom",
        5 to "Muito bom"
    )
    println(map1.get(1))
    println(map1[2])
    println(map1.get(6))//retorna null por que nao existe essa opção

    //mutable map
    val mutableMap1 = mutableMapOf(
        1 to "Muito ruim",//a chave 1 representa o valor "muito ruim" e assim por diante
        2 to "ruim",
        3 to "Razoavel",
        4 to "Bom",

    )
    println(mutableMap1[5])//vai imprimir null pq ainda nao foi adicionado

    mutableMap1.put(5, "Muito bom") //adicionando opção 5
    println(mutableMap1[5])//vai imprimir muito bom

    //===================================================================
    val listaCodigos = Array(100000){ Random.nextInt(1, 6)}
    val listMap = listOf(
        Pair(1, "Muito ruim"),
        Pair(2, "ruim"),
        Pair(3, "Razoavel"),
        Pair(4, "Bom"),
        Pair(5, "Muito bom")
    )
    val time1 = measureNanoTime {
        for (codigo in listaCodigos) {
            val categoria = listMap.find { it.first == codigo }!!
            categoria.second
        }
    }
    val time2 = measureNanoTime {
        for (codigo in listaCodigos) {
            val categoria = map1[codigo]
            categoria
        }
    }
    println(time1)
    println(time2)
}
