package com.github.franjozilic.java.cool

class Person {

  String firstName
  final String lastName // disable setter
  String gender

  Date dateOfBirth

  Person(String lastName) {
    this.lastName = lastName
  }

  String getFirstName() { // custom getter
    if (!firstName) {
      throw new IllegalStateException("Can't return null value.")
    }
    firstName
  }

  void setDateOfBirth(Date dateOfBirth) { // custom setter
    if (this.dateOfBirth) {
      throw new IllegalStateException("Can't change date of birth after set")
    }
    this.dateOfBirth = dateOfBirth
  }

}
