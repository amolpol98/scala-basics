/*
  1. We can instantiate types and override fields or methods on the spot using Anonymous classes
    Rules:
      * pass in required constructor arguments if needed
      * implement all abstract fields/methods
  2. Anonymous classes work for traits and classes (abstract too)
 */
object AnonymousClasses extends App {
  abstract class Animal {
    def eat: Unit
  }

  // anonymous class
  val funnyAnimal: Animal = new Animal {
    override def eat: Unit = println("funny animal eats")
  }
  /*
  equivalent with

  class AnonymousClasses$$anon$1 extends Animal {
    override def eat: Unit = println("funny animal eats")
  }

  val funnyAnimal: Animal = new AnonymousClasses$$anon$1
   */

  println(funnyAnimal.getClass)

  class Person(name: String) {
    def sayHi: Unit = println("My name is $name")
  }

  val jim = new Person("Jim") {
    override def sayHi: Unit = println("Jim says hi")
  }
}
