package com.hhs.scala

/**
 * Created by Personajillo on 5/16/2015.
 */
class ExtendedClassL2_2 extends ExtendedClassL1{
  override lazy val abstractMethod = super.abstractMethod + " and now it has been overridden but using its former definition"
}
