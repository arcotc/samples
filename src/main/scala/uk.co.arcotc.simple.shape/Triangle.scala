package uk.co.arcotc.simple.shape

class Triangle(b: Int, h: Int) extends Shape {
  def area: Double = {
    (b * h) / 2
  }
}

object Triangle {
  def main(args: Array[String]) {
    println("Area = " + new Triangle(8,10).area)
  }
}