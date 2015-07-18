package com.hhs.scala

/**
 * Created by Personajillo on 5/16/2015.
 */
class ClassExamples {

  def listMethod[T](param : T) : List[T] = param :: Nil

  def largest(as : Int*) : Int = as.reduceLeft((a,b) => a max b) // This is a method that receives a Sequences (Seq[Int]) and returns an Int with the greater Int in it

  def methodCalled : Long = {
    println("Method called")
    println(System.currentTimeMillis().toString)
    System.currentTimeMillis
  }

  def methodCallByName(callByNameParam : => Long) = { // Method that receives a call-by-name parameter... the parameter is called inside the method and not before, as it would be in a call-by-reference execution
    println("Method Call-by-Name")
    println(s"Param ${callByNameParam}")
  }

  def methodCallByRef(callByNameParam :Long) = { // Method that receives a call-by-reference parameter, works in the traditional way
    println("Method Call-by-Reference")
    println(s"Param ${callByNameParam}")
  }

}
