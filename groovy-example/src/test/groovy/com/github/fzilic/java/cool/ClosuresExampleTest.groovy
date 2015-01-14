package com.github.fzilic.java.cool

import org.junit.Test

class ClosuresExampleTest {

  @Test
  void closuresExample() {
    def thisIsClosure = {
      it % 2 == 0
    }

    def listOfNumbers = [1, 2, 3, 4, 5, 6, 7, 8, 9]

    def evenNumbers = listOfNumbers.findAll(thisIsClosure)

    assert evenNumbers == [2, 4, 6, 8]

    def divisibleByThree = []

    20.times {
      if (it % 3 == 0) {
        divisibleByThree << it
      }
    }

    assert divisibleByThree == [0, 3, 6, 9, 12, 15, 18]

    def checkDivisibleByTree = {
      if (it % 3 == 0) {
        checkDivisible << it
      }
    }

    def checkDivisible = []
    try {
      (1..20).each(checkDivisibleByTree)
      assert false
    }
    catch (MissingPropertyException e) {
      assert true // scoping properties visible only at write time
    }

  }
}
