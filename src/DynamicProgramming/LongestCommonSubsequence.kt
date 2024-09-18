package DynamicProgramming

fun lcs(X: CharArray, Y: CharArray, m: Int, n: Int): Int {
    val L = Array(m + 1) { IntArray(n + 1) }

    for (i in 0..m) {
        for (j in 0..n) {
            L[i][j] = if (i == 0 || j == 0) {
                0
            } else if (X[i - 1] == Y[j - 1]) {
                L[i - 1][j - 1] + 1
            } else {
                maxOf(L[i - 1][j], L[i][j - 1])
            }
        }
    }
    return L[m][n]
}

fun main() {
    val s1 = "AGGTAB"
    val s2 = "GXTXAYB"
    val X = s1.toCharArray()
    val Y = s2.toCharArray()
    val m = X.size
    val n = Y.size

    println("Length of LCS is ${lcs(X, Y, m, n)}")
}