package uk.co.arcotc.simple

import org.scalatest.junit.JUnitSuite
import org.junit.Assert._
import org.junit.{Ignore, Test}

class TreeTestSuite extends JUnitSuite {
  @Test
  def shouldComputeConstValueTreeCorrectly {
    val exp: Tree = Sum(Sum(Const(5),Const(5)),Sum(Const(7),Const(7)))

    assertEquals(24, Tree.eval(exp))
  }

  @Test
  def shouldComputeMixedTreeCorrectly {
    val exp: Tree = Sum(Sum(Var("x"),Var("x")),Sum(Const(7),Var("y")))
    val env: String => Int = { case "x" => 5 case "y" => 7 }

    assertEquals(24, Tree.eval(exp, env))
  }

  @Test
  @Ignore
  def test {
    val expected = "Sum(Sum(Const(1),Const(1)),Sum(Const(0),Const(0)))"
    val exp: Tree = Sum(Sum(Var("x"),Var("x")),Sum(Const(7),Var("y")))
    assertEquals(expected, Tree.derive(exp , "x"))
  }
}