package lista_DIO

//6 - Faça um algoritmo que leia um valor qualquer e imprima na tela com um reajuste de 5%.
class Exercicio_06 {

    fun adjusteValue(value: Double): Double = value + (value * 0.05)
}

fun main() {
    Exercicio_06().also { println("Value with 5% adjuste: ${it.adjusteValue(10.0)}") }
}
