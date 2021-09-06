// FUN & PROC GLOBALES
// PROC: INTERCAMBIA SIMULTANEAMENTE DOS VALORES DE UN ARRAY
fun swap(A: Array<Int>, i: Int, j: Int): Unit {
    A[i] = A[j].also { A[j] = A[i] }
}


/* ALGORITMO DE ORDENAMIENTO - BUBBLE SORT 
 * FUENTE: AHO, HOPCROFT, ULLMAN. DATA STRUCTURES OF ALGORITHMS, 1983. PAG 253
 */
fun bubbleSort(A: Array<Int>): Unit {
    for (i in 0 until A.size) {
        for (j in A.size - 1 downTo i + 1) {
            if (A[j - 1] > A[j]) {
                swap(A, j - 1, j)
            }
        }
    }
}


/* ALGORITMO DE ORDENAMIENTO - INSERTION SORT
 * FUENTE: AHO, HOPCROFT, ULLMAN. DATA STRUCTURES OF ALGORITHMS, 1983. PAG 255
 */
fun insertionSort(A: Array<Int>): Unit {
    for (i in 1 until A.size) {
        var j = i
        while (A[j] < A[j - 1]) {
            swap(A, j, j - 1)
            j -= 1
        }
    }
}


/* ALGORITMO DE ORDENAMIENTO - SELECTION SORT
 * FUENTE: AHO, HOPCROFT, ULLMAN. DATA STRUCTURES OF ALGORITHMS, 1983. PAG 257
 */
fun selectionSort(A: Array<Int>): Unit {
    for (i in 0 until A.size) {
        var lowIndex = i
        var lowKey = A[i]
        for (j in i + 1 until A.size) {
            if (A[j] < lowKey) {
                lowKey = A[j]
                lowIndex = j
            }
        }
        swap(A, i, lowIndex)
    }
}


/* ALGORITMO DE ORDENAMIENTO - SHELL SORT
 * FUENTE: AHO, HOPCROFT, ULLMAN. DATA STRUCTURES OF ALGORITHMS, 1983. PAG 290
 */
fun shellSort(A: Array<Int>): Unit {
    var gap = A.size / 2

    while (gap > 0) {
        for (i in gap + 1 until A.size) {
            var j = i - gap

            while (j > 0) {
                if (A[j] > A[j + gap]) {
                    swap(A, j, j + gap)
                    j -= gap
                }
                else {
                    j = -1
                    break
                }
            }
        }
        gap /= 2
    }
}