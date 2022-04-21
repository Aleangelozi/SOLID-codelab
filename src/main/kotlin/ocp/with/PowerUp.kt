package ocp.with

import kotlin.random.Random

abstract class PowerUp {
    abstract val basePower: Int

    abstract fun consume(initialHealth: Int): Int
}

class Potion: PowerUp() {
    override val basePower: Int
        get() = 15

    override fun consume(initialHealth: Int): Int {
        return initialHealth + basePower - fat
    }

    private val fat = 2
}

class EnergyDrink: PowerUp() {
    override val basePower: Int
        get() = 20

    override fun consume(initialHealth: Int): Int {
        var healthToReturn = initialHealth + basePower

        if (Random.nextInt(100) < poisoningProbability)
            healthToReturn = 5

        return healthToReturn
    }

    private val poisoningProbability = 30
}

class MedicalKit: PowerUp() {
    override val basePower: Int
        get() = 10

    override fun consume(initialHealth: Int): Int {
        return initialHealth + basePower * protein + protein +iron
    }

    private val iron = 4
    private val protein = 6
}

class Pills: PowerUp() {
    override val basePower: Int
        get() = 10

    override fun consume(initialHealth: Int): Int {
        return initialHealth + basePower
    }

}
