class Sortings {
  //*** Bubble Sort***//

  // bubbleSort method is used to sort list using bubble sorting method
  def bubbleSort(list: List[Int]): List[Int] = {

    //in bubble pass in each pass larget number will be at the end of the list
    def bubblePass(pass: List[Int]): List[Int] = pass match {
      case x :: y :: xs if x > y => y :: bubblePass(x :: xs)
      case x :: xs => x :: bubblePass(xs)
      case Nil => Nil
    }
    list match {
      case Nil => Nil
      case _ => {
        val swap = bubblePass(list)
        if (swap == list) list
        else bubbleSort(swap)
      }
    }
  }

  //***Insertion Sort***//

  // insertionSort() used for sorting in insertion sort manner
  def insertionSort(list: List[Int]): List[Int] = list match {
    case Nil => Nil
    case x :: xs => insert(x, insertionSort(xs))
  }

  // insert() is used to put the element of the list into its correct position
  def insert(x: Int, list: List[Int]): List[Int] = list match {
    case Nil => List(x)
    case y :: ys => if (x < y) x :: y :: ys else y :: insert(x, ys)
  }

}
