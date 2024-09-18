package Graphs

import java.util.*

class Graph(private val V: Int) {
    private val adj: Array<MutableList<Int>> = Array(V) { mutableListOf() }

    fun addEdge(v: Int, w: Int) {
        adj[v].add(w)
    }

    private fun DFSUtil(v: Int, visited: BooleanArray) {
        visited[v] = true
        print("$v ")

        for (n in adj[v]) {
            if (!visited[n]) {
                DFSUtil(n, visited)
            }
        }
    }

    fun DFS(v: Int) {
        val visited = BooleanArray(V)
        DFSUtil(v, visited)
    }
}

fun main() {
    val g = Graph(4)
    g.addEdge(0, 1)
    g.addEdge(0, 2)
    g.addEdge(1, 2)
    g.addEdge(2, 0)
    g.addEdge(2, 3)
    g.addEdge(3, 3)

    println("Following is Depth First Traversal (starting from vertex 2):")
    g.DFS(2)
}