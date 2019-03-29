fun main(args: Array<String>) {
    val x = 3

    when(x){
        0 -> println("Nilai x = 0")
        1, 2 -> {
            println("Nilai x lebih dari 0")
            println("Nilai x = $x")
        }
        else -> {
            println("Nilai x bukan 1 ataupun 2")
            println("Nilai x = $x")
        }
    }
}