enum class Throws {
    ROCK, SCISSORS, PAPER
}

enum class Result {
    P1_WINS, P2_WINS
}

class Requests {
    fun play(p1: Throws, p2: Throws): Result {
        if (p1 == Throws.ROCK && p2 == Throws.SCISSORS
            || p1 == Throws.SCISSORS &&  p2 == Throws.PAPER
            || p1 == Throws.PAPER && p2 == Throws.ROCK) {
            return Result.P1_WINS
        }
        return Result.P2_WINS
    }
}