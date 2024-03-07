package lista_DIO

//1 - Faça um algoritmo que leia os valores de A, B, C e em seguida imprima na tela a soma entre A e B e mostre se a soma é menor que C.

class Exercicio_01 {

    fun soma(numA: Int, numB: Int, numC: Int) = verificaValue(somaValue(numA, numB), numC)

    private fun somaValue(valorA: Int, valorB: Int): Int {
        val somaAB: Int = valorA + valorB
        println("Soma entre 'valor A' e 'valor B': $somaAB")
        return somaAB
    }

    private fun verificaValue(somaAB: Int, valorC: Int) {
        when {
            somaAB > valorC -> println(message = "A soma entre 'valor A e Valor B' é maior que valor C! \nSoma: ${somaAB}, valor 'C': $valorC")
        }
    }

}

fun main() {
    Exercicio_01().also {
        it.soma(2, 5, 4)
    }
}