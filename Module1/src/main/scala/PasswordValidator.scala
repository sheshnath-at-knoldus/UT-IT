
import com.typesafe.scalalogging.Logger

import scala.io.StdIn

class PasswordValidator {
  def validatePassword(username:String ,password :String) : Boolean = {
    val regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[\\d%@\\#&$])[A-Za-z\\d%@\\#&$]+$"
    if(password.matches(regex) && !password.contains(" ") && !password.contains(username)) true else false
  }
}

object SingletonObject extends App {
  private val logger =  Logger(getClass)
  private val name = StdIn.readLine()
  private val password = StdIn.readLine()
  val passwordValidator = new PasswordValidator
  logger.info("" + passwordValidator.validatePassword(name  ,password))
}

