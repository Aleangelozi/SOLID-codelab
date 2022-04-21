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

class BasketBallScoreboard: BasketballBoardEventListener {

    private val dispatcher = BasketballEventDispatcher()

    init {
        dispatcher.registerListener(this)
    }

    override fun showPeriodStarted() {
        println("period started")
    }

    override fun showPeriodEnded() {
        println("period ended")
    }

}