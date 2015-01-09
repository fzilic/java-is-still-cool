package com.github.fzilic.java.cool

import org.junit.Test

class OptionalReturnExampleTest {

  static String simpleMethod() {
    return 'Simple method return'
  }

  static optionalReturn() {
    'Optional return example'
  }

  @Test
  void optinalReturnDemo() {

    assert simpleMethod() == 'Simple method return'
    assert simpleMethod() instanceof String

    assert optionalReturn() == 'Optional return example'
    assert optionalReturn() instanceof String
  }

}
