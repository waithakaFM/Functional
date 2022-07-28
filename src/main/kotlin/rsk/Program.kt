package rsk

// oo representation of strategy pattern

fun main(args: Array<String>) {
    var program = Program()
//    program.fibonacci(8)

//    creating anonymous object of process interface
    program.fibonacci(8, object : rsk.Process{
        override fun execute(value: Int) {
            println(value)
        }
    })
}

// oo way instead of functional way of implementing fib sequence
interface Process {
    fun execute(value: Int)
}

class Program {

//    1, 1, 2, 3, 5, 8, 13
    fun fibonacci(limit: Int, action: rsk.Process){
        var prev = 0
        var prevprev = 0
        var current = 1

        for (i: Int in 1..limit){
            action.execute(current)

            var temp = current
            prevprev = prev
            prev = temp
            current = prev + prevprev
        }
    }
}