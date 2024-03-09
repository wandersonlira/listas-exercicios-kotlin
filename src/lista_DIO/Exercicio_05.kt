package lista_DIO

//5 - Faça um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário, calcule quantos salários mínimos esse
//usuário ganha e imprima na tela o resultado. (Base para o Salário mínimo R$ 1.293,20).


private const val BASIC_SALARY: Double = 1.29320
class Exercicio_05 {

    fun readSalary(salaryUser: Double) =
        println("Amount in basic salary: ${salaryUser/BASIC_SALARY}")
}

fun main() {
    Exercicio_05().apply { readSalary(3.45689) }

}