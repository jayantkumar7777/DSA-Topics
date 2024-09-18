package Stacks

import java.util.*

fun main() {
    val stack: Stack<Int> = Stack()
    stack.push(10)
    stack.push(20)
    stack.push(30)
    println("Stack elements are:")
    while (!stack.isEmpty()) {
        println(stack.pop())
    }
}