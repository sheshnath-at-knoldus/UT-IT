
class DuplicateElements {
  def duplicateElements[A](list: List[A]): Boolean = {
    if (list.distinct == list) true else false
  }
}