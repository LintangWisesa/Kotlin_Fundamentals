fun main(args: Array<String>) {
    val p = Structure()
    p tesInfix 1991     // atau: p.tesInfix(1991)
}

class Structure() {
    infix fun tesInfix(x: Int) {
        println("Hasil = ${x}")
    }
}