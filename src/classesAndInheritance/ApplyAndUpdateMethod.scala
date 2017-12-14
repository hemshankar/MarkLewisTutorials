package classesAndInheritance

import scala.collection.mutable.Buffer

class ApplyMethod private() {
  
  def getBuff = buff
  
  private[this] var buff = Buffer[Int]()
  
  def apply(x:Int):Int = {
    return buff(x)
  }
  def update(x:Int,y:Int):Unit = {   
    buff(x) = y
  }
  
  def add(x:Int):Unit={
    buff += x
  }
}

object ApplyMethod extends App{
  
  val x = ApplyMethod()
  x.add(2)
  x.add(2)
  x.add(3)
  x.add(4)
  x.add(5)
  println(x.getBuff.mkString(","))
  x(0) = 1
  println(x.getBuff.mkString(","))
  
  def apply():ApplyMethod = {
    new ApplyMethod()
  }
}