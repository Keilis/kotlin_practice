package kot

import java.time.Month
import kotlin.math.min

private var name: String? = null
private var lastName: String? = "lastName"
private var age: String? = ""


fun main() {
    // l1
    var length = (name?.length ?: 0) + (lastName?.length ?: 0) + (age?.length ?: 0)

    // l2
    var a = 30
    val food = if (a > 500) {
        a -= 500
        "pizza"
    } else if (a > 200) {
        a -= 200
        "500"
    } else {
        "null"
    }
    //  println("You can buy: $food, you have: $a")

    // l3

    val nameOfMonth = "March"

    val season = when (nameOfMonth) {
        "December", "January" -> {
            "Winter"
        }

        "July" -> {
            "Summer"
        }

        "September" -> {
            "Autumn"
        }

        "March", "April" -> {
            "Spring"
        }

        else -> {
            "No season"
        }
    }

    // l4
    val temp = 80
    val state = when {
        temp < 0 || temp > 110 -> "Hard"
        temp in 0..100 -> "Water"
        else -> "Gaz"
    }

    val t = 15
    val weather = false

    val action = when {
        (t in 12..18) && weather -> "walk"
        (t in 12..18) && !weather -> "read"
        else -> "sleep"
    }

    // l5

    val array = arrayOf(1, 2, 45, 76, 23)
    array[4] = 10

    val array2 = arrayOfNulls<Int>(10)
    array2[4] = null

    val listOfNumbers: MutableList<Int> = ArrayList()
    listOfNumbers.add(5)

    // l6
    val array3 = arrayOfNulls<Int?>(101)
    for (i in 0 until array3.size - 1) {
        array3[i] = i
    }

    for (i in 100 downTo 0 step 2) {
        //    println(i)
    }

    for (i in array3) {
        // println(i)
    }

    val array4 = arrayOfNulls<Int?>(101)
    for (i in array4.indices) {
        array4[i] = i
    }
    for ((index, i) in array4.withIndex()) {
        array4[index] = i?.times(2)
    }
    for (i in array4) {
        // println(i)
    }

    val array5 = arrayOfNulls<Int>(301)
    for (i in array5.indices) {
        array5[i] = i + 300
        // println(array5[i])
    }

    //for ((index, i) in (300..600).withIndex()) {
    //     array5[index] = i
    //  }

    for (i in array5.indices step 5) {
        //   println(array5[i])
    }

    // l7
    //println(max(5, 10))
    // println(symbol("KittyCat"))
    // println(sum(1, 2, 3, 4))

    val numbers = arrayOf(5, 6, 7, -2, 0, 4)
    val result = sort(numbers)
    for (i in result) {
        // println(i)
    }

    // l8
    //printInfo("Ivanov", "Ivan")
    //printInfo(patronymic = "Jovanovich", lastName = "Olegov")

    //  volume(10, 20, 30)

    //  println(volumeNormalMan(10, c = 20))

    //l9
    // println(sum("10", "twenty"))

    // val sum: (Int, Int) -> Int = {a, b -> a+b}
    // println(sum(2, 10))

    // val square: (Int) -> Int = {it*it}
    // println(square(2))

    val p: (Int, Int) -> Int = { a, b -> 2 * (a + b) }
    val name: (String) -> Unit = {}
    val array6: (Array<Int>) -> Array<Int> = {
        for (i in it.size - 2 downTo 0) {
            for (j in 0..i) {
                if (it[j] < it[j + 1]) {
                    val temp = it[j]
                    it[j] = it[j + 1]
                    it[j + 1] = temp
                }
            }
        }
        it
    }
    // println(p(10, 5))
    // println("Hi, " + name("Kate"))

    val sortedArray = array6(arrayOf(1, 2, 4, 10, 6, 8, -2))
    //  for (i in sortedArray) {
    //      println(i)
    //  }

    val sayHello: (String) -> Unit = { (println("Hi, $it")) }
    //   sayHello("Tom")

    // l10
    val listOfNumbers1 = mutableListOf<Int>()
    for (i in 0..99) {
        listOfNumbers1.add(i)
    }
    val listOfEvenNumber1 = listOfNumbers1.filter { it % 3 == 0 }
    for (i in listOfEvenNumber1) {
        //   println(i)
    }

    val listOfName = mutableListOf<String>()
    for (i in 0..5) {
        listOfName.add("A + $i")
        listOfName.add("B+$i")
    }

    val listOfAName = listOfName.filter { it.substring(0, 1) == "A" }
    val listOfAName2 = listOfName.filter { it.startsWith("B") }
    for (i in listOfAName) {
        //  println(i)
    }
    for (i in listOfAName2) {
        //  println(i)
    }

    val numbers7 = (0..100).toList()
    val doubleNumbers7 = numbers7.map { it * 2 }
    for (i in doubleNumbers7) {
        //   println(i)
    }
    val employees = numbers7.map { "Employee №$it" }
    for (employee in employees) {
        //   println(employee)
    }

    val array9 = arrayOf(8, 10, -1, 66, 4)
    val sortedArray9 = array9.sorted()
    for (i in sortedArray9) {
        //  println(i)
    }
    val sortedArray10 = array9.sortedArrayDescending()
    for (i in sortedArray10) {
        //  println(i)
    }

    //val numbers8 = (0..1000).toList()
    val numbers8 = mutableListOf<Int>()
    for (i in 0..100) {
        numbers8.add((Math.random() * 100).toInt())
    }
    val numbers3Or5 = numbers8.filter { it % 3 == 0 || it % 5 == 0 }.map { it * it }.sortedDescending().map { "$it" }
    for (i in numbers3Or5) {
        //   println(i)
    }

    // l11
    val array11 = (0..1000).toList()
    val employee = array11.map { "Employee №$it" }
    val first70 = employee.dropLast(930)
    for (employee in first70) {
        //  println(employee)
    }

    val first30 = employee.take(30)
    for (employee in first30) {
        //   println(employee)
    }

    //lazy initialization
    val array22 = generateSequence(0) {
        //   println("Generalized ${it + 2}")
        it + 2
    }
    val cutArray22 = array22.take(20)
    for (i in cutArray22) {
        //  println(i)
    }
//    val array221 = generateSequence(){
//       (Math.random()*100).toInt()} - бесконечно случайные числа
//    val array223 = generateSequence("A"){
//        println("Generalized ${it+1}")
//        it + 1} - алфавит

    val employeesL11 = generateSequence(0) { it + 1 }
    val employeesL11First100 = employeesL11.take(100)
    for (i in employeesL11First100) {
        //   println("Employee ${i + 1}")
    }

//    val employeesL112 = generateSequence("Employee 1") {
//        val index = it.substring(9).toInt()
//        "Employee ${index+1}"
//    }
//    val employeesL112First100 = employeesL112.take(100)
//    for (i in employeesL112First100) {
//        println(i)
//    }

    //l12
    val names12 = mutableListOf<String>()
    val phones12 = mutableListOf<Long>()
    for (i in 0..1000) {
        names12.add("Name$i")
        phones12.add(79_000_000_000 + (Math.random() * 1_000_000_000).toLong())
    }
    val users12 = names12.zip(phones12)
    for (user in users12) {
        //  println("Name ${user.first} Phone ${user.second}")
    }

    val namesLastNames12 = mutableListOf<String>()
    for (i in 0..10) {
        namesLastNames12.add("LastName$i Name$i")
    }

    val names121 = namesLastNames12.map { it.substringAfter(" ") }
    val lastNames121 = namesLastNames12.map { it.substringBefore(" ") }
    val users1211 = names121.zip(lastNames121)
    //val users1211 = namesLastNames12.map{ Pair(it.substringAfter(""), it.substringBefore(" "))} - OOП

    for (user in users1211) {
        // println("Name ${user.first} LastName ${user.second}")
    }

    //l13
    val revenueByWeek = listOf(
        listOf(8, 6, 5, 3, 1),
        listOf(1, 4, 2, 7, 9),
        listOf(5, 4, 3, 2, 1),
        listOf(1, 2, 3, 4, 5)
    )
//    val total = mutableListOf<Int>()
//    revenueByWeek.map {
//        for (i in it) {
//            total.add(i)
//        }
//    } - or
//    val total = revenueByWeek.flatMap { it } - or
    val total = revenueByWeek.flatten()
    val average = total.average()
    //   println(average)

//val data = mutableMapOf<String, List<Int>>()
//    data["File 1"] = listOf(15, 20, 30, 10, 8)
//    data.put("File 2", listOf(1, 2, 70, 10, 0))
//    data.put("File 3", listOf(5, 75, 38, 19, 77))

    val data = mapOf(
        Pair("File 4", listOf(15, 20, 30, 10, 8)),
        "File 1" to listOf(15, -20, 30, 10, 8),
        "File 2" to listOf(1, 2, 70, 10, 0),
        "File 3" to listOf(5, 75, 38, 19, 77)
    )
    //val average13 = data.flatMap { it.value }.average() - без проверки на отрицательные зн.
    val average13 = data
        .filter { it.value.all { it > 0 } }//с проверкой all - все элементы устраивают, any - хоть один .filterNot{ it.value.any { it < 0 } }
        .flatMap { it.value }
        .average()
    // println(average13)

    //l14 - функции высшего порядка
    val data14 = mapOf(
        "January" to listOf(100, 100, 100, 100),
        "February" to listOf(200, 200, -190, 200),
        "March" to listOf(300, 180, 300, 100),
        "April" to listOf(250, -250, 100, 300),
        "May" to listOf(200, 100, 400, 300),
        "June" to listOf(200, 100, 300, 300)
    )
    //printInfoHW(data14)

    // printInfoCL(data14)


    //l16
    val result16 = modifyString("hi") { it.toUpperCase() }
    //  println(result16)

    val example16 = (0..100).toList()
    array16List(example16) {
       // println(it.sum())
    }
    //если функцию ВП не объявить как inline, то будет создан объект анонимного класса,
    // а потом метод, чтобы предотвратить это и улучшить производительность

    //l17 - Extension-функции

    val age17 = 5
    if (isAge17Valid (age17)) {
       // println("Valid too")
    }
    if (isAge17Valid (age17)) {
      //  println("Valid")
    }
    if (age17.isAge17Valid1()) {
       // println("Valid to 2")
    }

    val a17 = 5
    //println(a17.isPositive())

    val name17 = ""
    if (name17.isNotEmpty()) {
      //  println("Good")
    }

    val numb17 = 10
    // println(numb17.isUsual())

val list17 = listOf<Int>()
    myWith(list17) {
        sum()
        average()
    }

    val string17 = "hi"
    myWith(string17) {
        println(toUpperCase())
    }

    val  obj = mutableMapOf<String, String>()
    myWith(obj) {
        keys
        values
    }


}

