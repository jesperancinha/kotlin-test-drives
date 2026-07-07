package org.jesperancinha.kotlin.repo

import org.jesperancinha.kotlin.model.Coin
import org.koin.core.annotation.Single

class CoinRepository {
    private val coins = mutableListOf<Coin>()
    fun add(coin: Coin) = coins.add(coin)
    fun getAll(): List<Coin> = coins.toList()
}

@Single
class CoinRepositoryInjected {
    private val coins = mutableListOf<Coin>()
    fun add(coin: Coin) = coins.add(coin)
    fun getAll(): List<Coin> = coins.toList()
}