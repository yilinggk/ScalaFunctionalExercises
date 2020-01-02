package Lists

object P04 {
  // Scala function definition syntax:
  // def functionName(parameters : typeofparameters) : returntypeoffunction = {

  /**
   *
   * @param ls list of values
   * @tparam A list can be any type
   * @return length of list
   */
  def length[A](ls : List[A]) : Int = ls match {
    case _ :: Nil  => 1
    case _ :: tail => 1 + length(tail)
    case _         => 0
  }
}
