
import org.scalatest.funsuite.{AnyFunSuite, AnyFunSuiteLike}

class DuplicateElementsTest extends AnyFunSuite {
  val duplicateElements = new DuplicateElements
  test("testDuplicateElements") {
    val actualValue = duplicateElements.duplicateElements(List(1,2,1,2,3,4,5,5))
    val expectedValue = false
    assert(actualValue===expectedValue)
  }

  test("testDuplicateElements for chars") {
    val actualValue = duplicateElements.duplicateElements(List('1', '2', '1', '2', '3', '4', '5', '5'))
    val expectedValue = false
    assert(actualValue === expectedValue)
  }
  test("testDuplicateElements for String") {
    val actualValue = duplicateElements.duplicateElements(List("Hello", "My","Name","is","Sheshnath"))
    val expectedValue = true
    assert(actualValue === expectedValue)
  }

}
