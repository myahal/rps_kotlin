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
        PlayRoundRequest(p1, p2, observer).play()
    }

}

class PlayRoundRequest(private val p1: Throws, private val p2: Throws, private val observer: Observer) {
    fun play() {
        if (tie()) {
            observer.tie()
            return
        }
        if (p1Wins()) {
            observer.p1Wins()
        } else {
            observer.p2Wins()
        }
    }

    private fun tie(): Boolean {
        return p1 == p2
    }

    private fun p1Wins(): Boolean {
        return p1 == Throws.ROCK && p2 == Throws.SCISSORS
                || p1 == Throws.SCISSORS &&  p2 == Throws.PAPER
                || p1 == Throws.PAPER && p2 == Throws.ROCK
    }
}