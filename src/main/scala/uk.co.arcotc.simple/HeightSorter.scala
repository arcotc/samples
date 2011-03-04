package uk.co.arcotc.simple

/**
 * Sort a list of strings into order of ascending height,
 * e.g. the following list 6'2", 4'6", 4'10" and 5'10" would return 4'6", 4'10", 5'10", 6'2"
 */
object HeightSorter {
  def sort(listOfStrings: List[String]): List[(String, String)] = {
    listOfStrings.map(str => str.split("'"))
                 .map(a => (a(0), a(1)))
                 .map({
                    case (a,b) => (a,b.replace("\"", ""))
                  })
                 .map(a => (a._1.toInt, a._2.toInt))
                 .map(a => (a._1 * 12 + a._2))
                 .sorted
                 .map(a => (a/12, a%12))
                 .map(a => ((a._1.toString + "'"), (a._2.toString + "\"")))
  }

  def main(args: Array[String]) {
    println(sort(List("""6'2"""", """4'6"""", """4'10"""", """5'10"""")))
    println(sort(List("""1'13"""", """1'11"""", """1'9"""", """1'7"""", """1'5"""", """1'3"""", """1'1"""", """1'12"""", """1'10"""", """1'8"""", """1'6"""", """1'4"""", """1'2"""", """1'0"""")))
  }
}