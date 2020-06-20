/*
Infix notation: for methods with one parameter
object method parameter
Prefix notation: only allowed for +,-,!,~
Postfix notation: for methods with no parameter
apply()
 */

object SyntaticSugars extends App {

  class Person(val name: String, favouriteMovie: String) {
    def likes(movie: String) = movie == favouriteMovie
    def +(person: Person) = s"${this.name} is hanging out with ${person.name}"
    def unary_! : String = s"$name prefixed with !"
    def isAlive = true
    def apply(): String = s"My name is $name and favorite movie is $favouriteMovie"
  }

  val person1 = new Person("person1", "Interstellar")
  println(person1.likes("Interstellar"))

  // inflix notation, works only with methods with one paramter
  println(person1 likes "Interstellar")

  // "operators" in scala
  val person2 = new Person("person2", "Avengers")
  // hangoutwith is acting like operators. just like +/- etc in maths
  println(person1 + person2)
  println(person1.+(person2))

  // ALL OPERATORS ARE METHODS
  println(1+2)
  println(1.+(2))

  // Style of calling methods in infix notation is called syntactic sugar

  // prefix notation also syntactic sugar
  println(!person1)
  println(person1.unary_!)

  // postfix notation
  println(person1.isAlive)
  println(person1 isAlive)

  // apply - object can be called as function when there is apply method defined in the class
  println(person1.apply())
  println(person1())
}
