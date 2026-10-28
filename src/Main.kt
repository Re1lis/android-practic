
fun main(){
    val a = intArrayOf(3, 7, 1, 9, 4, 6, 4, 3, 4,5 ,6)
    val b = IntArray(a.size)
    val numForSearch: Int = readln().toInt()
    var counter = 0

    var numArray = a[0]
    var sizeArray = a.size - 1
    var i = 0


    for (p in 0..a.size - 1){
        b[p] = a[a.size - p - 1]
    }

    for (j in a.indices){
        if (a[j] == numForSearch) {
            println(j)
            break
        }
        if (a[j] != numForSearch){
            counter++
        }
    }

    while (i < a.size / 2)  {
        numArray = a[i]

        a[i] = a[sizeArray]

        a[sizeArray] = numArray

        sizeArray -= 1
        i++
    }

    if (counter == a.size){
        println("-1")
    }

    println(b.contentToString())

    print(a.contentToString())
}

//fun main(){
//    val a = intArrayOf(3, 7, 1, 9, 4, 6)
//    val b = IntArray(a.size)
//
//    var minNum: Int = a[0]
//    var indexForMinNum: Int = 0
//    var countNumUp5 = 0
//    var middleNum: Double = 0.0
//
//    for (i in a.indices){
//        if (a[i] < minNum){
//            minNum = a[i]
//            indexForMinNum = i
//        }
//
//
//        if (a[i] > 5) countNumUp5 += 1
//
//        middleNum += a[i]
//    }
//
//    var numForReverse: Int = 0
//
//    for (j in a.size - 1 downTo 0 ){
//
//        b[numForReverse] = a[j]
//
//        numForReverse += 1
//    }
//
//    middleNum /= a.size
//
//    println("$minNum - минимальное число, его индекс - $indexForMinNum")
//    println(countNumUp5)
//    println(middleNum)
//    println(a.contentToString())
//    println(b.contentToString())
//}

//fun main(){
//    val a = intArrayOf(5, 8, 2, 9, 4)
//
//    for (i in a.indices){
//        print("$i: ${a[i]} ")
//    }
//
//    a[4] = 100
//
//    println("\n${a.contentToString()}")
//
//    var i = 0
//    var sum = 0
//    var maxNumInArray: Int = a[0]
//
//    while (i <= a.size - 1){
//        sum += a[i]
//
//        if (maxNumInArray < a[i]){
//            maxNumInArray = a[i]
//        }
//
//        i++
//    }
//
//    for (j in a.size - 1 downTo 0) print ("${a[j]} ")
//    println()
//    for (h in 0..a.size - 1 step 2) print ("${a[h]} ")
//    println()
//    println(maxNumInArray)
//
//    println(sum)
//}

//fun main(){
//    for (i in 1..10){
//        if (i == 5) continue
//        println(i * i)
//    }
//}


//fun main(){
//    print("Введи цифру - ")
//    val num = readln().toInt()
//
//    when (num){
//        1 -> println("Понедельник")
//        2 -> println("Вторник")
//        3 -> println("Среда")
//        4 -> println("Четверг")
//        5 -> println("Пятница")
//        6 -> println("Суббота")
//        7 -> println("Воскресенье")
//        else -> println("В неделе 7 дней")
//    }
//}

//fun main(){
//    print("Введите цифру - ")
//    val number = readln().toInt()
//
//    if (number % 2 == 0) {
//        println("Четное")
//    } else {
//        println("Нечетное")
//    }
//}

//fun main(){
//    print("Введи слово: ")
//    val word = readln()
//
//    val aInWord = "а" in word
//
//    val catInWord = "кот" in word
//    val catInWordSecondVar = word.contains("кот", ignoreCase = true)
//
//    print("Есть ли в слове буква 'а': $aInWord\nЕсть ли 'кот' в слове: $catInWord\nЕсть ли 'кот' или 'Кот' в слове второй способ: $catInWordSecondVar\n")
//}

//const val DISCOUNT: Double = 0.07
//fun main(){
//    print("Введите цену: ")
//    val price = readln().toInt()
//
//    print("Введите количество: ")
//    val amount = readln().toInt()
//
//    val sumWithoutDiscount = price * amount
//
//    val sumWithDiscount = (sumWithoutDiscount - sumWithoutDiscount * DISCOUNT).toInt()
//
//    print("Цена без скидки: $sumWithoutDiscount\nЦена со скидкой: $sumWithDiscount")
//}


//fun main(){
//    val number: Int = readln().toInt()
//
//    val isEven = number % 2 == 0 // задает true или false, если есть сравнение
//
//    val isInRange = number in 1..100
//
//    val isDivisibleBy3And5 = number % 3 == 0 && number % 5 == 0
//
//    val isLess0OrMore1000 = number < 0 || number > 1000
//
//    println("Четное: $isEven, \nЕсть ли в диапозоне от 1 до 100: $isInRange, \nДелится и на 3 и на 5: $isDivisibleBy3And5, \nМеньше 0 или больше 1000: $isLess0OrMore1000")
//}


//fun main(){
//    print("Введи количество секунд: ")
//    val seconds = readln().toInt() // переводим строку, так как изначально она у нас String
//
//    val hours = seconds / 3600
//
//    val minutes = seconds / 60 % 60  // берем минуты сверх часов
//
//    val secs = seconds % 60
//
//    print("$seconds сек = $hours ч $minutes мин $secs сек")
//}

//fun main(){
//    val  price: Int = 1500
//    val discount: Double = 0.155
//
//    val afterPrice: Int = (price - price * discount).toInt()
//
//    println(afterPrice)
//}


//fun main(){
//    val milliard = 3_000_000_000
//
//    println(milliard)
//}

//fun main(){
//    val name: String = "Kotlin"
//    var level: Int = 1
//    var health: Double = 100.0
//    var isAlive: Boolean = true
//    val classInWorld: Char = 'M'
//
//    println("Герой $name - уровень $level - здоровье $health - жив: $isAlive - класс $classInWorld")
//
//    level++
//    health = 94.3
//
//    println("Герой $name - уровень $level - здоровье $health - жив : $isAlive - класс $classInWorld")
//}



