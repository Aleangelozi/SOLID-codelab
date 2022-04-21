package isp

interface BasicScoreboardIf {

    fun showMatchStarted()
    fun showMatchFinished()
}

interface FootballScoreboardIf {
    fun showGoalScored()
}

interface BasketballScoreboardIf {
    fun showPeriodStarted()
    fun showPeriodEnded()
}

class FootballScoreboard: BasicScoreboardIf, FootballScoreboardIf {
    override fun showMatchStarted() {
        println("Football match started")
    }

    override fun showMatchFinished() {
        println("Football match ended")
    }

    override fun showGoalScored() {
        println("Goal scored")
    }

}

class TennisScoreboard: BasicScoreboardIf {
    override fun showMatchStarted() {
        println("Tennis match started")
    }

    override fun showMatchFinished() {
        println("Tennis match ended")
    }

}

class BasketballScoreboard: BasicScoreboardIf, BasketballScoreboardIf {
    override fun showMatchStarted() {
        println("Basketball match started")
    }

    override fun showMatchFinished() {
        println("Basketball match ended")
    }

    override fun showPeriodStarted() {
        println("Basketball period started")
    }

    override fun showPeriodEnded() {
        println("Basketball period ended")
    }

}