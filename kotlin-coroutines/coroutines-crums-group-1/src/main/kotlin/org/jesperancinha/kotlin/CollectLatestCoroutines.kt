package org.jesperancinha.kotlin

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.runBlocking
import kotlin.time.Duration.Companion.milliseconds

class CollectLatestCoroutines {

    companion object {
        @JvmStatic
        fun main(args: Array<String> = emptyArray()) = runBlocking {
            val flow = flow {
                emit(1)
                delay(100.milliseconds)
                emit(2)
            }

            flow.collectLatest { value ->
                println("Collecting $value")
                delay(200.milliseconds)
                println("Done processing $value")
            }
        }
    }
}