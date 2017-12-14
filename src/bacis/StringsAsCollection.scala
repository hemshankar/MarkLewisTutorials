package bacis

object StringsAsCollection {
  def main(args:Array[String]):Unit={
     println("this is a test".filter(_<'l'))
     println("this is a test".filter(x=>"aeiou".contains(x)))
     println("this is a test".map(x=> if(x=='t') 'T' else x))
  }
}