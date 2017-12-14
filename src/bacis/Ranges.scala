package bacis

object Ranges {
   def main(args:Array[String]):Unit={
    
     val range1to10 = 1 to 10 by 2
     println(range1to10)   
     println(range1to10.step) // returns the step between 2 numbers
     
     val rangeAtoZ = 'A' to 'Z' by 5
     println(rangeAtoZ)   
     println(rangeAtoZ.step) // returns the step between 2 numbers
     
     val rangeDoubles = 1.0 to 10.0 by .9
     println(rangeDoubles)   
     println(rangeDoubles.step) // returns the step between 2 numbers
     
     val rangeBackwards = 10 to 1 by -1
     println(rangeBackwards)   
     println(rangeBackwards.step) // returns the step between 2 numbers
     
  }
}