// fun myWith (list: List<Int>, operation: List<Int>.() -> Unit) {
//list.operation()
//}

//fun myWith (string: String, operation: String.() -> Unit) {
//    string.operation()
//}
//чтобы не писать миллион перегрузок вводим класс Т, который будет
//сам решать какой класс выбрать, можно даже 2 параметра ввести, где получаем на ввод Т, а на выход Р
inline fun<T> myWith(list: T, operation: T.() -> Unit) {
    list.operation()
}

inline fun<T, R> myWith2(list: T, operation: T.() -> R) : R {
   return list.operation()
}

fun Int.isUsual() : Boolean{
    if (this <= 3 ) return true
    for ( i in 2 until this) {
        if (this % i == 0) return false
    }
    return true
}

fun Int.isPositive() = this >= 0

fun isAge17Valid (age: Int) = age in 6..100

fun Int.isAge17Valid1() = this in 6..100

inline fun array16List(array16: List<Int>, operator: (List<Int>) -> Unit) {
    operator(array16)
}

fun modifyString(string: String, modify: (String) -> String): String {
    return modify(string)
}

fun printInfoHW(data14: Map<String, List<Int>>) {
    val average14 = data14
        .filter { it.value.all { it >= 0 } }
        .flatMap { it.value }
        .average()

//    val monthAverage14 = data14
//        .filter { it.value.all { it >= 0 } }
//        .mapValues { it.value.sum() }
//        .values.max()
    val monthMax14 = data14
        .filter { it.value.all { it >= 0 } }
        .maxBy { it.value.sum() }

    val monthMin14 = data14
        .filter { it.value.all { it >= 0 } }
        .minBy { it.value.sum() }

    val mistakes14 = data14
        .filter { !(it.value.all() { it >= 0 }) }

    println("Cp. Выручка в неделю: $average14")
    println("Cp. Выручка в месяц: ${average14 * 4}")

    println("Макс. выручка в месяц: ${monthMax14.value.sum()}")
    println("Макс. была в месяце: ${monthMax14.key}")

    println("Мин. выручка в месяц: ${monthMin14.value.sum()}")
    println("Мин. была в месяце: ${monthMin14.key}")


    println("Ошибки в следующих месяцах: ${mistakes14.keys}")
}


