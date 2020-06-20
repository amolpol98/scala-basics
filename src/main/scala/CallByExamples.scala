/*
Call by Value:
  Value is computed before call
  Same value used everywhere
Call by Name:
  Expression is passed literally
  Expression is evaluated at every use
 */

object CallByExamples extends App {
  def callByValue(x: Long) = {
    println("by value: " + x)
    println("by value: " + x)
  }

  def callByName(x: => Long) = {
    println("by name: " + x)
    println("by name: " + x)
  }

  callByValue(System.nanoTime())
  callByName(System.nanoTime())

}
