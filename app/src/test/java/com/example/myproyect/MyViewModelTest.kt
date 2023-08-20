import org.junit.Test
import org.junit.Assert.*

class MyViewModelTest {

    @Test
    fun testCompareStrings() {
        val viewModel = MyViewModel()

        viewModel.compareStrings("hello", "world")
        assertEquals("Las cadenas son diferentes", viewModel.resultText)

        viewModel.compareStrings("hello", "hello")
        assertEquals("Las cadenas son iguales", viewModel.resultText)
    }
}
