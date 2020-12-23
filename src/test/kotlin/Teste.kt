import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class Teste : FunSpec({

    beforeTest {
        println("Starting test ${it.name}!")
    }

    afterTest {
        println("Finished test ${it.a.name}!")
    }

    test("Export Result") {
        // Dado que:
        val a = 1

        // Quando
        val b = 1

        // Então
        a shouldBe b
    }

})
