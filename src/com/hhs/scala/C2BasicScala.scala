package com.hhs.scala


/**
 * Created by Personajillo on 5/15/2015.
 */
object C2BasicScala {

  def firstFunct(aString : String, aNumber : Int): String = s"${aString}${aNumber}"


  def main (args: Array[String]) : Unit = { // Unit works as void in scala
    val thisIsANumber : Int = 34 // Variables defined with val cannot be changed

    var thisIsAString : String = "Hello World number: " // Variables defined with var can be changed

    val thisIsAnInterpolationTry : String = s"Hello Interpolation: ${thisIsANumber}"

    lazy val thisIsAnotherString1 : String = thisIsAString + thisIsANumber // This variable is 'calculated' when called, works as a val variable so cannot be changed
    lazy val thisIsAnotherString2 : String = thisIsAString + thisIsANumber // This variable is 'calculated' when called, works as a val variable so cannot be changed

    println(thisIsAnotherString1)
    thisIsAString = "Bye cruel world : "
    println(thisIsAnotherString2)
    println(thisIsAnotherString1)
    println(thisIsAnInterpolationTry)
    println(firstFunct("Calling a function -> ", 7))

    val thisIsAnStringArray: Array[String] = new Array[String](5)
    thisIsAnStringArray(0) = "Hello "
    thisIsAnStringArray(1) = "First "
    thisIsAnStringArray(2) = "Array, "
    thisIsAnStringArray(3) = "Looking "
    thisIsAnStringArray(4) = "Nice !!"
    print(thisIsAnStringArray(0))
    print(thisIsAnStringArray(1))
    print(thisIsAnStringArray(2))
    print(thisIsAnStringArray(3))
    println(thisIsAnStringArray(4))

    val thisIsAnEmptyList: List[String] = Nil
    val thisIsAStrangeWayList = "Hello First " :: ("Strange-Looking " :: ("Creation List, " :: ("Not Nice At All!!" :: Nil))) // It wasn't working at first but adding missing Nil at the end made the trick... Anyway I don't think is a good idea to use this strange way to create a simple fucking List

    print(thisIsAStrangeWayList(0))
    print(thisIsAStrangeWayList(1))
    print(thisIsAStrangeWayList(2))
    println(thisIsAStrangeWayList(3))

    val thisIsARange1 : Range = 5 to 10 // Upper boundary included
    val thisIsARange2 : Range = 5 until 10 // Upper boundary excluded
    val thisIsARange3 : Range = 5 until 10 by 2 // Upper boundary excluded counting by 2
    println(s"Range: ${thisIsARange1(0)} - ${thisIsARange1(1)} - ${thisIsARange1(2)} - ${thisIsARange1(3)} - ${thisIsARange1(4)} - ${thisIsARange1(5)}")
    println(s"Range: ${thisIsARange2(0)} - ${thisIsARange2(1)} - ${thisIsARange2(2)} - ${thisIsARange2(3)} - ${thisIsARange2(4)} ")
    println(s"Range: ${thisIsARange3(0)} - ${thisIsARange3(1)} - ${thisIsARange3(2)} ")

    val thisIsATuple = "Hello" -> "don't-see-the-point tuple" // This is a tuple... What can I say...?
    println(s"Tuple: ${thisIsATuple._1} - ${thisIsATuple._2} ")

    // It'll start to get interesting ....

    val thisIsABoolean = true
    val thisIsAnIfExp : Int = if (thisIsABoolean) 1 else 3

    println(s"Result of If Exp true -> ${thisIsAnIfExp}")

    val thisIsAListCopy = "[Copy of a previous List] - " :: thisIsAStrangeWayList

    // Normal for ...
    for (listElement <- thisIsAListCopy)
      print(listElement )
    println("")


    // For with filtering applied
    for (listElement <- thisIsAListCopy if listElement.contains("Strange"))
      print(listElement )
    println("")

    // WTF for ... Note: {} instead of () !!
    for {listElement <- thisIsAListCopy
         tranformedElement = listElement.toUpperCase()}
      print(tranformedElement)

    println("")

    // Let's create a List with the For ... Note: {} instead of () !!

    val thisIsAListUsingFor = for{listElement <- thisIsAListCopy if listElement.toUpperCase().contains("A")} yield listElement

    for(listElement <- thisIsAListUsingFor)
      print(listElement)
    println("")

    // Try/Catch in Scala works similar that in Java but its implementation is slightly different catch is an expression in which multiple Exceptions (regexp-like) can be defineds

    val thisIsATryCatchKO = try{
      Integer.parseInt("Hello")
    } catch {
      case _ => 0
    }

    val thisIsATryCatchOK = try{
      Integer.parseInt("44")
    } catch {
      case _ => 0
    }

    println(s"This was a good try/catch evaluation -> ${thisIsATryCatchOK}")
    println(s"But, this was not -> ${thisIsATryCatchKO}")

    //Match expression can be used to match patterns in almost anything

    val thisIsAMatch = 4 match {case 44 => true; case _ => false}

    println(s"Match expression evaluation -> ${thisIsAMatch}")

  }

}
