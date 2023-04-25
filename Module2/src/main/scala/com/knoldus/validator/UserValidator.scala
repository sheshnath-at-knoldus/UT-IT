
package com.knoldus.validator
import com.knoldus.db.CompanyReadDto
import com.knoldus.models.User

class UserValidator(companyReadDto: CompanyReadDto ,emailValidator: EmailValidator) {
  def userIsValid (user :User):Boolean = {
    if (companyReadDto.getCompanyByName(user.companyName).isEmpty && emailValidator.emailIdIsValid(user.emailId)) {
      false
    } else {
      true
    }

  }

}
