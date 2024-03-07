package lista_DIO

//3 - Faça um algoritmo que leia dois valores inteiros A e B, se os valores de A e B forem iguais, deverá somar os dois valores,
//caso contrário devera multiplicar A por B. Ao final de qualquer um dos cálculos deve-se atribuir o resultado a uma variável C e
//imprimir seu valor na tela.

class Exercicio_03 {

    fun readValue(valorA: Int, valorB: Int): Int =
        if (valorA == valorB) somaValue(valorA, valorB) else multValue(valorA, valorB)

    private fun somaValue(valorA: Int, valorB: Int): Int = valorA + valorB
    private fun multValue(valorA: Int, valorB: Int): Int = valorA * valorB
}

fun main() {
    Exercicio_03().also {
        println(it.readValue(7, 7))
    }

}