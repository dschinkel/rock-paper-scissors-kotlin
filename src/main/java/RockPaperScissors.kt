import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class RockPaperScissors {

    fun play(playerOneInput: String, playerTwoInput: String): String {
        if (playerTwoInput == "scissors") {
            return "rock beats scissors"
        }
        return "tie"
    }

}