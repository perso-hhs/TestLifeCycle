package com.hhs.scala

/**
 * Created by Personajillo on 5/15/2015.
 */
class Circle(val radius : Double, // Class parameters created with val only generates (by scala I supposed) getter methods, it's not possible to assign values to the parameter
            val circleColor : String
              ) extends Shape{
  def this(radius : Double){ // Auxiliary constructor ... This way it's provided multiple ways to create objects of the Class, Restriction: It should call a previous defined constructor ...
    this(radius, "Green")
  }
  override def area : Double = math.Pi*radius*radius
}
