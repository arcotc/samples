package uk.co.arcotc.simple

/**
 * A function that takes a height and weight and calculates the Body Mass Index. where
 * BMI = weight (kg) / (height (m) * height (m))
 * e.g. a height of 2m and weight of 80kg gives a BMI of 20
 */
object Bmi {
  def calc(height: Double, weight: Double): Double = {
    weight / (height * height)
  }
}