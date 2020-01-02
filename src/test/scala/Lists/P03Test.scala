package Lists

import org.scalatest.FunSuite

class P03Test extends FunSuite {
  test("P03.listLongerThanOne") {
    assert(P03.nth(2, List(1, 1, 2, 3, 5, 8)) === 2)
    assert(P03.nth(3, List("a", "bob", "cat", "dog", "bunny")) === "dog")
  }

  test("P03.lengthOneIndexZero") {
    assert(P03.nth(0, List(4)) === 4)
    assert(P03.nth(0, List("d")) === "d")
  }

  test("P03.noSuchElement") {
    assertThrows[NoSuchElementException] {
      P03.nth(4, List(3, 2))
      P03.nth(0, List())
    }
  }
}
