package uk.co.arcotc.simple

case class ISBN(isbn13: String) {
  lazy val get = isbn13
  lazy val isValid = false
}