import kotlin.math.round


fun main(){
    val elementsAB= listOf("a","b","b")
    println(percentageA(elementsAB))
}

fun percentageA(inputList: List<String>): Double {
    var repetitionA = 0
    for (element in inputList) {
        when (element) {
            "a" -> repetitionA++
            "b" -> continue
            else -> return (-1).toDouble()
        }
    }
    return Math.round(((repetitionA * 100) /inputList.size.toDouble()) * 10.0) / 10.0
}