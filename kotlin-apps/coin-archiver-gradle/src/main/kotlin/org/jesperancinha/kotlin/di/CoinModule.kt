package org.jesperancinha.kotlin.di

import org.jesperancinha.kotlin.model.Coin
import org.jesperancinha.kotlin.repo.CoinRepository
import org.jesperancinha.kotlin.service.CoinService
import org.koin.core.annotation.ComponentScan
import org.koin.core.annotation.Module
import org.koin.core.qualifier.Qualifier
import org.koin.core.qualifier.named
import org.koin.dsl.module

val coinModule = module {
    single { CoinRepository() }
    factory {
        CoinService(repo = get())
    }
    single(
        qualifier = named(name = "country")
    ) { "Portugal" }
    factory { (year: Int) ->
        Coin(
            year = year,
            country = get(
                qualifier =
                    named("country")
            ),
            denomination = "1 Euro"
        )
    }
    factory(named("rare")) { (year: Int) -> Coin(year, "Greece", "Olympic Coin") }
}

@Module
@ComponentScan("org.jesperancinha.kotlin")
class AppModule
