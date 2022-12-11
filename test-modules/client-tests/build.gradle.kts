plugins {
    buildsrc.convention.`kotlin-multiplatform`
}

kotlin {
    jvm {
        withJava()
    }

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(dependencies.platform(kotlin("bom")))
                implementation(kotlin("reflect"))

                implementation(dependencies.platform(buildsrc.config.Deps.Libs.kotlinCoroutinesBom))
                implementation(buildsrc.config.Deps.Libs.kotlinCoroutinesCore)
            }
        }

        val commonTest by getting {
            dependencies {
                implementation(projects.modules.mockk)

                implementation(kotlin("test-junit5"))
            }
        }

        val jvmMain by getting {
            dependencies {
            }
        }

        val jvmTest by getting {
            dependencies {
                implementation(buildsrc.config.Deps.Libs.slfj)
                implementation(buildsrc.config.Deps.Libs.logback)

                implementation(buildsrc.config.Deps.Libs.junitJupiter)
            }
        }
    }
}
