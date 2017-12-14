package classesAndInheritance

object Enums extends Enumeration{
  val Red, Green, Yellow = Value
}

object Test extends App{
  val x = Enums.Green
  
  println(x)
  
  def printSignal(enum:Enums.Value):Unit={
    enum match {
      case Enums.Red => println("Its Red Please Stop")
      case Enums.Green => println("Its Green Please Move")
      case Enums.Yellow => println("Its Yellow Please Slow Down")
    }
  }
  
  printSignal(Enums.Red)
  printSignal(Enums.Yellow)
  printSignal(Enums.Green)
  
}
