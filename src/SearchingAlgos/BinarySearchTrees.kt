package SearchingAlgos

class BSTNode(var data: Int) {
    var left: BSTNode? = null
    var right: BSTNode? = null
}

class BinarySearchTree {
    var root: BSTNode? = null

    fun insert(data: Int) {
        root = insertRec(root, data)
    }

    private fun insertRec(root: BSTNode?, data: Int): BSTNode {
        if (root == null) {
            return BSTNode(data)
        }
        if (data < root.data) {
            root.left = insertRec(root.left, data)
        } else if (data > root.data) {
            root.right = insertRec(root.right, data)
        }
        return root
    }

    fun inorder() {
        inorderRec(root)
    }

    private fun inorderRec(root: BSTNode?) {
        if (root != null) {
            inorderRec(root.left)
            print("${root.data} ")
            inorderRec(root.right)
        }
    }
}

fun main() {
    val tree = BinarySearchTree()
    val elements = arrayOf(50, 30, 70, 20, 40, 60, 80)
    for (element in elements) {
        tree.insert(element)
    }
    println("Inorder traversal of BST:")
    tree.inorder()
}