package com.hhs.scala

/**
 * Created by Personajillo on 5/16/2015.
 */
trait ShapeCompanionObject {
  def area : Double
}

object ShapeCompanionObject {
  private class RectangleCompanion(val height : Double, val width : Double) extends ShapeCompanionObject{
    override val area : Double = height*width
  }
  private class CircleCompanion(val radius : Double) extends ShapeCompanionObject{
    override val area : Double = math.Pi * radius * radius
  }

  def apply(height :Double, width :Double) : ShapeCompanionObject = new RectangleCompanion(height, width)
  def apply(radius : Double) : ShapeCompanionObject = new CircleCompanion(radius)
  def apply(someString : String) : String = s"Trying something rather strange... ${someString}"
}


