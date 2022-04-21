package dip

class A(b: BIf) {

    init {
        b.doSomething()
    }
}

class B: BIf {

    override fun doSomething() {
        println("Printing from class B")
    }

}

fun main() {
    val b = B()
    val a = A(b)
}
