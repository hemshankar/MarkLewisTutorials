package bacis

import scala.io.StdIn._

object ListRecursionPatterns {
   def main(args:Array[String]):Unit={    
     
    println(concatStrings(buildStringList()));
    println(concatStringPat(buildStringList()));
    
  }
   
   //below are the few examples where we can use recursion and pattern
   //with list.
   
   //However we should take care of stack-overflow, and should use tail recursion
   //Tail recursion converts a recursion into iteration internally
   
   def buildStringList():List[String] = {
     val input = readLine()
     if(input == "quit") Nil
     else input :: buildStringList()
   }
   
   def concatStrings(lst:List[String]):String = {     
     if(lst.isEmpty) ""
     else lst.head + concatStrings(lst.tail)
   }
   
   //does same as above
   def concatStringPat(lst:List[String]):String = lst match {
     case Nil => ""
     case h :: t => h+concatStringPat(t)
   }
}