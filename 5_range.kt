fun main(args: Array<String>) {
    val r1 = 1..5
    val r2 = 5 downTo 1
    val r3 = 5 downTo 1 step 2
    val r4 = "a".."z"

    var adaTidak = "a" in r4
    print(adaTidak)

    var hitungMundur = 10.downTo(1)
    var hitungMaju = 1.rangeTo(10)
}