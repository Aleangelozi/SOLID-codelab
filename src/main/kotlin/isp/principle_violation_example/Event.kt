package isp.principle_violation_example

import isp.principle_violation_fix_example.EventDispatcher
import isp.principle_violation_fix_example.ScoreboardEventListener

class FootballScoreboard : ScoreboardEventListener {

    private val dispatcher = EventDispatcher()

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

    override fun showPeriodStarted() {

    }

    override fun showPeriodEnded() {

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