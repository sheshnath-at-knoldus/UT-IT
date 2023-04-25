
package com.knoldus.validator

class EmailValidator {
  def emailIdIsValid(emailId: String): Boolean = {
    val validator = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$"
    if (emailId.matches(validator)) true else false
  }
}