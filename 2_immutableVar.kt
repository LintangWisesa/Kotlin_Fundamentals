// variables
fun main(args: Array<String>) {
    
    // mutable string
    var kata1: String
    kata1 = "Tes 1 2 3"
    kata1 = "Tes 4 5 6"
    
    // immutable string
    val kata2 = "Ini constant, tak bisa diubah!"
    
    println(kata1)
    println(kata2)

    // String interpolation
    println("Halo $kata1 $kata2")
    println("Jumlah huruf di kata1 = ${kata1.length}")
}
