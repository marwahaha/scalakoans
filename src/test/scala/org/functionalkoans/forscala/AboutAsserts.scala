package org.functionalkoans.forscala

import org.scalatest.matchers.ShouldMatchers
import support.KoanSuite

// meditate on AboutAsserts to see how the Scala Koans work
// DONE
class AboutAsserts extends KoanSuite with ShouldMatchers {

  koan("asserts can take a boolean argument") {
    assert(true) // should be true
  }

  koan("asserts can include a message") {
    assert(true, "This should be true")
  }

  koan("true and false values can be compared with should matchers") {
    true should be(__) // should be true
  }

  koan("booleans in asserts can test equality") {
    val v1 = 4
    val v2 = 4
    assert(v1 === v2)
  }

  koan("sometimes we expect you to fill in the values") {
    assert(2 == 1 + 1)
  }
}
