
package com.knoldus.db

import com.knoldus.models.Company
import org.scalatest.funsuite.AnyFunSuiteLike

class CompanyReadDtoTest extends AnyFunSuiteLike {
  val companyReadDto = new CompanyReadDto
  val knoldusCompany: Company = Company("Knoldus", "knoldus@gmail.com", "Noida")

  test("testGetCompanyByName") {
    val actualValue = companyReadDto.getCompanyByName(knoldusCompany.name).getOrElse()
    val expectedValue = Company("Knoldus", "knoldus@gmail.com", "Noida")
    assert(actualValue === expectedValue)
  }

  test("testCompanies") {
    val actualValue = companyReadDto.companies.contains("Knoldus")
    val expectedValue = true
    assert(actualValue === expectedValue)
  }

}
