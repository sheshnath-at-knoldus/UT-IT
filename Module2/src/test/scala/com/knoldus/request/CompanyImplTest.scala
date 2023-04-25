
package com.knoldus.request

import com.knoldus.db.CompanyReadDto
import com.knoldus.models.Company
import com.knoldus.validator.{CompanyValidator, EmailValidator}
import org.scalatest.funsuite.AnyFunSuiteLike

class CompanyImplTest extends AnyFunSuiteLike {

  val companyReadDto = new CompanyReadDto
  val emailValidator = new EmailValidator
  val companyValidator = new CompanyValidator( companyReadDto, emailValidator)
  val companyImpl = new CompanyImpl(companyValidator)
  val knoldusCompany: Company = Company("Knoldus", "knoldus@gmail.com", "Noida")
  val zeptoCompany: Company = Company("Zepto", "Zepto@gmail.com", "Noida")

  test("testCreateCompany") {
    val actualValue = companyImpl.createCompany(knoldusCompany)
    val expectedValue = None
    assert(actualValue===expectedValue)
  }

  test("testCreateCompany that not exist") {
    val actualValue = companyImpl.createCompany(zeptoCompany)
    val expectedValue = Some("Zepto")
    assert(actualValue === expectedValue)
  }

}
