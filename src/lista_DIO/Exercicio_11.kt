package lista_DIO

import java.util.*

/* 11 - Faça um algoritmo que leia quatro notas obtidas por um aluno, calcule a média das nota obtidas, imprima na tela o nome do aluno e
se o aluno foi aprovado ou reprovado. Para o aluno ser considerado aprovado sua média final deve ser maior ou igual a 7. */

class Exercicio_11 {
    private fun calculateAverage(grades: Int): Int =
        grades / 4

    private fun checkAverage(average: Int): String =
        if (average >= 7) "<<APPROVED>>" else "<<DISAPPROVED>>"

    private fun checkEmpty(name: String) {
        if (name.isBlank() || name.isEmpty()) throw RuntimeException("The value cannot be empty!").also { it.message }
    }

    fun askGrades() {
        print("Name student: ")
        val firtNameAluno: String = readln()
        checkEmpty(firtNameAluno)

        var totalGrades = 0
        val reader = Scanner(System.`in`)

        for (cont: Int in 1..4 ) {
            print("Enter the ${cont}º student's grade: ")
            totalGrades += reader.nextInt()
        }

        val average: Int = this.calculateAverage(totalGrades)
        println("Average student $firtNameAluno: $average | ${checkAverage(average)}")
    }
}

fun main() {
    Exercicio_11().apply {
        askGrades()
    }
}