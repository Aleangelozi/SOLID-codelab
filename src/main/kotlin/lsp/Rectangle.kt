package lsp


open class Rectangle(protected var x: Int, protected var y:Int) {

    open fun changeX(x: Int) {
        this.x = x
    }

    open fun changeY(y: Int) {
        this.y = y
    }
}

/* Square class analysis against LSP Rules
*Method Argument types --OK
* Return types --OK
* Exceptions --OK
* Class Invariants --OK
* History Constraints -- Violated
* Preconditions --OK
* Postconditions --OK */
class Square(x: Int, y: Int) : Rectangle(x, y) {

    override fun changeX(x: Int) {
        this.x = x
        this.y = x
    }

    override fun changeY(y: Int) {
        this.y = y
        this.x = y
    }

}