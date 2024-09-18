package LinkedList

class Node(var data: Int) {
    var next: Node? = null
}

class LinkedList {
    private var head: Node? = null

    fun insert(data: Int) {
        val newNode = Node(data)
        newNode.next = head
        head = newNode
    }

    fun display() {
        var currentNode = head
        while (currentNode != null) {
            print("${currentNode.data} ")
            currentNode = currentNode.next
        }
    }
}

fun main() {
    val list = LinkedList()
    list.insert(10)
    list.insert(20)
    list.insert(30)
    println("Linked List elements are:")
    list.display()
}