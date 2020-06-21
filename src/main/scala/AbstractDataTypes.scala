object AbstractDataTypes extends App {

  // abstract
  abstract class Animal {
    val creatureType: String = "wild"
    def eat: Unit
  }

  class Dog extends Animal {
    override val creatureType = "Canine"
    override def eat = println("crunch crunch")
  }

  // trait
  trait Carnivore {
    def eat(animal: Animal): Unit
    val preferredMeal = "fresh meal"
  }

  trait ColdBlooded

  class Crocodile extends Animal with Carnivore with ColdBlooded  {
    override val creatureType: String = "Croc"

    def eat: Unit = println("nomnomnom")

    def eat(animal: Animal): Unit = println(s"I am a croc and eating ${animal.creatureType}")
  }

  val dog = new Dog
  val crocodile = new Crocodile
  crocodile.eat(dog)

  // traits vs abstract classes
  // 1 - traits do not have class parameters
  // 2 - Multiple traits may be inherited by scala
  // 3 - traits are behaviour, abstract class = "thing"
}
