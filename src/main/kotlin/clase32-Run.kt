package org.example

fun main(args: Array <String>) {
    val celulares = mutableListOf("Google Pixel 2XL", "Google Pixel 4a", "Heawei Redmi 9", "Xiaomi mi a3")
        .run {
            removeIf { celulares -> celulares.contains("Google") }
            this
        }
    println(celulares)
}

// The context object is available as a receiver (this).
// The return value is the lambda result.
// <run> does the same as <with> but it is implemented as an extension function. So like <let>, you can call it on the context object using dot notation.
//<run> is useful when your lambda both initialized objects and computes the return value.


