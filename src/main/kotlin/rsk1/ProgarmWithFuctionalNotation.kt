package rsk1

fun main(args: Array<String>) {
    var program = Program()
    var total = 0
//    program.fibonacci(8)

    program.fibonacci(8) {n -> println(n) }
    program.fibonacci(8) {println(it) }
//    print in one line using a function reference
    program.fibonacci(8, ::print)
    print("\n")

//    adding all the numbers together -> this is achieved by mutating the lambda func
    program.fibonacci(8) {it -> total += it}
    println("Total is $total")

}

// oo way instead of functional way of implementing fib sequence
interface Process {
    fun execute(value: Int)
}

class Program {

    //    1, 1, 2, 3, 5, 8, 13
    fun fibonacci(limit: Int, action: (Int) -> Unit){
        var prev = 0
        var prevprev = 0
        var current = 1

        for (i: Int in 1..limit){
            action(current)

            var temp = current
            prevprev = prev
            prev = temp
            current = prev + prevprev
        }

    }
}