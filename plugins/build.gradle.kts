plugins {
    `kotlin-dsl`
    `maven-publish`
}

group = "com.javiersc.spotless-repro"
version = "1.0.0-SNAPSHOT"

dependencies {
    implementation("com.diffplug.spotless:spotless-plugin-gradle:6.17.0")
}
