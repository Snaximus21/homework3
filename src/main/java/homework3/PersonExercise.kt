package homework3

data class Person(val name: String, val surname: String, val age: Int)

fun List<Person>.sortByAge(): List<Person> {
    return this.sortedBy { it.age }
}

fun List<Person>.sortByName(): List<Person> {
    return this.sortedWith (compareBy({it.name}, {it.surname}, {it.age}))
}

fun main() {
    val list = listOf<Person>(
        Person("Юрий", "Тазик", 65),
        Person("Антон", "Юдин", 47),
        Person("Антон", "Юдин", 23),
        Person("Антон", "Иванов", 35),
        Person("Андрей", "Петров", 23),
        Person("Иван", "Сидоров", 12),
        Person("Иван", "Абдулрахимов", 33),
        Person("Сергей", "Пивоваров", 55)
    )

    println(list.sortByAge())
    println(list.sortByName())
}