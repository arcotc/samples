package uk.co.arcotc.simple.shape

import scala.math.Pi

class Circle(radius: Double) extends Shape {
  def area:Double = {
    (radius * radius) * Pi
  }
}

object Circle {
  def main(args: Array[String]) {
    println("Area = " + new Circle(8).area)
  }
}