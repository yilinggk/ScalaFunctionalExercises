package Lists

object P05 {
  // Scala function definition syntax:
  // def functionName(parameters : typeofparameters) : returntypeoffunction = {

  /**
   *
   * @param ls list
   * @tparam A list data can be any type
   * @return reversed list
   */
  def reverse[A](ls: List[A]) : List[A] = ls match {
    case Nil => List() // if only one element in list, return list with that element
    case h :: tail => reverse(tail) ::: List(h)
  }
}
