package com.example

import org.scalatest.FunSuite

import com.example.MyProgram._

class MyProgramTest extends FunSuite {
  
  test("knows how to add") {
    assert(superstitiousSum(0, 0) == 0)  //standard assert
  }

  test("knows programming languages") {
    assert(isSlow("python") === true)    //special ScalaTest assert that gets nicer output
    expect(false) {
      isSlow("scala")                    //the expect method gives nicest ScalaTest output
    }    
  }

  test("is superstitous") {
    intercept[UnluckyNumberException] {  //states that an exception is required
      superstitiousSum(7, 6)
    }
  }
}
