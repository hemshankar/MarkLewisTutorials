package classesAndInheritance

case class Person(name: String, age: Int, gender: String)

class PersonClass (name: String, age: Int, gender: String) {
  
  
}


object CaseClasses extends App{
  
  //case class
  val person1 = new Person("Hem",30,"M")
  val person2 = new Person("Reema",30,"F") 
  val person3 = person2.copy(name="Shruti")
  val person4 = new Person("Reema",30,"F") 
  println(person1,person2,person3)
  println(person2==person4)
  
  //Normal class
  /*val person1 = new PersonClass("Hem",30,"M")
  val person2 = new PersonClass("Reema",30,"F") 
  val person3 = person2.copy(name="Shruti")
  val person4 = new PersonClass("Reema",30,"F") 
  println(person1,person2,person4)
  println(person2==person4)*/
  
}