enum class Throws {
    ROCK, SCISSORS
}

enum class Result {
    P1_WINS, P2_WINS
}

class Requests {
    fun play(p1: Throws, p2: Throws): Result {
        if (p1 == Throws.ROCK) {
            return Result.P1_WINS
        }
        return Result.P2_WINS
    }
}