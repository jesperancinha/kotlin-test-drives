package org.jesperancinha.kotlin.di

import org.jesperancinha.kotlin.model.Coin
import org.jesperancinha.kotlin.repo.CoinRepository
import org.jesperancinha.kotlin.repo.CoinRepositoryInjected
import org.jesperancinha.kotlin.repo.ICoinRepository
import org.jesperancinha.kotlin.service.CoinService
import org.jesperancinha.kotlin.service.CoinServiceInjected
import org.koin.core.qualifier.named
import org.koin.dsl.module

val coinModule = module {
    // Repositories and services
    single<ICoinRepository> { CoinRepository() }
    factory { CoinService(repo = get()) }
    
    // Annotated classes
    single { CoinRepositoryInjected() }
    factory { CoinServiceInjected(repo = get()) }
    
    // Constants
    single(qualifier = named("country")) { "Portugal" }
    
    // Coin factories
    factory { (year: Int) ->
        Coin(
            year = year,
            country = get(qualifier = named("country")),
            denomination = "1 Euro"
        )
    }
    factory(named("rare")) { (year: Int) -> Coin(year, "Greece", "Olympic Coin") }
}