enum class Throws {
    ROCK, SCISSORS
}

enum class Result {
    P1_WINS
}

class Requests {
    fun play(p1: Throws, p2: Throws): Result {
        return Result.P1_WINS
    }
}