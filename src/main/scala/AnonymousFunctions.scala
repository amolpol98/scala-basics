object AnonymousFunctions extends App {

  // Syntactic sugar for Function1[Int, Int] (LAMBDA)
  val doubler: Int => Int = x => x*2

  // multiple params in lambda
  val adder:(Int, Int) => Int = (a: Int, b:Int) => a+b

  // no params
  val justDoSomething: () => Int = () => 3

  println(justDoSomething)  // function itself
  println(justDoSomething())  // call

  // curly braces with lambda
  val stringToInt = { (str: String) =>
    str.toInt
  }

  // More Syntactic sugar
  val niceIncrementer: Int => Int = _ + 1
  val niceAdder: (Int, Int) => Int = _ + _

  val superAdd = (x: Int) => (y: Int) => x + y
  println(superAdd(3))
}
