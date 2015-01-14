package com.github.fzilic.java.cool

import org.junit.Test

class DynamicGroovyExampleTest {

  @Test
  void dynamicGroovyExample() {
    // maps with closures as interface implementations
    def comparator = [
        compare:
            {
              left, right ->
                return right <=> left
            }
    ] as Comparator

    def someStrings = ['aaaa', 'cccc', 'zzzz', 'bbbb']

    Collections.sort(someStrings, comparator)
    assert someStrings == ['zzzz', 'cccc', 'bbbb','aaaa']

    // adding methods to existing objects
    def someString = 'abcdef'
    someString.metaClass.backwards =  {
      delegate[-1..0]
    }

    assert someString.backwards() == 'fedcba'

    def anotherString = 'hjkl'
    try {
      anotherString.backwards()
      assert false
    }
    catch (MissingMethodException e) {
      assert true // we added a method only to a single object
    }

    // adding methods to existing classes
    String.metaClass.backwards = {
      delegate[-1..0]
    }

    def thirdTry = 'tyuio'
    assert thirdTry.backwards() == 'oiuyt'
  }

}
