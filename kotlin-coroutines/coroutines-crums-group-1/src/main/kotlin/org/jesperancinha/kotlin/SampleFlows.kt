package org.jesperancinha.kotlin

import kotlinx.coroutines.FlowPreview
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.sample
import kotlinx.coroutines.runBlocking
import kotlin.time.Duration.Companion.milliseconds

class SampleFlows {
    companion object {
        @OptIn(FlowPreview::class)
        @JvmStatic
        fun main(args: Array<String> = emptyArray()): Unit = runBlocking {
            val flow = flow {
                repeat(10) {
                    emit(it)
                    delay(100.milliseconds)
                }
            }

            flow
                .sample(500)
                .collect { value ->
                    println("Collected: $value")
                }
        }
    }
}