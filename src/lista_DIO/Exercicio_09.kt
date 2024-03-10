package lista_DIO

/* 9 - Faça um algoritmo que calcule o IMC (Índice de Massa Corporal) de uma pessoa, leia o seu peso e sua altura e imprima na tela sua condição
de acordo com a tabela abaixo:

Fórmula do IMC = peso / (altura) ²
Tabela Condições IMC

Abaixo de 18,5   | Abaixo do peso
Entre 18,6 e 24,9 | Peso ideal (parabéns)
Entre 25,0 e 29,9 | Levemente acima do peso
Entre 30,0 e 34,9 | Obesidade grau I
Entre 35,0 e 39,9 | Obesidade grau II (severa)
Maior ou igual a 40 | Obesidade grau III (mórbida) */

private var IMC: Float = 0.0F
class Exercicio_09 {

    fun calculaIMC(peso: Float, altura: Float): Unit {
        (peso / (altura * altura)).also { it.also { IMC = it } }
        println("<< Seu IMC: ${IMC} >>")
        when (IMC) {
            in 0F..18.5F -> println("<Abaixo de 18,5 | Abaixo do peso>")
            in 18.6F.rangeTo(24.9F) -> println("<Entre 18,6 e 24,9 | Peso ideal (parabéns)>")
            in 25.0F..29.9F ->  println("<Entre 25,0 e 29,9 | Levemente acima do peso>")
            in 30.0.rangeTo(34.9) -> println("<Entre 30,0 e 34,9 | Obesidade grau I>")
            in 35.0F..39.9F -> println("<Obesidade grau II (severa)>")
        }
        if (IMC >= 40F)
            println("Obesidade grau III (mórbida)")
    }
}

fun main() {
    Exercicio_09().also { it.calculaIMC(72F, 1.83F) }
}