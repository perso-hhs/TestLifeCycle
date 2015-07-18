package com.hhs.scala

/**
 * Created by perso on 7/06/15.
 */
object C4FunctProgScala {

  def functWithFunctParam(functParam:(Int, Int) => Int, width : Int, height : Int) = {
    println(s"Calling the function parameter ${functParam(width,height)}")
  }

  def greeting(note : String) = (name: String) => {"hello" + " " + name + " CUSTOMIZE NOTE: " + note}

  def main(args : Array[String]): Unit ={
    val add = (x : Int, y : Int) => x + y // Defining a function value

    println(s"Calling the previously defined 'add' function value ${add(3,4)}")

    val areaOfRectangle:(Int, Int) => Int = (width:Int, height:Int) => {
      width*height
    }

    functWithFunctParam(areaOfRectangle, 10, 2)

    val greet = greeting("Dump note")

    println(s"Greeting ... ${greet("Perso")}")

    // Closure -> It's not well explain in the book, so I'll try to play around and see how it works

    var y = 5

    val multiplier1: (Int) => Int = (x : Int) => x * 3

    println(s"Normal multiplier ${multiplier1(3)}")

    val multiplier2: (Int) => Int = (x : Int) => x * y

    println(s"Closure multiplier before changing variable ${multiplier2(3)}")

    y = 10

    println(s"Closure multiplier after changing variable ${multiplier2(3)}")

  }

}
