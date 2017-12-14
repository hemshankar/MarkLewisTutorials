

package bacis

object LambdaExpressions {
   def main(args:Array[String]){
    //these are all function definitions and can be passed to any place
    val lt:(Double,Double)=> Boolean = _>_
    val lt2:(Double,Double)=> Boolean = (x,y)=>x>y
    val mul:Double =>Double = x => x*x
    val double:Double =>Double = x => x*2
    val double2:Double =>Double = _*2
    val arr = Array(1.0,2,3,4,5)
    
    println(lt(4,3))
    println(lt2(4,3))
    println(mul(4))
    println(double(4))
    println(double2(4))
    
  }
}