package com.github.demidko

import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import org.junit.jupiter.api.Test


class LibraryTest {

  @Test
  fun testSomeLibraryMethod() {
    val classUnderTest = Library()
    assertThat(classUnderTest.someLibraryMethod(), equalTo(true))
  }
}
