package isp.principle_violation_example

import isp.principle_violation_fix_example.ScoreboardEventListener

interface ScoreboardEventListener {

    fun showGoalScored()
    fun showRedCard()
    fun showYellowCard()
    fun showPeriodStarted()
    fun showPeriodEnded()

}

class EventDispatcher {
    lateinit var listener: ScoreboardEventListener

    fun registerListener(listener: ScoreboardEventListener) {
        this.listener = listener
    }
}