package org.jesperancinha.kotlin.rest

import kotlinx.coroutines.delay
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import kotlin.time.Duration.Companion.milliseconds

@RestController
@RequestMapping("test")
class SimpleRestController {

    @GetMapping
    suspend fun getTest() {
        delay(500.milliseconds)
    }
}
