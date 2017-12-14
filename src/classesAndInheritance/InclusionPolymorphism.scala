package classesAndInheritance

/**
 * Inheitance and subtyping
 */
object InclusionPolymorphism extends App{
   
  def printShapeData(s:Shape){
    println(s"${s.name} has area ${s.area}")
  }
  
  val rect = new Rectangle(3,5)
  val circle = new Circle(3)
  val square = new Square(4)
  
  printShapeData(rect)
  printShapeData(circle)
  printShapeData(square)
  
}





trait HasColor{
  var color : String = "Red"
  def fillColor(c:String)
}

abstract class Shape{
  var name = "Un-named"
  def area: Double
  def setName(n:String) = name = n
}

class Rectangle(val width:Double, val height:Double) extends Shape with HasColor{
  super.setName("Rectangle")
  override def area : Double = width*height
  def fillColor(c:String) = color = c
  
}

class Circle(rad:Double) extends Shape{
  super.setName("Cicle")
  override def area:Double = math.Pi * rad*rad
}

/**
 * here length variable is not stored in the Square class and is directly using the length variable of the Rectangle class
 */
case class Square(length: Double) extends Rectangle(length,length){
  super.setName("Square")
}
