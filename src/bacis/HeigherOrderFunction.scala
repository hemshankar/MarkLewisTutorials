package bacis

object HeigherOrderFunction {
   def main(args:Array[String]):Unit={
    
     //passing functions to process all the elements in the collection
     
     val arr = Array(1,2,3,4,5,6,7)
     val list = List(1,2,3,4,5,6,7)
     
     val l2 = list.map(x=>x+10*math.random)
     println(l2)
     
     println(list.filter(x => x >4))
     println(list.filter(_>4))
     
     
     println(list.count(_%2==0))
     
     println(list.exists(_%11==0))
     
     println(list.forall(_>0))
     println(list.find(_%2==0))
     
     println(list.partition(_<5))
     println(list.reduce(_ - _))
     
     println(list.minBy(_*(1)))
  }
   
}