package com.github.fzilic.java.cool

import com.github.franjozilic.java.cool.Person
import org.junit.Test

class OperatorsExampleTest {

  @Test
  void nullSafeDereference() {
    def person = new Person('Ivic')

    assert person.lastName == 'Ivic'
    assert person.lastName.toUpperCase() == 'IVIC'

    assert !person.gender

    try {
      assert person.gender.toUpperCase() == 'BILO STO'
      assert false
    }
    catch (NullPointerException exception) {
      assert true
    }

    assert !person.gender?.toUpperCase()
  }

  @Test
  void spreadExample() {
    def people = [new Person('Ivic'), new Person('Horvat'), new Person('Anic')]

    def lastNames = people*.lastName
    assert lastNames == ['Ivic', 'Horvat', 'Anic']
  }


}
