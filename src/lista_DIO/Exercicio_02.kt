package lista_DIO

//2 - Faça um algoritmo para receber um número qualquer e imprimir na tela se o número é par ou ímpar, positivo ou negativo.

class Exercicio_02 {

    fun verificaParImpar(number: Int) =
        if (number % 2 == 0) println("Este número é par: $number") else println("Este número é Ímpar: $number")
}

fun main() {
    Exercicio_02().apply {
        verificaParImpar(18)
    }
}