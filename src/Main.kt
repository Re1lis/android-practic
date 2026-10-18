
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



