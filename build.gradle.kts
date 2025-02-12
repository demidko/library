import org.gradle.api.JavaVersion.VERSION_11
import org.jetbrains.kotlin.gradle.dsl.JvmTarget.JVM_11

repositories {
  mavenCentral()
  maven("https://jitpack.io")
}
plugins {
  `java-library`
  `maven-publish`
  kotlin("jvm") version "2.1.20-Beta2"
}
dependencies {
  // "api" dependencies is exported to consumers, that is to say found on their compile classpath.
  // For example, api("org.apache.commons:commons-math3:3.6.1")
  // "implementation" dependencies is private for your library
  // For example, implementation("org.apache.commons:commons-math3:3.6.1")
  testImplementation("org.junit.jupiter:junit-jupiter:5.11.4")
  testImplementation("com.google.truth:truth:1.4.4")
  testRuntimeOnly("org.junit.platform:junit-platform-launcher:1.11.4")
}
kotlin {
  compilerOptions {
    jvmTarget = JVM_11
    optIn.add("kotlin.time.ExperimentalTime")
  }
}
java {
  sourceCompatibility = VERSION_11
  targetCompatibility = VERSION_11
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
