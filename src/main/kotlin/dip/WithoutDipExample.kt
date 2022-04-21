package dip

class C() {

    val d = D()
    init {
        d.doSomething()
    }
}

class D {

    fun doSomething() {
        println("Printing from class B")
    }

}

fun main() {
    val c = C()
}
