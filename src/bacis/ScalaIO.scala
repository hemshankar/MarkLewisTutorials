package bacis

import scala.io.StdIn._

object ScalaIO {
  
  def main(args: Array[String]){
   
    println("Name:")
    val name = readLine
    println("Age")
    val age = readInt
    
    println(if(age>18) s"Hello $name you are welcome" else s"Hello $name please complete your High school first")  
  }
  
}