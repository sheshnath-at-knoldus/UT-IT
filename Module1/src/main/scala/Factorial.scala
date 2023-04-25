

class Factorial  {
   def getFactorial(number :Int ,accumulator :Int=1) : Int = {
     number match {
       case value if(value < 0) =>Int.MinValue
       case 0  =>  accumulator
       case _  =>  getFactorial(number - 1, accumulator * number)
     }
   }
}
