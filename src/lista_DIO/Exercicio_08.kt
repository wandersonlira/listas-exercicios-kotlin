package lista_DIO

//8 - Faça um algoritmo que leia três valores inteiros diferentes e imprima na tela os valores em ordem decrescente.

class Exercicio_08 {
    fun valueDecrescente(valorA: Int, valorB: Int, valorC: Int): Unit =
        if (valorA == valorB || valorB == valorC || valorC == valorA) {
            println("Os valores devem ser diferentes!")
        }

        else if (valorA > valorB && valorA > valorC) {
            if (valorB > valorC) {
                println("Maior: $valorA, Meio: $valorB, Menor: $valorC")
            } else {
                println("Maior: $valorA, Meio: $valorC, Menor: $valorB")
            }
        }

        else if (valorB > valorA && valorB > valorC) {
            if (valorA > valorC) {
                println("Maior: $valorB, Meio: $valorA, Menor: $valorC")
            } else {
                println("Maior: $valorB, Meio: $valorC, Menor: $valorA")
            }
        }

        else {
            if (valorA > valorB) {
                println("Maior: $valorC, Meio: $valorA, Menor: $valorB")
            } else {
                println("Maior: $valorC, Meio: $valorB, Menor: $valorA")
            }
        }
}

fun main() {
    Exercicio_08().also {
        it.valueDecrescente(2, 12, 4) }
}