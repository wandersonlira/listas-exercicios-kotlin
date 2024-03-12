package lista_aula_facul

class JogoCraps {
    private fun playDice(): Int = (2..12).random()

    fun checkingPlays() {
        val firstPlay: Int = playDice()
        var countPlays = 1
        println("${countPlays}º Play! | Value of the dices: $firstPlay")

        when (firstPlay) {
            7, 11 -> println("Congratulations! you won the game of the first!!")
            2, 3, 12 -> println("<<CRAPS>> | You lost!!")
            else -> {
                var scoreGame: Int
                countPlays++
                do {
                    print("Click 'enter' to play: "); readln()
                    scoreGame = playDice()
                    println("Play nº${countPlays} | Value of the dices: $scoreGame")

                    if (scoreGame == firstPlay) {
                        println("<<WON>> | Value of the first play: $firstPlay == Play ${countPlays}º value: $scoreGame")
                        break
                    } else if (scoreGame == 7) {
                        println("<<LOST>> | Play nº${countPlays} | value: $scoreGame")
                    }
                    countPlays++
                } while (scoreGame != 7)
            }
        }
    }

}

fun main() {
    JogoCraps().also { it.checkingPlays() }
}