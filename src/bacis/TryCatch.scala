

package bacis

object TryCatch {
  def main(args: Array[String]){
    val value = try{
      "123a".toInt
    }catch{
      case ex2:NumberFormatException => 0  
      case ex:Exception => throw ex        
    }
  }
}