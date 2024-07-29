fun main() {
    var day = 4
    var result = when(day){
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        else -> "Invalid day of the week"
    }
    println("The day of the week is $result")


}