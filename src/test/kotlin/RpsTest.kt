import org.junit.Test
import kotlin.test.assertEquals

class RpsTest {
    @Test
    fun rockVsScissors() {
        val result = Requests().play(Throws.ROCK, Throws.SCISSORS)

        assertEquals(Result.P1_WINS, result)
    }

    @Test
    fun ScissorsVsRock() {
        val result = Requests().play(Throws.SCISSORS, Throws.ROCK)

        assertEquals(Result.P2_WINS, result)
    }

    @Test
    fun ScissorsVsPaper() {
        val result = Requests().play(Throws.SCISSORS, Throws.PAPER)

        assertEquals(Result.P1_WINS, result)
    }

    @Test
    fun PaperVsScissors() {
        val result = Requests().play(Throws.PAPER, Throws.SCISSORS)

        assertEquals(Result.P2_WINS, result)
    }

    @Test
    fun PaperVsRock() {
        val result = Requests().play(Throws.PAPER, Throws.ROCK)

        assertEquals(Result.P1_WINS, result)
    }

    @Test
    fun RockVsPaper() {
        val result = Requests().play(Throws.ROCK, Throws.PAPER)

        assertEquals(Result.P2_WINS, result)
    }
}