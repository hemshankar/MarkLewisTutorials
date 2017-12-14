package classesAndInheritance

object GlobalSort extends App {
  
  def bubbleSort[A <% Ordered[A]](arr:Array[A]):Unit={
    for(i <- 0 until arr.length-1 ;j <- i+1 until arr.length){
      
      if(arr(i) > arr(j)){
        val tmp = arr(i)
        arr(i) = arr(j)
        arr(j) = tmp
      }
            
    }
  }  
  
  def bubbleSortCurrey[A](arr: Array[A])(comp: (A,A)=> Boolean):Unit = {
    for(i<-0 until arr.length -1;j<- i+1 until arr.length){
      if(comp(arr(i),arr(j))){
        val tmp = arr(i)
        arr(i) = arr(j)
        arr(j) = tmp
      }
    }
        
  }
  
  var arr = Array(2,3,4,5,32,2)
  bubbleSort(arr)
  println(arr.mkString(","))
  var arrDouble = Array.fill(20)(math.random)
  bubbleSort(arrDouble)
  println(arrDouble.mkString(","))
  
  arr = Array(42,23,14,5,32,12)
  bubbleSortCurrey(arr)(_ > _)
  println(arr.mkString(","))
  
  var arrString = Array("A","This","Is", "Sparta")
  bubbleSortCurrey(arrString)((x,y)=>(x.length < y.length))
  println(arrString.mkString(","))
}