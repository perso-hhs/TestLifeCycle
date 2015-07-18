package com.hhs.scala

/**
 * Created by Personajillo on 5/23/2015.
 */
class Bike(speed : Int) extends Vehicle(speed){

  override val mph : Int = speed
  override def race() = println("Racing Bike")
}
