package org.jesperancinha.kotlin.service

import org.jesperancinha.kotlin.model.Coin
import org.jesperancinha.kotlin.repo.CoinRepository
import org.jesperancinha.kotlin.repo.CoinRepositoryInjected
import org.jesperancinha.kotlin.repo.ICoinRepository
import org.koin.core.annotation.Factory

interface ICoinService {
    fun register(coin: Coin)
    fun listAll(): List<Coin>
}

class CoinService(private val repo: ICoinRepository) : ICoinService {
    override fun register(coin: Coin) {
        println("Registering coin: $coin")
        repo.add(coin)
    }
    override fun listAll(): List<Coin> = repo.getAll()
}

@Factory
class CoinServiceInjected(private val repo: CoinRepositoryInjected) : ICoinService {
    override fun register(coin: Coin) {
        println("Registering coin: $coin")
        repo.add(coin)
    }
    override fun listAll(): List<Coin> = repo.getAll()
}