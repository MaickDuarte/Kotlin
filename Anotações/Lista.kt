package br.com.maick

fun main(){
    var array = arrayOf(
        0, 1, 2, 3, 4, 5, 6
    )
    println(array[1])
    array[1] = 9 //a posição 1 do array agora vai ser 9
    println(array[1])

    val arrayList = arrayListOf( //apenas leitura da lista
//        ou      = mutableListOf(//leitura e alteração da lista
        0, 1, 2, 3, 4, 5, 6
    )
    arrayList.add(7)//adiciona o elemento no final da lista
    printarTodosElementos(arrayList)
}

fun printarTodosElementos(lista: List<Int>){
    lista.forEachIndexed { index, i ->
        println("index: $index valor: $i")
    }
}