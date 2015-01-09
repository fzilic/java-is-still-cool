package com.github.fzilic.java.cool

import org.junit.Test

class GroovyTruthExampleTests {

  @Test
  void truthExample() {
    // expected
    assert !false
    assert true

    // numbers behave like in C
    assert !0
    assert 10

    // empty collections are false
    assert ![]
    assert ![:]
    assert ['perko']
    assert [ime: 'Ivo']

    // empty strings and GStrings are false
    assert !''
    assert !""
    assert '      '
    assert "test"// this is a GString - but later

    // null is false
    assert !null
    assert new Object()
  }

}
