package io.mockk.dependencies

import org.gradle.api.Project

fun Project.kotlinVersion() = findProperty("kotlin.version")?.toString() ?: Deps.Versions.kotlinDefault

object Deps {
    object Versions {
        const val androidTools = "4.1.1"
        const val dokka = "1.4.20"
        const val kotlinDefault = "1.3.72"
        const val slfj = "1.7.26"
        const val logback = "1.2.3"
        const val junitJupiter = "5.6.2"
        const val junitVintage = "5.6.2"
        const val objenesis = "3.1"
        const val bytebuddy = "1.11.5"
    }

    object Libs {
        const val slfj = "org.slf4j:slf4j-api:${Versions.slfj}"
        const val logback = "ch.qos.logback:logback-classic:${Versions.logback}"
        const val junitJupiterApi = "org.junit.jupiter:junit-jupiter-api:${Versions.junitJupiter}"
        const val junitJupiterEngine = "org.junit.jupiter:junit-jupiter-engine:${Versions.junitJupiter}"
        const val junitVintageEngine = "org.junit.vintage:junit-vintage-engine:${Versions.junitVintage}"
        const val objenesis = "org.objenesis:objenesis:${Versions.objenesis}"
        const val bytebuddy = "net.bytebuddy:byte-buddy:${Versions.bytebuddy}"
        const val bytebuddyAgent = "net.bytebuddy:byte-buddy-agent:${Versions.bytebuddy}"

        fun kotlinStdLib(version: String = Versions.kotlinDefault) = "org.jetbrains.kotlin:kotlin-stdlib:$version"
        fun kotlinStdLibJs(version: String = Versions.kotlinDefault) = "org.jetbrains.kotlin:kotlin-stdlib-js:$version"
        fun kotlinTestCommon(version: String = Versions.kotlinDefault) = "org.jetbrains.kotlin:kotlin-test-common:$version"
        fun kotlinTestCommonAnnotations(version: String = Versions.kotlinDefault) =
            "org.jetbrains.kotlin:kotlin-test-annotations-common:$version"
        fun kotlinTestJunit(version: String = Versions.kotlinDefault) = "org.jetbrains.kotlin:kotlin-test-junit:$version"
        fun kotlinTestJs(version: String = Versions.kotlinDefault) = "org.jetbrains.kotlin:kotlin-test-js:$version"
        fun kotlinReflect(version: String = Versions.kotlinDefault) = "org.jetbrains.kotlin:kotlin-reflect:$version"
    }

    object Plugins {
        const val androidTools = "com.android.tools.build:gradle:${Versions.androidTools}"
        const val dokka = "org.jetbrains.dokka:dokka-gradle-plugin:${Versions.dokka}"

        fun kotlin(version: String = Versions.kotlinDefault) = "org.jetbrains.kotlin:kotlin-gradle-plugin:$version"
    }
}
