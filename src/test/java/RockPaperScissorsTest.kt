import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import kotlin.test.assertEquals

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class RockPaperScissorsTest {

    private val game = RockPaperScissors()

    @Test
    fun `same inputs produce a tie`() {
        val list = listOf("rock", "scissors", "paper")

        list.forEach {
            assertEquals(game.play(it, it), "tie")
        }
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

    @Test
    fun `scissors beat paper`() {
        val playerOneInput = "scissors"
        val playerTwoInput = "paper"

        var result = game.play(playerOneInput, playerTwoInput)

        assertEquals(result, "scissors beats paper")
    }
}