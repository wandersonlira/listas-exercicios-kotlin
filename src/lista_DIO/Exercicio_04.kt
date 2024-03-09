package lista_DIO

//4 - Faça um algoritmo que receba um número inteiro e imprima na tela o seu antecessor e o seu sucessor.

class Exercicio_04 {

    fun receiveNumber(number: Int) =
        println(message = "Antecessor: ${number.dec()} \n"
                + "Valor Digitado: ${number} \n"
                + "Sucessor: ${number.inc()}")
}

fun main() {
    Exercicio_04().also {
        it.receiveNumber(0)
    }
}