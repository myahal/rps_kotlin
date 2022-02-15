import org.junit.Test
import kotlin.test.assertEquals

class RpsTest {
    @Test
    fun rockVsScissors() {
        val result = Requests().play(Throws.ROCK, Throws.SCISSORS)

        assertEquals(Result.P1_WINS, result)
    }
}