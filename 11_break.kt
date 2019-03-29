// break hanya berlaku untuk break 1 loop

fun main(args: Array<String>) {

    // for (i in 1..10) {
    //     println(i)
    //     if (i == 5)
    //         break
    //         // break hanya berlaku utk keluar dr 1 loop
    // }

    // for (i in 1..3) {
    //     for (j in 1..3){
    //         println("$i $j")
    //         if (i == 2 && j == 2)
    //             break
    //     }
    // }

    // labeled for loop
    myLoop@ for (i in 1..3) {
        for (j in 1..3){
            println("$i $j")
            if (i == 2 && j == 2)
                break@myLoop
        }
    }

}