
package com.knoldus.validator

import com.knoldus.db.CompanyReadDto
import com.knoldus.models.Company
import org.scalatest.funsuite.AnyFunSuiteLike

class CompanyValidatorTest extends AnyFunSuiteLike {

  val companyReadDto = new CompanyReadDto
  val emailValidator = new EmailValidator

  test("testCompanyIsValid") {
    val knoldusCompany: Company = Company("Knoldus", "knoldus@gmail.com", "Noida")
    val companyValidator = new CompanyValidator(companyReadDto,emailValidator)
    val actualValue = companyValidator.companyIsValid(knoldusCompany)
    val expectedValue = false
    assert(actualValue===expectedValue)
}
  test("testCompanyIs InValid") {
    val knoldusCompany: Company = Company("Zepto", "Zepto@gmail.com", "Noida")
    val companyValidator = new CompanyValidator(companyReadDto,emailValidator)
    val actualValue = companyValidator.companyIsValid(knoldusCompany)
    val expectedValue = true
    assert(actualValue === expectedValue)
  }

}
