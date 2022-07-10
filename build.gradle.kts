repositories {
  mavenCentral()
  maven("https://jitpack.io")
}
plugins {
  `java-library`
  `maven-publish`
  kotlin("jvm") version "1.7.10"
}
dependencies {
  // "api" dependencies is exported to consumers, that is to say found on their compile classpath. 
  // For example, api("org.apache.commons:commons-math3:3.6.1")
  // "implementation" dependencies is private for your library
  // For example, implementation("org.apache.commons:commons-math3:3.6.1")
  testImplementation("org.junit.jupiter:junit-jupiter:5.8.2")
  testImplementation("com.willowtreeapps.assertk:assertk-jvm:0.25")
  testImplementation("io.mockk:mockk:1.12.4")
}
tasks.compileKotlin {
  kotlinOptions.jvmTarget = "8"
  kotlinOptions.freeCompilerArgs += "-opt-in=kotlin.time.ExperimentalTime"
}
tasks.compileTestKotlin {
  kotlinOptions.jvmTarget = "8"
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
