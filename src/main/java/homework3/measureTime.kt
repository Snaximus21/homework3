package homework3

fun measureTimeForMs(action: () -> Unit) : Long{
    val start = System.currentTimeMillis()
    action.invoke()
    return System.currentTimeMillis() - start
}