package com.example

object MyProgram {

  /** This is a sample Scala program
    * 
    * You can add whatever you want, but if you change the name
    * of the entry point object (MyProgram) you need to update
    * the build.xml file to reflect that change.
    * @param args - Not used */
  def main(args: Array[String]) {
    println("welcome to MyProgram")
  }

  def isSlow(lang: String): Boolean = {
    val lower = lang.toLowerCase
    if (lang == "ruby" || lang == "python") true else false
  }

  def superstitiousSum(x: Int, y: Int): Int = {
    if (x == 13 || y == 13) throw UnluckyNumberException()
    else x + y
  }

  case class UnluckyNumberException() extends Exception
}
