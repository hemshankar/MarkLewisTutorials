

package bacis

object Variables {
   def main(args:Array[String]):Unit={
    
     val tuple = (1,3.14,"Pi")
     
     println(tuple)
     
     val (_,a,b) = tuple
     
     println(b)
  }
}