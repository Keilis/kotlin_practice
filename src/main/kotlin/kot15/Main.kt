package kot15

var name: String? = null

val list15: MutableList<Int>? = mutableListOf<Int>()

fun main() {

    //обращение к переменной, в случае null ничего, в случае не null работа условия
    name?.let {
        if (it.length > 5) {
            println("Hi")
        }
    }

    val list = mutableListOf<Int>()
//    for (i in 0 until 1000) {
//        list.add((Math.random()*100).toInt())
//    }
//    println("sum ${list.sum()} average ${list.average()} max ${list.max()} min ${list.min()} 1. ${list.first()} Last. ${list.last()}")

    with(list) {
        for (i in 0 until 1000) {
            add((Math.random() * 100).toInt())
        }
//        println("sum ${sum()} average ${average()} max ${max()} min ${min()} 1. ${first()} Last. ${last()}")
    }
    list15?.let {
        with(list15) {
            for (i in 0 until 1000) {
                add((Math.random() * 100).toInt())
            }
            val result = filter { it % 2 == 0 }.take(10)

            for (i in result) {
                println(i)
            }
        }
    }
}