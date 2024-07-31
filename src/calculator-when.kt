import java.util.Scanner

fun main() {
    var read = Scanner(System.`in`)

    println("Enter first number :")
    var firstnumber = read.nextInt()

    println("Enter second number :")
    var secondnumber = read.nextInt()

    println("Enter operator(+,-,/,*,%): ")
    var choice = read.next()[0]

    var answer = when(choice){
        '+' -> firstnumber + secondnumber
        '-' -> firstnumber - secondnumber
        '*' -> firstnumber + secondnumber
        '/' -> firstnumber + secondnumber
        '%' -> firstnumber % secondnumber
        else -> "Invalid operator"
    }
    println("The answer is $answer")
}


