package org.jesperancinha.kotlin

import kotlinx.coroutines.FlowPreview
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.debounce
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.runBlocking
import kotlin.time.Duration.Companion.milliseconds

class Debouncing {
    companion object {
        @OptIn(FlowPreview::class)
        @JvmStatic
        fun main(arg: Array<String> = emptyArray()) = runBlocking {
            val searchQueryFlow = flow {
                emit("K")
                delay(100.milliseconds)
                emit("Ko")
                delay(300.milliseconds)
                emit("Kot")
                delay(600.milliseconds)
                emit("Kotlin")
            }

            println("Debounced Flow:")
            searchQueryFlow
                .debounce(500)
                .collect { value ->
                    println("Collected: $value")
                }
        }
    }
}