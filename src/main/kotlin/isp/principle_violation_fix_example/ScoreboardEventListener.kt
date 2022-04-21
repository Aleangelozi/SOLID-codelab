package isp.principle_violation_fix_example

interface ScoreboardEventListener {

    fun showGoalScored()
    fun showRedCard()
    fun showYellowCard()
    fun showPeriodStarted()
    fun showPeriodEnded()

}

interface FootballScoreboardEventListener {

    fun showGoalScored()
    fun showRedCard()
    fun showYellowCard()

}

class EventDispatcher {
    lateinit var listener: ScoreboardEventListener

    fun registerListener(listener: ScoreboardEventListener) {
        this.listener = listener
    }
}

//Because this will act as Buffer, it can take the damage of breaking the LSP
class FootballEventDispatcher: ScoreboardEventListener {

    private val dispatcher = EventDispatcher()

    init {
        dispatcher.registerListener(this)
    }
    lateinit var listener: FootballScoreboardEventListener

    fun registerListener(listener: FootballScoreboardEventListener) {
        this.listener = listener
    }

    override fun showGoalScored() {
        listener.showGoalScored()
    }

    override fun showRedCard() {
        listener.showRedCard()
    }

    override fun showYellowCard() {
        listener.showYellowCard()
    }

    override fun showPeriodStarted() {

    }

    override fun showPeriodEnded() {

    }
}