package com.slmanju.myapplication

data class Hobby(var title: String)

object Supplier {
    val hobbies = listOf(
        Hobby("Reading"),
        Hobby("Programming"),
        Hobby("Gardening"),
        Hobby("Cricket"),
        Hobby("Chess"),
        Hobby("Cartoon"),
        Hobby("Movies"),
        Hobby("TV")
    )
}