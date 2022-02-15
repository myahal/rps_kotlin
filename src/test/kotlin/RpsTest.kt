import org.junit.Test
import kotlin.test.assertEquals

class RpsTest {
    @Test
    fun rockVsScissors() {
        val result = Requests().play("rock", "scissors")

        assertEquals("Player 1 Wins", result)
    }
}