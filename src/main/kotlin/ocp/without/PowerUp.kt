package ocp.without

abstract class PowerUp {
    abstract val basePower: Int
}

class Potion: PowerUp() {
    override val basePower: Int
        get() = 15
    val fat = 2
}

class EnergyDrink: PowerUp() {
    override val basePower: Int
        get() = 20
    val poisoningProbability = 30
}

class MedicalKit: PowerUp() {
    override val basePower: Int
        get() = 10
    val iron = 4
    val protein = 6
}

class Pills: PowerUp() {
    override val basePower: Int
        get() = 10

}
