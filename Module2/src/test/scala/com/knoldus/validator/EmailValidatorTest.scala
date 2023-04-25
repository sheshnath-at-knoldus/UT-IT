
package com.knoldus.validator

import org.scalatest.funsuite.{AnyFunSuite, AnyFunSuiteLike}

class EmailValidatorTest extends AnyFunSuite {

  test("Email test") {
    val emailValidator = new EmailValidator
    val actualValue = emailValidator.emailIdIsValid("Hyesheshnath@gmail.com")
    val expectedValue = true
    assert(actualValue === expectedValue)
  }

  test("Email test for incorrect type") {
    val emailValidator = new EmailValidator
    val actualValue = emailValidator.emailIdIsValid("Hyesheshnathgmail.com")
    val expectedValue = false
    assert(actualValue === expectedValue)
  }
}
