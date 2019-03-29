fun main(args: Array<String>) {
    var nama: String
    nama = "Lintang"
    
    var myObject = myClass()
    myObject.myFunction(nama)
}

class myClass {
    fun myFunction(x: String){
        print("Halo " + x)
    }
}