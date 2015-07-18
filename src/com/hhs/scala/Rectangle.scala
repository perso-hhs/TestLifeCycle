package com.hhs.scala

/**
 * Created by Personajillo on 5/15/2015.
 */
class Rectangle (var width : Double, // Class parameters created with var generates both getter and setter methods it's possible to assign new values to the parameter
                 private var height : Double, // Class parameters created with private (var or val) prevent the creation of getter and setter methods. They are only accessible within the class' members
                rectColor : String // Class parameters created without var/val, behave similar to 'private var/val' but is even more restricted, they are only accessible within the object that creates them, contrary to the 'private' generated parameters that can be accessed within class' members either its the same object or another object of the class
                  ) extends Shape{
  override def area : Double = width*height
}
