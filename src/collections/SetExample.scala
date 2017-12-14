package collections

object SetExample extends App {
  val year = 2015
  
  val nationalData = {
    val source = io.Source.fromFile(s"BabyNames/yob$year.txt")
    val names = source.getLines().filter(_.nonEmpty).map(_.split(",")(0)).toSet //toArray just this one change caused 100x speed gain
    source.close()
    
    println(names.take(10).mkString(","))
    names
  }
  
  val statesInfo = for( stateFile <- new java.io.File("BabyNames").list(); if (stateFile.endsWith("TXT"))) yield{
      
      val source = io.Source.fromFile(s"BabyNames/$stateFile")
      val lines = source.getLines()
      val names = lines.filter(_.nonEmpty).filter(d => d.split(",")(2).toInt == year).map(a=>a.split(",")(3)).toArray
      source.close()   
      names
  }
  
  val time = (System.nanoTime()/1e9)
  for(info <- statesInfo){  
    val count = info.count(n=>nationalData.contains(n))
    println(count.toDouble/nationalData.size  )
  }
  println("Time taken = " + (System.nanoTime()/1e9 - time))
    
}