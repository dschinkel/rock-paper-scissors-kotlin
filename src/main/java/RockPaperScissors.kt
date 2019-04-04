import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class RockPaperScissors {

    fun play(playerOneInput: String, playerTwoInput: String): String? {
        val message = "$playerOneInput beats $playerTwoInput"

        if(playerOneInput == playerTwoInput) {
            return "tie"
        }

        if (playerOneInput == "rock") {
            return message
        }

        if(playerOneInput == "paper"){
            return message
        }

        return null
    }

}