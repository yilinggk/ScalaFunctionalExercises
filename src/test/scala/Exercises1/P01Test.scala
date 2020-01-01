package Exercises1

import org.scalatest.FunSuite

class P01Test extends FunSuite {
  test("P01.moreThanOne") {
    assert(P01.last(List(1, 1, 2, 3, 5, 8)) === 8)
  }

  test("P01.onlyOne") {
    assert(P01.last(List(2)) === 2)
  }

  test("P01.emptyList") {
    assertThrows[NoSuchElementException] {
      P01.last(List())
    }
  }
}
