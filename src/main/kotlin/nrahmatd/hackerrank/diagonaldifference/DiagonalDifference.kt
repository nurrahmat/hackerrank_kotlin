package nrahmatd.hackerrank.diagonaldifference

import kotlin.math.abs

/*
 * Complete the 'diagonalDifference' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts 2D_INTEGER_ARRAY arr as parameter.
 */

fun diagonalDifference(arr: Array<Array<Int>>): Int {
    // Write your code here
    var sumCrossRight = 0
    var sumCrossLeft = 0
    var lastIndex = arr.size -1
    for (i in arr.indices) {
        sumCrossRight += arr[i][i]
        sumCrossLeft += arr[i][lastIndex]
        lastIndex--
    }


    return abs(sumCrossRight - sumCrossLeft)
}

fun main() {
    val n = readLine()!!.trim().toInt()

    val arr = Array<Array<Int>>(n) { Array<Int>(n) { 0 } }

    for (i in 0 until n) {
        arr[i] = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
    }

    val result = diagonalDifference(arr)

    println(result)
}
