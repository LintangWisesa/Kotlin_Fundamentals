fun main(args: Array<String>) {
    tambah()
    kali(3,4)
    println(bagi(25,5))
    tes(y = 3)
}

// function with an argument
fun tambah(){
    var a = 2
    var b = 4
    println("Jumlah = ${a+b}")
}

// function with more than 1 argument
fun kali(a:Int, b:Int){
    println("Hasil kali = ${a*b}")
}

// return function
fun bagi(a:Int, b:Int):Int {
    return a/b
}

// named argument function
fun tes(x: Int = 20, y: Int = 2){
    print("Named argument result: ${x * y}")
}