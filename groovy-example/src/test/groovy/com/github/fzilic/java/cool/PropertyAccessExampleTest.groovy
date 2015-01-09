package com.github.fzilic.java.cool

import com.github.franjozilic.java.cool.Person
import org.junit.Test


class PropertyAccessExampleTest {

  @Test
  void propertyAccessExmple() {

    def person = new Person('Ivic')
    assert person.lastName == 'Ivic' // getter

    try {
      assert person.firstName // overrided getter
      assert false
    }
    catch (IllegalStateException exception) {
      assert exception.message == "Can't return null value."
    }

    person.firstName = 'Ivo' // setter
    assert person.firstName == 'Ivo'

    person.dateOfBirth =  Date.parse('yyyy-MM-dd', '1990-05-25')
    assert person.dateOfBirth == Date.parse('yyyy-MM-dd', '1990-05-25')

    try {
      person.dateOfBirth = new Date().clearTime() // overrided setter
      assert false
    }
    catch (IllegalStateException exception)  {
      assert exception.message == "Can't change date of birth after set"
    }

    try {
      person.lastName = 'Peric' // read only - no setter
      assert false
    }
    catch (ReadOnlyPropertyException exception) {
      assert exception.message =~ /.*property.*lastName.*/
    }
  }
}