fun printInfoCL(data: Map<String, List<Int>>) {
    val validDate = data.filterNot { it.value.any { it < 0 } }
    val averageWeek = validDate.flatMap { it.value }.average()

    val listOfSum = validDate.map { it.value.sum() }
    val max = listOfSum.max()
    val min = listOfSum.min()
    val averageMonth = listOfSum.average()

    val maxMonth = validDate.filter { it.value.sum().equals(max) }.keys
    val minMonth = validDate.filter { it.value.sum() == min }.keys

    println("Cp. Выручка в неделю: $averageWeek")
    println("Cp. Выручка в месяц: $averageMonth")

    println("Макс. выручка в месяц: $max")
    print("Макс. была в месяце: ")
    for (month in maxMonth) {
        print("$month ")
    }
    println()
    println("Мин. выручка в месяц: $min")
    print("Мин. была в месяце: ")
    for (month in minMonth) {
        print("$month ")
    }
    val errorMonths = data.filter { it.value.any { it < 0 } }.keys
    println("\nОшибки в следующих месяцах: $errorMonths")


}

fun max(a: Int, b: Int) = if (a > b) a else b

fun symbol(a: String) = a.substring(0, min(5, a.length))

fun sum(vararg numbers: Int): Int {
    var result = 0
    for (num: Int in numbers) {
        result += num
    }
    return result
}

