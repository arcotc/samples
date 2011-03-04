package uk.co.arcotc.simple

/**
 * Write a program that prints the numbers from 1 to 100. But for multiples of four print "Fizz"
 * instead of the number and for the multiples of five print "Buzz". For numbers that are multiples
 * of both four and five print "FizzBuzz".mk
 */
object FizzBuzz {
  def fizz(c: Int): String = {
    if (c % 4 == 0)
      "Fizz"
    else
      ""
  }

  def buzz(c: Int): String = {
    if (c % 5 == 0)
      "Buzz"
    else
      ""
  }

  def main(args: Array[String]) {
    for (i <- 1 to 100) {
      val s = fizz(i) + buzz(i)
      if (s.isEmpty)
        println(i)
      else
        println(s)
    }
  }
}