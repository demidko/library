# Library

Java library template written in the Kotlin language.

## Usage

Make sure you are signed in to your GitHub account, then just
click [`here`](https://github.com/demidko/library/generate) to use template.

## Build

```shell
./gradlew build
```

Your jar library will be located at `./build/libs`. See
also [Gradle documentation](https://docs.gradle.org/current/samples/sample_building_java_libraries.html)
.

## Deploy

Create GitHub release with source code. Then, tell the world where to get your library, for example:

```kotlin
repositories {
    jcenter()
    maven("https://jitpack.io")
}
dependencies {
    implementation("com.github.demidko:library:1.0")
}
```

See also [JitPack documentation](https://jitpack.io/docs/#publishing-on-jitpack).





