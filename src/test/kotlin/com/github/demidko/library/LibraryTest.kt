package com.github.demidko.library

import com.google.common.truth.Truth.assertThat
import org.junit.jupiter.api.Test

class LibraryTest {

  @Test
  fun testSomeLibraryMethod() {
    val classUnderTest = Library()
    assertThat(classUnderTest.someLibraryMethod()).isTrue()
  }
}
