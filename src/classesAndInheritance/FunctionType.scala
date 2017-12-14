package classesAndInheritance

object FunctionType extends App{
  
  val f = new Fun
  
  println(f(3))
  
  val a = Array(1,2,3,4,5,6,7,8)
  //we can pass an instance of the class Fun as a function in the map method  
  println(a.map(f).mkString(","))
  
}

class Fun extends (Int => Int){
  
  val arr = Array(10,20,30,40,50,60,70,80,40,50)
  
  def apply(i:Int) = arr(i)
  
}