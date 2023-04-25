
import org.scalatest.funsuite.{AnyFunSuite, AnyFunSuiteLike}

class PasswordValidatorTest extends AnyFunSuite {

  val passwordValidator = new PasswordValidator
  test("testValidatePassword for spaces") {
  val actualValue = passwordValidator.validatePassword("Sheshnath","Hello my name is sheshnath")
  val expectedValue = false
    assert(actualValue===expectedValue)
  }

  test("testValidatePassword for Cases and Symbols") {
    val actualValue = passwordValidator.validatePassword("sheshu","passWord@01")
    val expectedValue = true
    assert(actualValue === expectedValue)
  }

  test("testValidatePassword for Username ") {
    val actualValue = passwordValidator.validatePassword( "Sheshu","Sheshu")
    val expectedValue = false
    assert(actualValue === expectedValue)
  }

}
