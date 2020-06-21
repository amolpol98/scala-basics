/*
Scala doesnt have static values/methods
Scala have objects
  - Are the only instance
  - Singleton pattern in one line
Scala Companions - can access each others private members
Scala Applications
 */
object ScalaObjects extends App {
  // Scala doesnt have class level functionality (static)

  object Person {
    // class level functionality
    val N_EYES = 2
    def canFly = false

    def apply(person1: Person, person2: Person) = new Person("newperson")
  }

  class Person(val name: String) {
    // Instance level functionality

  }
  // Pattern of writing object and class with same name in the same scope is called companions

  println(Person.N_EYES)
  println(Person.canFly)

  // Scala object = Singleton instance
  val person1 = Person
  val person2 = Person
  println(person1==person2)

  val mary = new Person("mary")
  val john = new Person("john")
  println(mary==john)

  val newperson = Person(mary, john)

  // Scala applications are scala object
}
