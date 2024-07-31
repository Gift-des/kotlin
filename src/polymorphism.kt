//parent class
open class Shape{
    open fun draw(){
        println("Drawing a shape")
    }
    //Child classes
    class Rectangle:Shape(){
        override fun draw(){
            println("Drawing a rectangle")
        }
    }
    class Circle:Shape(){
        override fun draw(){
            println("Drawing a Circle")
        }
    }
}

fun main() {

    var myShape =Shape()
    myShape.draw()

    var myCircle =Shape.Circle()
    myCircle.draw()

    var myRectangle =Shape.Rectangle()
    myRectangle.draw()
}