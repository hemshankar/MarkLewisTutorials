

package bacis

object IFsInScala {
  //if unlike other programming language returns a expression.
   def main(args:Array[String]):Unit={
    println(if(4>5) "greater" else "lesser")
    println(if(4>3) "greater" else "lesser")
    println(if(4>5) "greater") //returns an object of type Any if else part is not defined
    
    //make sure you always have a else part and both true and false condition returns the same types
    
  }
}