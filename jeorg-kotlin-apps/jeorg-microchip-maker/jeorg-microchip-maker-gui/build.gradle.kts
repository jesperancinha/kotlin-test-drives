allprojects {
    repositories {
        mavenCentral()
    }
}

plugins {
    kotlin("js") version "1.9.20"
    id("jacoco")
    id("org.jesperancinha.plugins.omni") version "0.3.1"
}

group = "org.jesperancinha.ktd"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("org.jetbrains.kotlin-wrappers:kotlin-react:18.2.0-pre.641")
    implementation("org.jetbrains.kotlin-wrappers:kotlin-react-dom:18.2.0-pre.641")
    implementation("org.jetbrains.kotlin-wrappers:kotlin-emotion:11.11.1-pre.641")
    implementation("org.jetbrains.kotlin-wrappers:kotlin-react-router-dom:6.17.0-pre.639")
    implementation("org.jetbrains.kotlin-wrappers:kotlin-redux:4.1.2-pre.638")
    implementation("org.jetbrains.kotlin-wrappers:kotlin-react-redux:7.2.6-pre.639")
}

kotlin {
    jvmToolchain(19)
    js(IR) {
        binaries.executable()
        browser {
            commonWebpackConfig {
                cssSupport {  }
            }
        }
    }
}
