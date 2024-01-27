package org.jesperancinha.ktd

import org.jesperancinha.ktd.exceptions.HandlingExceptions

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        HandlingExceptions.main()
        CancellationWithException.main()
        UniversalLauncher.main()
        SupervisorIntended.main()
        TrainStationManager.main()
        NeuralNetworksCancelling.main()
        StructuredConcurrency.main()
        ValidationUsersEmail.main()
        ContractsExtension.main()
        org.jesperancinha.ktd.java.ValidationUsersEmail.main(emptyArray())
        CancellingCounterCoroutines.main()
    }
}