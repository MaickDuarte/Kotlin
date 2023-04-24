package br.com.maick

fun main(){
    //if
    val veiculoEscolhido ="teste"

    if(veiculoEscolhido == "Carro"){
        println("Tempo esperado 23 minutos")
    } else if(veiculoEscolhido == "Onibus"){
        println("Tempo esperado 48 minutos")
    } else if(veiculoEscolhido == "A pé"){
        println("Tempo esperado 2h e 12 minutos")
    } else {
        println("Você não selecionou nenhum metodo para a rota")
    }

    //Wh99en
    when(veiculoEscolhido){
        "Carro" -> println("Tempo esperado 23 minutos")
        "Onibus" -> println("Tempo esperado 48 minutos")
        "A pé" -> println("Tempo esperado 2h e 12 minutos")
        else -> println("Você não selecionou nenhum metodo para a rota")

    }
}