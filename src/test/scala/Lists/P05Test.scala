package Lists

import org.scalatest.FunSuite

class P05Test extends FunSuite{
  test("P05.normalList") {
    assert(P05.reverse(List(1, 1, 2, 3, 5, 8)) === List(8, 5, 3, 2, 1, 1))
    assert(P05.reverse(List("rat", "tiger", "cat", "dog")) === List("dog", "cat", "tiger", "rat"))
  }

  test("P05.lengthOfOne") {
    assert(P05.reverse(List(5)) === List(5))
    assert(P05.reverse(List("cat")) === List("cat"))
  }

  test("P05.shortList") {
    assert(P05.reverse(List(1, 3)) === List(3, 1))
  }

  test("P05.emptyList") {
    assert(P05.reverse(List()) === List())
  }
}
