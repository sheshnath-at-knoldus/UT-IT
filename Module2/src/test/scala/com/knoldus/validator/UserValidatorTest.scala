
package com.knoldus.validator
import com.knoldus.models.User
import com.knoldus.db.CompanyReadDto
import org.scalatest.funsuite.AnyFunSuiteLike

class UserValidatorTest extends AnyFunSuiteLike {

  val user: User = User("Sheshnath","Yadav",23,"Knoldus","sheshnath.yadav@knoldus.com")
  val user2: User = User("Sheshnath","Yadav",23,"Zepto","sheshnath.yadav@Zepto.com")

  val companyReadDto = new CompanyReadDto
  val emailValidator = new EmailValidator
  val userValidator= new UserValidator(companyReadDto, emailValidator)

  test("testUserIsValid") {
    val actualValue= userValidator.userIsValid(user)
    val expectedValue = true
    assert(actualValue===expectedValue)
  }

  test("testUserIs InValid") {
    val actualValue = userValidator.userIsValid(user2)
    val expectedValue = false
    assert(actualValue === expectedValue)
  }

}
