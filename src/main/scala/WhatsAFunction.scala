/*
  We want to work with functions:
    * pass functions as parameters
    * use functions as values
  Solution: ALL Scala functions are objects
    * Using function traits, upto 22 params
    
 */
object WhatsAFunction extends App {
  // Use functions as first class elements

  val doubler = new MyFunction[Int, Int] {
    override def apply(element: Int): Int = element * 2
  }

  // here doubler is called as an function, which is an instance of the class
  println(doubler(2))

  val stringToIntConverter = new Function[String, Int] {
    override def apply(string: String): Int = string.toInt
  }

  println(stringToIntConverter("3"))

  // ((Int, Int) => Int) is syntactic sugar for function2
  val adder: ((Int, Int) => Int) = new Function2[Int, Int, Int] {
    override def apply(v1: Int, v2: Int): Int = v1 + v2
  }

  // ALL SCALA FUNCTIONS ARE OBJECTS

  def concatenator: (String, String) => String = new Function2[String, String, String] {
    override def apply(v1: String, v2: String): String = v1 + v2
  }

  println(concatenator("hello", "scala"))

  // Function1[Int, Function1[Int, Int]]
  val superAdder: Function1[Int, Function1[Int, Int]] = new Function1[Int, Function1[Int, Int]] {
    override def apply(x: Int): Int => Int = new Function1[Int, Int] {
      override def apply(y: Int): Int = x + y
    }
  }

  val adder3 = superAdder(3)
  println(adder3(4))
  println(superAdder(3)(4)) // curried function
}

trait MyFunction[A, B] {
  def apply(element: A): B
}
