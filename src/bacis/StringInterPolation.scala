

package bacis

object StringInterPolation {
   def main(args:Array[String]):Unit={
     val name = "Hem"
     val t = (1,2,3)
     val message = s"This is $name"
     val thirdElemen = s"The third element is ${t._3}"
     
     println(message)
     println(thirdElemen)
  }
   
}