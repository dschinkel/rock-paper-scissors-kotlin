import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class RockPaperScissors {

    @Test
    fun `same inputs produce a tie`(){
        val playerOneInput = "rock"
        val playerTwoInput = "rock"

        val result = play(playerOneInput, playerTwoInput)

        assertEquals(result, "tie")
    }

    private fun play(playerOneInput: String, playerTwoInput: String): String {
        return "tie"
    }




}