fun sort(numbers: MutableList<Int>): List<Int> {
    for (i in 1 until numbers.size) {
        for (j in numbers.size - 1 downTo i) {
            if (numbers[j] < numbers[j - 1]) {
                val temp = numbers[j]
                numbers[j] = numbers[j - 1]
                numbers[j - 1] = temp
            }
        }
    }
    return numbers
}

fun sort(vararg numbers: Int) = sort(numbers.toMutableList())
fun sort(numbers: Array<Int>) = sort(numbers.toMutableList())

fun printInfo(lastName: String = "", name: String = "", patronymic: String = "") {
    if (lastName.isNotEmpty()) {
        println("Lat Name: $lastName")
    }
    if (name.isNotEmpty()) {
        println("Name: $name")
    }
    if (patronymic.isNotEmpty()) {
        println("Patronymic: $patronymic")
    }
}

//fun printInfo(lastName: String, name: String){
//  printInfo(lastName, name, "")
//}

fun volume(a: Int, b: Int? = null, c: Int? = null) {
    if (b == null && c == null) {
        println(a * a * a)
    } else if (b == null || c == null) {
        if (b == null) {
            println(a * c!! * a)
        } else {
            println(a * b!! * a)
        }
    } else {
        println(a * b!! * c!!)
    }
}

fun volumeNormalMan(a: Int, b: Int = a, c: Int = a) = a * b * c

fun sum(a: String, b: String): Int {
    return try {
        val numA = a.toInt()
        val numB = b.toInt()
        numA + numB
    } catch (e: Exception) {
        0
    }
}