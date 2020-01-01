package Lists

object P01 {
  // Solving of the first functional programming exercises in scala from
  // http://aperiodic.net/phil/scala/s-99/

  // Scala function definition syntax:
  // def functionName(parameters : typeofparameters) : returntypeoffunction = {
  //[A] allows us to handle lists of any type

  /**
   *
   * @param l list
   * @tparam A lists of any kind
   * @return last element in list
   */
  def last[A](l: List[A]): A = l match {
    case h :: Nil  => h // if only one element, return that element -- h = first element, Nil = null (nothing after first element)
    case _ :: tail => last(tail) // if a element exists, call lastRecursive on all the elements after to get last element
    case _         => throw new NoSuchElementException // happens when less than 1 element in list
  }
}
