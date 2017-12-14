package collections

class MapExamples {
  
}

object Main extends App{
  def usingArrays(){
    case class Info(sex: Char, year: Int, name: String, count: Int)
    
    val allData = for( stateFile <- new java.io.File("BabyNames").list(); if (stateFile.endsWith("TXT"))) yield {
     val stateInfo = {
        val source = io.Source.fromFile(s"BabyNames/$stateFile")
        
        val details = source.getLines().filter(_.nonEmpty).toArray.map(_.split(","))
        .map(x => new Info(x(1)(0),x(2).toInt,x(3),x(4).toInt))
        
        source.close()
        details
      } 
     (stateFile.take(2),stateInfo)
    }
    val name = "Mark"
    
    val result = allData.map(i => (i._1,i._2.filter(x=>x.name == name).maxBy(_.count)))
    println(result.mkString("\n"))
  }
  
  def usingMaps(){
    case class Info(sex: Char, year: Int, name: String, count: Int)
    
    val allData = for( stateFile <- new java.io.File("BabyNames").list(); if (stateFile.endsWith("TXT"))) yield {
     val stateInfo = {
        val source = io.Source.fromFile(s"BabyNames/$stateFile")
        
        val details = source.getLines().filter(_.nonEmpty).toArray.map(_.split(","))
        .map(x => new Info(x(1)(0),x(2).toInt,x(3),x(4).toInt)).groupBy(_.name)
        
        source.close()
        details
      } 
     (stateFile.take(2),stateInfo)
    }
    val name = "Mark"
    
    val result = allData.map(x=>(x._1,x._2(name).maxBy(_.count)))
        //x=>(x._1,x._2.map(y=>y._2.toArray.maxBy(_.count)).toArray))
    println(result.mkString("\n"))
  }
  
  usingMaps()
}
