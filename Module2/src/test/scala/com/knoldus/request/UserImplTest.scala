
package com.knoldus.request

import com.knoldus.db.CompanyReadDto
import com.knoldus.models.User
import com.knoldus.validator.{EmailValidator, UserValidator}
import org.scalatest.funsuite.AnyFunSuiteLike

class UserImplTest extends AnyFunSuiteLike {

  val companyReadDto = new CompanyReadDto
  val emailValidator = new EmailValidator
  val userValidator = new UserValidator(companyReadDto, emailValidator)
  val userImpl = new UserImpl(userValidator)
  val user: User = User("Sheshnath", "Yadav", 23, "Knoldus", "sheshnath.yadav@knoldus.com")
  val user2: User = User("Sheshnath", "Yadav", 23, "Zepto", "sheshnath.yadav@Zepto.com")

  test("testCreateUser1") {
    val actualValue = userImpl.createUser(user)
    val expectedValue = Some("sheshnath.yadav@knoldus.com")
    assert(actualValue===expectedValue)
  }

  test("testCreateUser2") {
    val actualValue = userImpl.createUser(user2)
    val expectedValue = None
    assert(actualValue === expectedValue)
  }

}
