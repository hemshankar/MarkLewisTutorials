

package bacis

object ForLoops {
  def main(args : Array[String]):Unit={
    
    println("simple for loop")
    for(i<-0 until 10){
      print(i + " ")
    }
    
    println("\nconditioned for loop") 
    for(i<-0 until 10; if i %3==0){
      print(i + " ")
    }
    
    println("\n Nested for loop") 
    for(i<-0 until 10; j<-0 until 2){
      print(s"$i,$j <-> ")
    }
    
    println("\n Extra vales for loop") 
    for(i<-0 until 10; x = i*2){
      print(s"($i,$x) , ")
    }
    
    println("\n All togather with for conditions and statements in a block") 
    for{
      i<-0 until 10
      j<-1 until 3
      if i %3==0
      x = i*j}{
      print(s"($i*$j=$x) , ")
    }
      
    
    println("\n For loop yielding a value") 
    val yieldedValue = for{
      i<-0 until 10
      j<-1 until 3
      if i %3==0
      x = i*j}
    yield {
      (i,j,x)
    }
    println(yieldedValue)
    
  }
}