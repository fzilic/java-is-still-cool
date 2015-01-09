package com.github.fzilic.java.cool

import com.github.franjozilic.java.cool.Person
import org.junit.Test

class CollectionsExampleTest {

  @Test
  void listsExample() {
    def list = [] // new list
    assert list instanceof ArrayList // as array list by default
    assert list.isEmpty() // and empty

    list = [5, 'test', new Person('ivic')]  // new array list of elements
    assert list instanceof ArrayList
    assert !list.isEmpty()

    assert list[0] == 5 // subscript operator
    assert list[1] == 'test'
    assert list[2].lastName == 'ivic'

    list = new LinkedList() // custom list type
    list << 'pero'
    list << 'mirko' // adding values

    assert list instanceof LinkedList
    assert list[1] == 'mirko'

    list = []

    list = ['ivo', 'marko'] as LinkedList
    assert list instanceof LinkedList
    assert list[1] instanceof String
    assert list[1] == 'marko'
  }

  @Test
  void mapsExample() {
    def map = [:] // prazna hash mapa
    assert map instanceof LinkedHashMap

    assert map.key == null
    map.key = 'sample value'
    assert map.key == 'sample value'

    assert map['complicated key'] == null
    map['complicated key'] = 'value'
    assert map['complicated key'] == 'value'

    assert map.'another key' == null
    map.'another key' = 'another value'
    assert map.'another key' == 'another value'

    def objectKey = new Person('peric')
    assert map[objectKey] == null
    map[objectKey] = objectKey
    assert map[objectKey] == objectKey
  }


}
