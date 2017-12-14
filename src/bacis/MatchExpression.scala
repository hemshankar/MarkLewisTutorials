

package bacis

object MatchExpression {
  
  //fizz-buzz problem, if num%3=0 fizz,num%5=0 buzz both fizz buzz else num
  def main(args:Array[String]){
    
  val result =  for(i<- 0 until 10) yield {
      if(i%3==0 && i%5 == 0) "fizzbuzz"
      else if(i%3==0) "fizz"
      else if(i%5 == 0) "buzz"
      else i.toString  
    }
    
  result.foreach(println)
  
  
  val result2 =  for(i<- 0 until 10) yield {
      (i%3,i%5) match {
        case(0,0) => "fizzbuzz"
        case(0,_) => "fizz"
        case(_,0) => "buzz"
        case _ => i.toString
      }
    } 
  
  result2.foreach(println)
  }
}