package bacis

object ListsDemo {
  def main(args:Array[String]):Unit={
    
    val list = List(1,2,3,4,5,6,7,7) // is a linked list
    println(list)
    println(list.drop(2))
    println(list.dropRight(2))
    println(list.head)
    println(list.tail)
    println(list.last)
    println(list.splitAt(3))
    println(list.take(3))
    println(list.takeRight(3))
    println(list.slice(2,5))
    println(list.patch(1,Array(9,7),3))
    println(list.diff(Array(1,2,3,4,9)))
    println(((Array(1,1,2,2,3,3)).diff(Array(1,2,3))).mkString(","))
    println(list.distinct)
    val list2 = list.zipWithIndex;
    //list2.map(((x:Int,y:Int))=>(y,x))
    val reverseMap = list2.map(_.swap)
    println(list2)
    println(reverseMap)
       
  }
}