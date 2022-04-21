package ocp.with

import kotlin.random.Random

class Player {

    var health: Int = 100

    fun getPowerUp(powerUp: PowerUp){

        health = powerUp.consume(health)
    }
}