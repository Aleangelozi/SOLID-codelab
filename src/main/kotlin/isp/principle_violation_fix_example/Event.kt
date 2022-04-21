package isp.principle_violation_fix_example

class FootballScoreboard : FootballScoreboardEventListener {

    private val dispatcher = FootballEventDispatcher()

    init {
        dispatcher.registerListener(this)
    }

    override fun showGoalScored() {
        println("goal scored")
    }

    override fun showRedCard() {
        println("red card")
    }

    override fun showYellowCard() {
        println("yellow card")
    }

}

class BasketBallScoreboard: ScoreboardEventListener {

    private val dispatcher = EventDispatcher()

    init {
        dispatcher.registerListener(this)
    }

    override fun showPeriodStarted() {
        println("period started")
    }

    override fun showPeriodEnded() {
        println("period ended")
    }

    override fun showGoalScored() {
        TODO("Not yet implemented")
    }

    override fun showRedCard() {
        TODO("Not yet implemented")
    }

    override fun showYellowCard() {
        TODO("Not yet implemented")
    }

}