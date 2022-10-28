repositories {
  mavenCentral()
  maven("https://jitpack.io")
}
plugins {
  `java-library`
  `maven-publish`
  kotlin("jvm") version "1.7.20"
}
dependencies {
  // "api" dependencies is exported to consumers, that is to say found on their compile classpath. 
  // For example, api("org.apache.commons:commons-math3:3.6.1")
  // "implementation" dependencies is private for your library
  // For example, implementation("org.apache.commons:commons-math3:3.6.1")
  testImplementation("org.junit.jupiter:junit-jupiter:5.9.0")
  testImplementation("com.google.truth:truth:1.1.3")
  testImplementation("io.mockk:mockk:1.13.2")
}
tasks.compileKotlin {
  kotlinOptions.jvmTarget = "11"
  kotlinOptions.freeCompilerArgs += "-opt-in=kotlin.time.ExperimentalTime"
}
tasks.compileTestKotlin {
  kotlinOptions.jvmTarget = "11"
  kotlinOptions.freeCompilerArgs += "-opt-in=kotlin.time.ExperimentalTime"
}
tasks.test {
  useJUnitPlatform()
}
publishing {
  publications {
    create<MavenPublication>("library") {
      groupId = "com.github.demidko"
      from(components["java"])
    }
  }
}
