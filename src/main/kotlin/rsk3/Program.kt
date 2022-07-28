package rsk3

import java.util.*

class Meeting{
    var Title: String = ""
    var When: Date = Date()
    var Who = mutableListOf<String>()

    fun create(){}
}

fun main(args: Array<String>) {
    val m = Meeting()
    m.Title = "Birthday party planning"
    m.When = Date(2022, 10, 1)
    m.Who.add("Francis")

//    instead of the above we can initialize our meeting like this: -> using with
    with(m) {
        Title = "Birthday party planning"
        When = Date(2022, 10, 1)
        Who.add("Francis")
    }

//    apply return the receiver of the action: the Meeting
//    it also allows us to call the methods
    m.apply {
        Title = "Birthday party planning"
        When = Date(2022, 10, 1)
        Who.add("Francis")
    }.create()
}