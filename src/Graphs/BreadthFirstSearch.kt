package Graphs

import java.util.*

class BreadthFirstSearch(private val V: Int) {
    private val adj: Array<MutableList<Int>> = Array(V) { mutableListOf() }

    fun addEdge(v: Int, w: Int) {
        adj[v].add(w)
    }

    fun BFS(s: Int) {
        val visited = BooleanArray(V)
        val queue: Queue<Int> = LinkedList()

        visited[s] = true
        queue.add(s)

        while (queue.isNotEmpty()) {
            val v = queue.poll()
            print("$v ")

            for (n in adj[v]) {
                if (!visited[n]) {
                    visited[n] = true
                    queue.add(n)
                }
            }
        }
    }
}

fun main() {
    val g = BreadthFirstSearch(4)
    g.addEdge(0, 1)
    g.addEdge(0, 2)
    g.addEdge(1, 2)
    g.addEdge(2, 0)
    g.addEdge(2, 3)
    g.addEdge(3, 3)

    println("Following is Breadth First Traversal (starting from vertex 2):")
    g.BFS(2)
}