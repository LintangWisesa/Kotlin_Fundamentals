fun main(args: Array<String>) {
    var a = 20
    var b = 35

    // var maxValue: Int
    // if (a > b)
    //     maxValue = a
    // else
    //     maxValue = b

    var maxValue: Int = if (a > b){
                            println("Nilai a lebih besar")
                            a
                        } else {
                            println("Nilai b lebih besar")
                            b
                        }

    println("Nilai tertinggi = $maxValue")
}