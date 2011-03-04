package uk.co.arcotc.simple

import org.scalatest.junit.JUnitSuite
import org.junit.Test
import org.junit.Assert._

class ISBNTestSuite extends JUnitSuite {
  @Test
  def getShouldReturnOriginalValue {
    val expected = "1234"

    assertEquals(ISBN(expected).get, expected)
  }
}