import com.diffplug.gradle.spotless.SpotlessExtension
import com.diffplug.gradle.spotless.SpotlessExtensionPredeclare

plugins {
    id("com.diffplug.spotless")
}

configure<SpotlessExtension> {
    predeclareDepsFromBuildscript()
}

configure<SpotlessExtensionPredeclare> {
    kotlin {
        ktfmt()
    }
}
