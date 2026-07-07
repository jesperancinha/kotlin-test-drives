package org.jesperancinha.kotlin.crums3

import kotlinx.coroutines.runBlocking
import org.jesperancinha.kotlin.crums3.arrowbasics.ArrowRecord
import org.jesperancinha.kotlin.crums3.arroweffects.ArrowFileEffects
import org.jesperancinha.kotlin.crums3.arrowprisms.ArrowPrisms
import org.jesperancinha.kotlin.crums3.arrowsprogrammatically.ArrowsProgrammatically
import org.jesperancinha.kotlin.crums3.classcasting.ClassCatcher
import org.jesperancinha.kotlin.crums3.consoleprint.ConsolerizerPrint
import org.jesperancinha.kotlin.crums3.crum10.CrossInline
import org.jesperancinha.kotlin.crums3.crum11.ChunkParallelization
import org.jesperancinha.kotlin.crums3.crum12.Invoke
import org.jesperancinha.kotlin.crums3.crum13.InAndOuts
import org.jesperancinha.kotlin.crums3.mutableflow.MutableFlow
import org.jesperancinha.kotlin.crums3.crum9.InstanceScope
import org.jesperancinha.kotlin.crums3.goldengirls.GoldenGirlsLauncher
import org.jesperancinha.kotlin.crums3.literalreceiver.LiteralReceiver
import org.jesperancinha.kotlin.crums3.multicatch.Multicatch
import org.jesperancinha.kotlin.crums3.multiple.MultipleSameTypeCats
import org.jesperancinha.kotlin.crums3.mutablevssharedflows.MutableSharedFlowCheck
import org.jesperancinha.kotlin.crums3.open.OpenEndRanges
import org.jesperancinha.kotlin.crums3.vector.VectorRunner
import org.jesperancinha.kotlin.crums3.visibility.NewspaperLauncherVisibility

fun main(args: Array<String>) = runBlocking {
    ConsolerizerPrint.main(args)
    OpenEndRanges.main()
    Multicatch.main(args)
    ArrowRecord.main(args)
    ArrowsProgrammatically.main(args)
    ArrowPrisms.main(args)
    ArrowFileEffects.main(args)
    ClassCatcher.main()
    InstanceScope.main()
    CrossInline.main()
    ChunkParallelization.main()
    Invoke.main()
    InAndOuts.main()
    MutableFlow.main()
    SleepingTimerTask.main()
    MultipleSameTypeCats.main()
    NewspaperLauncherVisibility.main()
    GoldenGirlsLauncher.main()
    VectorRunner.main(args)
    MutableSharedFlowCheck.main(args)
    LiteralReceiver.main(args)
    ListNotNull.main()
    Whenever.main()
}

