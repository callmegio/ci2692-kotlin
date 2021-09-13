import java.util.Arrays

// FUN & PROC GLOBALES
// PROC: INTERCAMBIA SIMULTANEAMENTE DOS VALORES DE UN ARRAY
fun swap(A: Array<Int>, i: Int, j: Int): Unit {
    A[i] = A[j].also { A[j] = A[i] }
}

//FUN: Evalua si una secuencia es creciente
fun growOrder(A: Array<Int>): Boolean {

    val n = A.size
    for (i in 0 until n - 1) {
        if (A[i] > A[i + 1]) {
            return false
        }
    }
    return true
}


//PROC: Si la secuencia recibida no está en orden creciente, el programa aborta
fun isNotGrowOrder(sequence: Array<Int>, algorithm: String): Unit {
    if (!growOrder(sequence)) {
        println("El algoritmo $algorithm ha fallado en ordenar la secuencia")
        System.exit(0)
    }
}

//FUN: retorna una secuencia aleatoria con números en el rango [0,n]
fun basicSequence(n: Int): Array<Int> {
    val sequence = Array(n, {0})
    for (j in 0 until n) {
        sequence[j] = (0..n).random()
    }
    return sequence
}

//FUN: genera un tipo de secuencia aleatoria
fun genTypeSeq(s: String, n: Int): Array<Int> {
    var sequence = Array(n, {0})
    when(s) {
        "random" -> sequence = basicSequence(n)
        "sorted" -> {
                        sequence = basicSequence(n)
                        sequence.sort()
        }
        "inv" -> {
                    sequence = basicSequence(n)
                    sequence.sortDescending()
        }
    }
    return sequence
}

fun countFlags(s:)


fun main(args: Array<String>) {
    /* var A = arrayOf(1, 2, 3)
    var B = arrayOf(3, 2, 1)

    println(A.joinToString(" "))
    println(growOrder(A))
    println(genTypeSeq("random", 10).joinToString())
    println(genTypeSeq("sorted", 10).joinToString())
    println(genTypeSeq("inv", 10).joinToString())
    println(isNotGrowOrder(B, "Test")) */

    val t: Int = args[0].toInt()
    val s: String = args[1]
    val n: Int = args[2].toInt()

    println("$t Número de intentos")
    println("$s Clase de secuencia")
    println("$n Número de elemetnos")
}