package Lists

import org.scalatest.FunSuite

class P02Test extends FunSuite{
  test("P02.moreThanTwo") {
    assert(P02.penultimate(List(1, 1, 2, 3, 5, 8)) === 5)
    assert(P02.penultimate(List("skgh", "a", "doggo", "catto", "hooman")) === "catto")
  }

  test("P02.onlyTwo") {
    assert(P02.penultimate(List(1, 2)) === 1)
    assert(P02.penultimate(List("catto", "doggo")) === "catto")
  }

  test( testName = "P02.lessThanTwo") {
    assertThrows[NoSuchElementException] {
      P02.penultimate(List())
      P02.penultimate(List("dog"))
      P02.penultimate(List(1))
    }
  }
}
