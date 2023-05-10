package homework3

fun main(){
    var numberList = MutableList(100) {it}
    println(numberList)
    numberList = numberList.filter { (it % 2 == 0) }.toMutableList()
    println(numberList)
    val slice = numberList.slice(10..20).toMutableList()// Берет слайс с 10 по 20 элементы
    slice.replaceAll { (it + 1) }//и добавляет к каждому элементу 1
    println(slice)
    println(numberList.filterNot { it in 20..40 }.sum())//Суммирует все оставшиеся числа и возвращает сумму
}