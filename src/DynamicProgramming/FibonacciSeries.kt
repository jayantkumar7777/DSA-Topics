package DynamicProgramming

fun fibonacci(n: Int): Int {
    val f = IntArray(n + 2)
    f[0] = 0
    f[1] = 1
    for (i in 2..n) {
        f[i] = f[i - 1] + f[i - 2]
    }
    return f[n]
}

fun main() {
    val n = 9
    println("Fibonacci number is ${fibonacci(n)}")
}