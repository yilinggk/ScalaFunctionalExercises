package Lists

import org.scalatest.FunSuite

class P04Test extends FunSuite {
  test("P04.greaterThanOne") {
    assert(P04.length(List(1, 1, 2, 3, 5, 8)) === 6)
  }

  test("P04.lengthOne") {
    assert(P04.length(List(1)) ===  1)
    assert(P04.length(List("cat")) === 1)
  }

  test("P04.emptyList") {
    assert(P04.length(List()) === 0)
  }

}
