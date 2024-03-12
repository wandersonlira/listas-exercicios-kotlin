package lista_DIO

//10 - Faça um algoritmo que leia três notas obtidas por um aluno, e imprima na tela a média das notas.

class Exercicio_10 {
    fun calculaMedia(notaA: Float, notaB: Float, notaC: Float) =
        println("Sua média é: ${(notaA + notaB + notaC) / 3}")
}

fun main() {
    Exercicio_10().also { it.calculaMedia(8.0F, 10.6F, 6.5F) }
}