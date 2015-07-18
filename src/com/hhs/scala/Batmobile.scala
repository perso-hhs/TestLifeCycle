package com.hhs.scala

/**
 * Created by Personajillo on 5/23/2015.
 */
class Batmobile(speed : Int) extends Vehicle(speed) with Flying with Gliding{
  override val mph : Int = speed
  override def race() = println("Racing Batmobile")
  override def fly() = println("Flying Batmobile")
  override def gliding() = println("Gliding Batmobile")
}
