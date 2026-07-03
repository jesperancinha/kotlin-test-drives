package org.jesperancinha.kotlin.service

import org.jesperancinha.kotlin.model.Coin
import org.jesperancinha.kotlin.repo.CoinRepository
import org.jesperancinha.kotlin.repo.CoinRepositoryInjected
import org.koin.core.annotation.Factory

class CoinService(private val repo: CoinRepository) {
    fun register(coin: Coin) {
        println("Registering coin: $coin")
        repo.add(coin)
    }
    fun listAll(): List<Coin> = repo.getAll()
}

@Factory
class CoinServiceInjected(private val repo: CoinRepositoryInjected) {
    fun register(coin: Coin) {
        println("Registering coin: $coin")
        repo.add(coin)
    }
    fun listAll(): List<Coin> = repo.getAll()
}