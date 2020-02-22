buildscript {
    repositories {
        google()
        jcenter()
        maven { setUrl("https://plugins.gradle.org/m2/") }
    }

    dependencies {
        classpath(Kotlin.gradle)
        classpath(Kotlin.gradlePlugin)
        classpath("org.jlleitschuh.gradle:ktlint-gradle:7.1.0")
    }
}

allprojects {
    repositories {
        google()
        jcenter()
    }
    apply(plugin = "org.jlleitschuh.gradle.ktlint")
}

plugins {
    id("io.gitlab.arturbosch.detekt").version("1.2.1")
}

detekt {
    input = files("${project.rootDir}/src/main/java")
    version = "1.2.1"
    config = files("${project.rootDir}/config/detekt.yml")
    parallel = true
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}