package Lists

object P02 {
  // Scala function definition syntax:
  // def functionName(parameters : typeofparameters) : returntypeoffunction = {

  /**
   *
   * @param l list
   * @tparam A type of any kind
   * @return last but one element in a list
   */
  def penultimate[A](l: List[A]) : A = l match {
    case h :: _ :: Nil => h // if there is only one more element after current one, return current one
    case _ :: tail => penultimate(tail) // if greater than 2 elements then return recursive of remaining elements
    case _         => throw new NoSuchElementException // else (only one element, or empty list) return exception
  }
}
