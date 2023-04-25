
import org.scalatest.funsuite.AnyFunSuite

class FactorialTest extends AnyFunSuite {

  val factorial= new Factorial
  test("testGetFactorial") {
    val actualValue = factorial.getFactorial(5)
    val expectedValue=120
    assert(actualValue===expectedValue)
  }

  test("testGetFactorial for Zero value") {
    val actualValue = factorial.getFactorial(0)
    val expectedValue = 1
    assert(actualValue === expectedValue)
  }

  test("testGetFactorial for negative value") {
    val actualValue = factorial.getFactorial(-1)
    val expectedValue = Int.MinValue
    assert(factorial.getFactorial(-100) ===Int.MinValue)
    assert(actualValue === expectedValue)
  }

}
