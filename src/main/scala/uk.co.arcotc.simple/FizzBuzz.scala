package uk.co.arcotc.simple

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