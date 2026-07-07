package org.jesperancinha.kotlin

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.buffer
import kotlinx.coroutines.flow.channelFlow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.runBlocking
import kotlin.time.Duration.Companion.milliseconds

class CoroutinesChannelFlowBuffer {

    companion object {
        @JvmStatic
        fun main(args: Array<String> = emptyArray()): Unit = runBlocking {
            val flow = channelFlow<Int>{
                for (i in 1..5) {
                    println("Emitting $i")
                    delay(100.milliseconds)
                    send(i)
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