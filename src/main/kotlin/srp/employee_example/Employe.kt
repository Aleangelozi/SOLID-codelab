package srp.employee_example
/*A example of a class tha doesn't observe the Single Responsibility Principle,
 *more than one department could be affected by changes on  this class,
 * and accordingly to the srp we should minimize the people who the change would affect.*/
class Employe {

    // Changes in this method could impact the FO department
    fun calculatePay() {
        // ...
    }

    // Change in this method could impact the HR department
    fun reportHours() {
        // ...
    }

    // Changes in this method could impact the TO department
    fun save() {
        // ...
    }
}