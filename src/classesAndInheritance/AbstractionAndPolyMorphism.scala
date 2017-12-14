package classesAndInheritance

class AbstractionAndPolyMorphism {
  
}
/**
 * Function level abstraction
 */
object TestIt extends App {
  def addValues(a: Int, b:Int):Int={
    a+b
  }
  def substructValues(a: Int, b:Int):Int={
    a-b
  }
  def combineValues(a: Int, b:Int,op:(Int,Int) => Int ):Int={
    op(a,b)
  }
  
  println(addValues(1,3))
  println(substructValues(1,3))
  println(combineValues(1,3,(x,y)=>x*y))
  
}