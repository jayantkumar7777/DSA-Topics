package Queues

import java.util.*

fun main() {
    val queue: Queue<Int> = LinkedList()
    queue.add(10)
    queue.add(20)
    queue.add(30)
    println("Queue elements are:")
    while (queue.isNotEmpty()) {
        println(queue.poll())
    }
}