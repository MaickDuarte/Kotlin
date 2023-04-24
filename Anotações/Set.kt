package br.com.maick

fun main(){//set nao permite a duplicidade de elementos
    val hashSet = hashSetOf<Int>(1, 2, 5, 4)// HashSet - mais rapido e nao garante ordenação
    val sortedSet = sortedSetOf<Int>(1, 2, 3, 4)// sortedSet - mais lento e coloca em ordem alfabetica
    val linkedSet =linkedSetOf<Int>(1, 2, 3, 4)// linkedSet - nao consegue passar comparator mas mantem ordenacao
// COMPORTAMENTO
    hashSet.add(0)// vai adicionar o elemento 5
    hashSet.add(2)// não vai adicionar pois o elemento 2 já existe
    printAllElemmentts(hashSet)



    val hashSet2 = hashSetOf<Int>()// HashSet
    val sortedSet2 = sortedSetOf<Int>()// sortedSet
    val linkedSet2 =linkedSetOf<Int>()// linkedSet
}
fun printAllElemmentts(set: Set<Int>){
    println(set.joinToString(", "))
}