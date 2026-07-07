package org.jesperancinha.kotlin.interpolist

class Passed {
    companion object {
        @JvmStatic
        fun main(args: Array<String> = emptyArray()) {
            runCatching { PassedClass.changeList(emptyList()) }
                .onFailure { println(it) }
            runCatching { PassedClass.changeListMutable(mutableListOf()) }
                .onFailure { println(it) }
        }
    }
}