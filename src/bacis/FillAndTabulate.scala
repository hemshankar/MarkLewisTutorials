package bacis

object FillAndTabulate {
  
  //to create and have control over the values inserted in the array/list while declaration 
  //we should use fill or tabulate
  
   def main(args:Array[String]):Unit={
     
     val arr = Array.fill(10)(0) //instantiates array with all 0s
     arr.foreach(print)
     println()
     val list = List.fill(10)((math.random*10).toInt) //fills list with random numbers
     list.foreach(print)
     println()
     val notToBeUsedArray = new Array[Int](10) //creates array with all default value(0)
     notToBeUsedArray.foreach(print)
     println()
     val notToBeUsedString = new Array[String](10) // creates array with all null values
     notToBeUsedString.foreach(print)
     println()
     //use tabulated when you want values in the list/array specific to the index
     val arr2 = Array.tabulate(10)(x => x * 2) //creates array with double of every index
     arr2.foreach(print)
     println()
     val list2 = List.tabulate(10)(x => x * x) //creates a list with squared of a number
     list2.foreach(print)
     println()
  }
}