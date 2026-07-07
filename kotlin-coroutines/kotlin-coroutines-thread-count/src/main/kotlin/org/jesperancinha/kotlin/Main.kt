package org.jesperancinha.kotlin

import kotlinx.coroutines.delay
import kotlinx.coroutines.joinAll
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.supervisorScope
import kotlin.time.Duration.Companion.milliseconds

object Main {
    @JvmStatic
    fun main(args: Array<String>) = runBlocking {
        println("Hello world!")
        val test = supervisorScope {
            val job1 = launch {
                delay(1000.milliseconds)
//                cancel(CancellationException("Job is closed"))
                throw RuntimeException("Failure in job 1")
//                println("Job 1 completed successfully")
            }

            val job2 = launch {
                delay(2000.milliseconds)
                println("Job 2 completed successfully")
            }
            joinAll(job1, job2)
            123
        }
        println(test)
    }
}