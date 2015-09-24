package com.wix.euler

import org.specs2.mutable.Specification

class Problem1Test extends Specification {
/*
Multiples of 3 and 5
Problem 1

If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
The sum of these multiples is 23.

Find the sum of all the multiples of 3 or 5 below 1000.
*/
  def solve(till: Int): Int = {
    val range3 = Range(3, till, 3)
    val range5 = Range(5, till, 5)
    val set = range3.toSet ++ range5.toSet
    set.sum

    (1 until till).filter(x => x % 3 == 0 || x % 5 == 0).sum
  }

  "solve" should {
    "return 23 for 1 to 10" in {
      solve(till = 10) must_== 23
    }

    "return xx for 1 to 1000" in {
      solve(till = 1000) must_== 233168
    }
  }
}