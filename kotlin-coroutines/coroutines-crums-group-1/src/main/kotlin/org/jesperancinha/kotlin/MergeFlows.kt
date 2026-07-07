package org.jesperancinha.kotlin

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.merge
import kotlinx.coroutines.runBlocking
import kotlin.time.Duration.Companion.milliseconds

class MergeFlows {
    companion object{
        @JvmStatic
        fun main(args: Array<String> = emptyArray()) = runBlocking {
                val flow1 = flow {
                    delay(100.milliseconds)
                    emit(1)
                    delay(100.milliseconds)
                    emit(2)
                }

                val flow2 = flow {
                    delay(50.milliseconds)
                    emit("A")
                    delay(150.milliseconds)
                    emit("B")
                }

                merge(flow1, flow2).collect { value ->
                    println(value)
            }

        }
    }
}