enum class Throws {
    ROCK, SCISSORS, PAPER
}

interface Observer {
    fun p1Wins()
    fun p2Wins()
    fun tie()
}

class Requests {
    fun play(p1: Throws, p2: Throws, observer: Observer): Unit {
        if (tie(p1, p2)) {
            observer.tie()
            return
        }
        if (p1Wins(p1, p2)) {
            observer.p1Wins()
        } else {
            observer.p2Wins()
        }
    }

    private fun tie(p1: Throws, p2: Throws): Boolean {
        return p1 == p2
    }

    private fun p1Wins(p1: Throws, p2: Throws): Boolean {
        return p1 == Throws.ROCK && p2 == Throws.SCISSORS
                || p1 == Throws.SCISSORS &&  p2 == Throws.PAPER
                || p1 == Throws.PAPER && p2 == Throws.ROCK
    }
}