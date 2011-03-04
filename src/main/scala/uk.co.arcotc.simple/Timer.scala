package uk.co.arcotc.simple

import java.util.{Date, Locale}
import java.text.DateFormat
import java.text.DateFormat._

object Timer {
  val df = getTimeInstance(LONG, Locale.UK)

  def oncePerSecond(callback: () => Unit, numberOfSeconds: Int) {
    println("Starting Timer for " + numberOfSeconds + " seconds")
    var i=0;
    while (i < numberOfSeconds) {
      callback()
      Thread sleep 1000
      i += 1
    }
  }

  def timeFlies() {
    print("time files like an arrow ...")
    val now = new Date()
    println(df format now)
  }

  def main(args: Array[String]) {
    oncePerSecond(timeFlies, 10)
  }
}