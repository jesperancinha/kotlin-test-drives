package org.jesperancinha.kotlin.loading

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.currentCoroutineContext
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.time.Duration.Companion.milliseconds

object LoadingCoroutinesUnconfined {

    @JvmStatic
    fun main(args: Array<String>): Unit = runBlocking {
        println("Starting coroutine unconfined - ${Thread.currentThread().name} with coroutine context ${currentCoroutineContext()}")
        launch(Dispatchers.Unconfined) {
            println("1 - Start in thread: ${Thread.currentThread().name} with coroutine context ${currentCoroutineContext()}")
            delay(1000.milliseconds)
            println("1 - Resumed in thread: ${Thread.currentThread().name} with coroutine context ${currentCoroutineContext()}")
            delay(1000.milliseconds)
            println("1 - Resumed in thread: ${Thread.currentThread().name} with coroutine context ${currentCoroutineContext()}")
        }

        launch(Dispatchers.Unconfined) {
            println("2 - Start in thread: ${Thread.currentThread().name} with coroutine context ${currentCoroutineContext()}")
            delay(1000.milliseconds)
            println("2 - Resumed in thread: ${Thread.currentThread().name} with coroutine context ${currentCoroutineContext()}")
            delay(1000.milliseconds)
            println("2 - Resumed in thread: ${Thread.currentThread().name} with coroutine context ${currentCoroutineContext()}")
        }
    }
}