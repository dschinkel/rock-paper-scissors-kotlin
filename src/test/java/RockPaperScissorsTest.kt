import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import kotlin.test.assertEquals

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class RockPaperScissorsTest {

    private val game = RockPaperScissors()

    @Test
    fun `same inputs produce a tie`() {
        val playerOneInput = "rock"
        val playerTwoInput = "rock"

        val result = game.play(playerOneInput, playerTwoInput)

        assertEquals(result, "tie")
    }


    @Test
    fun `rock beats scissors`() {
        val playerOneInput = "rock"
        val playerTwoInput = "scissors"

        val result = game.play(playerOneInput, playerTwoInput)

        assertEquals(result, "rock beats scissors")
    }

    @Test
    fun `paper beats rock`() {
        val playerOneInput = "paper"
        val playerTwoInput = "rock"

        var result = game.play(playerOneInput, playerTwoInput)

        assertEquals(result, "paper beats rock")
    }
}