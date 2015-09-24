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
  def solve(till: Int): Int = ???

  "solve" should {
    "return 23 for 1 to 10" in {
      solve(till = 10) must_== 23
    }
  }
}