package osgi_module

import io.mockk.mockk
import org.junit.jupiter.api.Test
import org.osgi.framework.BundleContext
import org.junit.jupiter.api.Assertions.*

class ActivatorTest {

    private val activator = Activator()
    private val bundleContext = mockk<BundleContext>(relaxed = true)

    @Test
    fun `should start activator`() {
        assertDoesNotThrow {
            activator.start(bundleContext)
        }
    }

    @Test
    fun `should stop activator`() {
        assertDoesNotThrow {
            activator.stop(bundleContext)
        }
    }

    @Test
    fun `should return null help`() {
        val help = activator.getHelp()
        assertNull(help)
    }
}
