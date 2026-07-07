package org.jesperancinha.kotlin.loading

import kotlinx.coroutines.*
import java.lang.Thread.sleep
import kotlin.system.*
import kotlin.time.Duration.Companion.milliseconds

object LoadingCoroutinesWorkStealExample {

    @JvmStatic
    fun main(args: Array<String> = emptyArray()) = runBlocking {
        val numCores = Runtime.getRuntime().availableProcessors()
        println("Available CPU cores: $numCores")
        val jobs = mutableListOf<Job>()
        val time = measureTimeMillis {
            repeat(numCores * 2) { index ->
                jobs += launch(Dispatchers.Default) {
                    val duration = if (index % 2 == 0) 1000.milliseconds else 500.milliseconds
                    println("Coroutine $index running on ${Thread.currentThread().name} for $duration ms")
                    delay(duration)
                    println("Coroutine $index finished on ${Thread.currentThread().name}")
                }
            }
            jobs.joinAll()
        }

        println("Total execution time: $time ms")
    }

}