package classesAndInheritance

class ParamatricPolymorphism {
  
}

class ToDoValues[A] private (private val values:Array[Option[A]] ) {
  
  
  def apply(hour:Int) = values(hour).get
  def get(hour:Int):Option[A] = values(hour)
  
  def update(hour:Int, value: A):Unit = values(hour) = Some(value)
  
  def clear(hour:Int) = values(hour) = None
  
  def combine[B,C](other: ToDoValues[B])(fun:(Option[A],Option[B])=>Option[C]): ToDoValues[C] = {
    val result = ToDoValues[C]

    for((v , i) <- (values, other.values).zipped.map((v1,v2)=>fun(v1,v2)).zipWithIndex){
      result.values(i) = v
    }
        
    result
  }
  
}

object ToDoValues extends App{
  val one = ToDoValues[Int]
  
  one(4) = 2
  one(2) = 20
  one(6) = 30
  
  
  val two = ToDoValues[Int]
  
  two(1) = 50
  two(3) = 8
  two(5) = 7
  two(6) = 7
  
  
  val res = one.combine(two)((x,y)=> (x ,y) match {
    case (None,None) => None
    case (Some(a),None) => Some(a)
    case (None,Some(y)) => Some(y)
    case (Some(a),Some(b)) => Some(a+b)
  })
  
  res.values.foreach(println)
  
  def apply[A]():ToDoValues[A] = new ToDoValues(Array.fill(24)(None))
  
  def apply[A](a: A*):ToDoValues[A] = {
    val opts = a.map(Option(_)).toArray    
    new ToDoValues(if(opts.length > 24) opts.take(24) else if (opts.length < 24) opts.padTo(24, None) else opts)    
  }
}