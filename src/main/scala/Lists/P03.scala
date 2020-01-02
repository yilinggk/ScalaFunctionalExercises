package Lists

object P03 {
  // Scala function definition syntax:
  // def functionName(parameters : typeofparameters) : returntypeoffunction = {

  /**
   *
   * @param n index
   * @param ls list
   * @tparam A list can be any type
   * @return nth element in list
   */
  def nth[A](n : Int, ls: List[A]) : A = (n, ls) match {
    case (0, h :: _   ) => h
    case (n, _ :: tail) => nth(n - 1, tail)
    case (_, Nil      ) => throw new NoSuchElementException
  }
}
