package lista_DIO

//7 - Faça um algoritmo que leia dois valores booleanos (lógicos) e determine se ambos são VERDADEIRO ou FALSO.

class Exercicio_07 {
    fun readBoolean(booleanoA: Boolean, booleanoB: Boolean): Boolean =
        if (booleanoA == booleanoB) {
            println("<<TRUE>> They are equals! Value A: $booleanoA, Value B: $booleanoB")
            true
        } else {
            println("<<FALSE>> Are different!  Value A: $booleanoA, Value B: $booleanoB")
            false
        }
}

fun main() {
    Exercicio_07().also { it.readBoolean(booleanoA = false, booleanoB = true) }
}