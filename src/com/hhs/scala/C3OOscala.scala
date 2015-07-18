package com.hhs.scala

/**
 * Created by Personajillo on 5/15/2015.
 */
object C3OOscala { // 'object' is a singleton class
  def main(args: Array[String]) {
    val thisIsACircleObj = new Circle(radius = 3 )
    println(s"The area of the circle is: ${thisIsACircleObj.area}.\nAnd its color: ${thisIsACircleObj.circleColor}")

    val thisIsARectObj = new Rectangle(10, 20, rectColor = "Red")
    println(s"The area of the circle is: ${thisIsARectObj.area}")
    thisIsARectObj.width = 15
    println(s"The area of the circle is: ${thisIsARectObj.area}")

    val thisIsAnObjExample = new ClassExamples
    val listOfInteger = thisIsAnObjExample.listMethod(2)
    for(listMember <- listOfInteger)
      println(listMember)

    val listOfString = thisIsAnObjExample.listMethod("Hello strange way of create dynamic-type lists")
    for(listMember <- listOfString)
      println(listMember)

    println(s"Don't have the slightest idea of what this is doing -> ${thisIsAnObjExample.largest(1)}")
    println(s"Don't have the slightest idea of what this is doing -> ${thisIsAnObjExample.largest(2,3,99)}")
    println(s"Don't have the slightest idea of what this is doing -> ${thisIsAnObjExample.largest(33,22,33,22)}")

    val extObjL1 = new ExtendedClassL1
    val extObjL2 = new ExtendedClassL2_1
    val extObjL3 = new ExtendedClassL2_2

    println(s"Value of abstractMethod in Object of the level 1 -> ${extObjL1.abstractMethod}" )
    println(s"Value of abstractMethod in Object of the level 2 -> ${extObjL2.abstractMethod}" )
    println(s"Value of abstractMethod in Object of the level 3 -> ${extObjL3.abstractMethod}" )

    println("Executing method call-by-name...")
    thisIsAnObjExample.methodCallByName(thisIsAnObjExample.methodCalled)

    println("\nExecuting method call-by-reference...")
    thisIsAnObjExample.methodCallByRef(thisIsAnObjExample.methodCalled)

  println("Companion Objects... ") // I think, I kind of get it... Although its not entire clear to me the use and how it completely works

  val thisIsACircleFromShapeComp = ShapeCompanionObject(4);
  val thisIsARectangleFromShapeComp = ShapeCompanionObject(10,20);
  val thisIsAnStringFromShapeComp = ShapeCompanionObject("This is just an String");

  println(s"Shape Companion Object ${thisIsACircleFromShapeComp}")
  println(s"Shape Companion Object ${thisIsARectangleFromShapeComp}")
  println(s"Shape Companion Object ${thisIsAnStringFromShapeComp}")

  val thisIsACar = new Car(200)
  val thisIsABike = new Bike(20)
  thisIsACar.race()
  thisIsABike.race()

  val thisIsABatmobile = new Batmobile(300)
  thisIsABatmobile.race()
  thisIsABatmobile.fly()
  thisIsABatmobile.gliding()

  val thisIsAnStuff = Stuff("Horacio", 29)
  println(s"Name: ${thisIsAnStuff.name}; Age : ${thisIsAnStuff.age}" )
  println(thisIsAnStuff.toString)
  println(thisIsAnStuff.hashCode())
  println(thisIsAnStuff == Stuff("Horacio", 28))

}
}
