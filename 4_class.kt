fun main(args: Array<String>) {
    var nama: String
    nama = "Lintang"
    
    var myObject = myClass()
    myObject.myFunction(nama)
    println(myObject.pesan)
}

// create class
class myClass {

    // variable inside a class
    var pesan = "Selamat datang!"

    // function inside a class
    fun myFunction(x: String){
        println("Halo " + x)
    }
}