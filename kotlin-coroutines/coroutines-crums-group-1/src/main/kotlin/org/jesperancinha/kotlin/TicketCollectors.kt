package org.jesperancinha.kotlin

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.runBlocking
import kotlin.random.Random
import kotlin.time.Duration.Companion.milliseconds

class TicketCollectors {
    companion object {
        @JvmStatic
        fun main(args: Array<String> = emptyArray()) = runBlocking {
            flow {
                repeat(10) {
                    emit(Random.nextInt(10, 25))
                    delay(2.milliseconds)
                }
            }.collect { value ->
                processTemperature(value)
            }
            println("Finished processing collect!")

            flow {
                repeat(10) {
                    emit(Random.nextInt(10, 25))
                    delay(2.milliseconds)
                }
            }.collectLatest { value ->
                processTemperature(value)
            }
            println("Finished processing collectLatest!")

        }

        private suspend fun processTemperature(value: Int) {
            println("Processing-> $value")
            delay(Random.nextLong(1, 5).milliseconds)
            println("Processed!-> $value")

        }
    }
}