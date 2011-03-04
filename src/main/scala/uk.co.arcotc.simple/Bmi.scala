package uk.co.arcotc.simple

object Bmi {
  def calc(height: Double, weight: Double): Double = {
    weight / (height * height)
  }
}