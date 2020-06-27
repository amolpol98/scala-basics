/*
  Case classes are quick lightweight data structures with little boilerplate
  Case classes have companions already implemented
  Already implemeted sensible equals, hashcode, tostring
  Auto promoted params to fields
  Cloning of objects possible
 */
object CaseClasses extends App {

  case class Person(name: String, age: Int)

  // 1. class parameters are promoted to fields
  val jim = new Person("Jim", 1)
  println(jim.name)

  // 2. Sensible toString as compared to "CaseClasses$Person@6e8dacdf" if it had been just a class
  println(jim)

  // 3. equals and hashcode implemented out of box
  val jim2 = new Person("Jim", 1)
  println(jim == jim2)

  // 4. Case classes have handy copy method
  val jim3 = jim.copy()
  println(jim3 == jim)
  val jim4 = jim.copy(age=4)
  println(jim4 == jim)

  // 5. Case classes have companion objects. Thats why dont need new while instantiating objects
  // of case class
  val thePerson = Person
  val mary = Person("Mary", 2)

  // 6. Case classes are serializable(useful in distributed systems where we need to serialize
  // objects for sending them over the network

  // 7. Case classes have extractor patterns

  case object UnitedKingdom {
    def name: String = "UK"
  }
}

