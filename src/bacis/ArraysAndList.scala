package bacis

object ArraysAndList {
   def main(args:Array[String]):Unit={
    
     //arrays are fixed and mutable (contents are mutable)
     //list are immutable and can grow dynamically (logically)
     
     val arr = Array(1,2,3,4,5)
     val list = List(1,2,3,4,5)
     
     println(arr.mkString(",") + "   " + list)
     println(arr(2), list(2))
     
     arr(2) = 7;
     //list(2) = 7; -- error
     println(arr.mkString(",") + "   " + list)
     
     val list2 = 4::list
    
     println(arr.mkString(",") + "   " + list2)
     
     println(arr.toList + "   " + list.toArray.mkString(","))
  }
   
   
}