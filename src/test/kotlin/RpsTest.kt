import org.junit.Before
import org.junit.Test
import kotlin.test.assertTrue

class ObserverSpy: Observer {
    var p1WinsCalled = false
    var p2WinsCalled = false
    var tieCalled = false

    override fun p1Wins() {
        p1WinsCalled = true
    }

    override fun p2Wins() {
        p2WinsCalled = true
    }

    override fun tie() {
        tieCalled = true
    }
}

class RpsTest {
    lateinit var observer: ObserverSpy
    @Before
    fun setUp() {
        observer = ObserverSpy()
    }

    @Test
    fun rockVsScissors() {
        Requests().play(Throws.ROCK, Throws.SCISSORS, observer)

        assertTrue(observer.p1WinsCalled)
    }

    @Test
    fun ScissorsVsPaper() {
        Requests().play(Throws.SCISSORS, Throws.PAPER, observer)

        assertTrue(observer.p1WinsCalled)
    }

    @Test
    fun PaperVsRock() {
        Requests().play(Throws.PAPER, Throws.ROCK, observer)

        assertTrue(observer.p1WinsCalled)
    }

    @Test
    fun ScissorsVsRock() {
        Requests().play(Throws.SCISSORS, Throws.ROCK, observer)

        assertTrue(observer.p2WinsCalled)
    }


    @Test
    fun PaperVsScissors() {
        Requests().play(Throws.PAPER, Throws.SCISSORS, observer)

        assertTrue(observer.p2WinsCalled)
    }


    @Test
    fun RockVsPaper() {
        Requests().play(Throws.ROCK, Throws.PAPER, observer)

        assertTrue(observer.p2WinsCalled)
    }

    @Test
    fun RockVsRock() {
        Requests().play(Throws.ROCK, Throws.ROCK, observer)

        assertTrue(observer.tieCalled)
    }

    @Test
    fun PaperVsPaper() {
        Requests().play(Throws.PAPER, Throws.PAPER, observer)

        assertTrue(observer.tieCalled)
    }

    @Test
    fun ScissorsVsScissors() {
        Requests().play(Throws.SCISSORS, Throws.SCISSORS, observer)

        assertTrue(observer.tieCalled)
    }
}