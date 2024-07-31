class Person{
    //properties/attributes/characteristics
    var name = "John"
    var age = 34

    //Behaviour/method/function
    fun sound(){
        println("Person is speaking")
    }
}

fun main() {
    var teacher = Person() //Creating an object
    println(teacher.age)
    println(teacher.name)
    teacher.sound()
    var student = Person()
    var accountant = Person()



}