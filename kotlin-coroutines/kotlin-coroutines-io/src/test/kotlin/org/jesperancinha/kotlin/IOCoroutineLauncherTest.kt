package org.jesperancinha.kotlin

import kotlinx.coroutines.runBlocking
import kotlin.test.Test

class IOCoroutineLauncherTest {
    @Test
    fun `should run Main until the end`() = runBlocking {
        IOCoroutineLauncher.runAllTests()
    }
}