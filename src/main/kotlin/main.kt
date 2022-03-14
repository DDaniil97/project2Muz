fun main (){
    val price : Double = 159840.0
    val discountStart = 1000
    val discount = 100 //от тысячи до 10 тыс
    val discountStart2 = 10_000
    val discount2 = 0.05 //5% более 10 тыс
    val discountRegular = 0.01
    println ("пользователь купил на: $price ")
    val result : Double = if (price > discountStart && price < discountStart2) price - discount else price - (price * discount2)
    println("Цена со скидкой: $result")

    val client = true
    val result2 = if (client)  result - result * discountRegular else result
    println("Цена со скидкой постоянного клиента: $result2")

}