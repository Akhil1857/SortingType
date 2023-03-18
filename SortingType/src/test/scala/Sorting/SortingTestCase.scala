import org.scalatest.funsuite.AnyFunSuite


class SortingTestCase extends AnyFunSuite {
  test("Sorting using Bubble sort") {
    val userInput = List(1, 5, 2, 9, 4)
    val sortObject = new Sortings()
    val expectedOutput = sortObject.bubbleSort(userInput)
    assert(expectedOutput == List(1, 2, 4, 5, 9))
  }

  test("Sorting using Insertion sort") {
    val userInput = List(1, 5, 2, 9, 4)
    val sortObject = new Sortings()
    val expectedOutput = sortObject.insertionSort(userInput)
    assert(expectedOutput == List(1, 2, 4, 5, 9))
  }
  test("Sorting using Bubble sort using empty list as Input") {
    val userInput = Nil
    val sortObject = new Sortings()
    val expectedOutput = sortObject.bubbleSort(userInput)
    assert(expectedOutput == Nil)
  }
  test("Sorting using Insertion sort using empty list as Input") {
    val userInput = Nil
    val sortObject = new Sortings()
    val expectedOutput = sortObject.insertionSort(userInput)
    assert(expectedOutput == Nil)
  }

}
