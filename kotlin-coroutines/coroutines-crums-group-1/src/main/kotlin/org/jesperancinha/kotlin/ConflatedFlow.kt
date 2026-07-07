package org.jesperancinha.kotlin

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.conflate
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.runBlocking
import kotlin.time.Duration.Companion.milliseconds

class ConflatedFlow {
    companion object {
        @JvmStatic
        fun main(args: Array<String> = emptyArray()): Unit = runBlocking {
            flow {
                repeat(5) {
                    emit(it)
                    println("Emitting $it")
                    delay(100.milliseconds)
                }
            }
                .conflate()
                .collect { value ->
                    println("Collecting $value")
                    delay(400.milliseconds)
                }
        }
    }
}