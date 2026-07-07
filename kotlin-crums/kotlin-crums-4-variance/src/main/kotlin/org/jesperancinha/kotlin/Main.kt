package org.jesperancinha.kotlin

import org.jesperancinha.kotlin.crum5.Patisserie
import org.jesperancinha.kotlin.delegates.Account

class Main {
    companion object {
        @JvmStatic
        fun main(args: Array<String> = emptyArray()) {
            Cakes.main()
            SoupEating.main()
            ImmutableEatingOut.main()
            CupManager.main()
            Patisserie.main()
            WarehouseManager.main()
            TailRec.main()
            FloatVsDouble.main()
            Delegates.main()
            Account.main(emptyArray())
            IndexSolutionForRIDHashes.main()
            Timeouts.main()
            CollectingCollections.main()
            Exceptionally.main()
            org.jesperancinha.kotlin.unique.main()
        }
    }
}