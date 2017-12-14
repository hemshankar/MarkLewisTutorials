package bacis

object Options {
  
  /**
   * different ways of dealing where return values is an options
   */
  
  def main(args:Array[String]){
    val arr = Array(1,2,3,4,5,6)
    
    val found = arr.find(_<4)
    println(found)
    val notFound = arr.find(_<0)
    println(notFound)
    
    println(found.get)
    //println(notFound.get) //========gives error as None.get cannot be done
    
    println(found match { case None => 0; case Some(i) => i})
    println(notFound match { case None => 0; case Some(i) => i})
    
    println(found.getOrElse(0))
    println(notFound.getOrElse(0))
    
    
    //options are thought of as list, hence we can use some of the list operation
    println(notFound.map(_*2))
    println(found.map(_*2))
    
  }
  
}