package org.jesperancinha.kotlin

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.buffer
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.runBlocking
import kotlin.time.Duration.Companion.milliseconds

class CoroutinesBuffer {

    companion object {
        @JvmStatic
        fun main(args: Array<String> = emptyArray()): Unit = runBlocking {
            val flow = flow {
                for (i in 1..5) {
                    println("Emitting $i")
                    delay(100.milliseconds)
                    emit(i)
                }
            }

            println("- Without buffer:")
            flow
                .collect { value ->
                    delay(300.milliseconds)
                    println("Collected $value")
                }

            println("- With buffer:")
            flow
                .buffer()
                .collect { value ->
                    delay(300.milliseconds)
                    println("Collected $value")
                }
        }
    }

}