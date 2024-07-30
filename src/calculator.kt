import com.sun.org.apache.xalan.internal.lib.ExsltSets.difference
import java.lang.Integer.sum
import java.util.Scanner

fun main() {
    add(12,3)
    difference(26,10)
    product(2,4)
    quotient(78,3)


}

fun difference(num1: Int,num2: Int){
    println("The difference is "+(num1-num2))
}
fun add(num1: Int,num2: Int){
    println("The sum is "+(num1+num2))

}

fun product(num1: Int, num2: Int) {
    println("The product is "+(num1*num2))

}
fun quotient(num1: Int,num2: Int){
    println("The quotient is "+(num1/num2))
}