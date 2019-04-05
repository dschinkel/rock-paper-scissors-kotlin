class RockPaperScissors {

    fun play(playerOneInput: String, playerTwoInput: String): String? {
        val (winner, loser) = getWinnerLoserCombination(playerOneInput, playerTwoInput)
        return winnerMessage(winner, loser)
    }

    private fun isATie(winner: String, loser: String): Boolean {
        return winner == loser
    }

    private fun getWinnerLoserCombination(playerOneInput: String, playerTwoInput: String): Pair<String, String> {
        return if (isPlayerOneWInner(playerOneInput, playerTwoInput))
            Pair(playerOneInput, playerTwoInput)
        else
            Pair(playerTwoInput, playerOneInput)
    }

    private fun isPlayerOneWInner(playerOneInput: String, playerTwoInput: String): Boolean {
        return (playerOneInput == "rock" && playerTwoInput == "scissors") ||
                (playerOneInput == "paper" && playerTwoInput == "rock") ||
                (playerOneInput == "scissors" && playerTwoInput == "paper")
    }

    private fun winnerMessage(winner: String, loser: String) =
            if (isATie(winner, loser))
                "tie"
            else getWinningDisplayMessage(winner, loser)

    private fun getWinningDisplayMessage(winner: String, loser: String) = "$winner beats $loser"
}