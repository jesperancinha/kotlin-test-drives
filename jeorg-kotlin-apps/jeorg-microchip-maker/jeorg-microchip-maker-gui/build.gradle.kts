allprojects {
    repositories {
        mavenCentral()
    }
}

plugins {
    kotlin("js") version "1.9.22"
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
    implementation("org.jetbrains.kotlin-wrappers:kotlin-react:18.2.0-pre.691")
    implementation("org.jetbrains.kotlin-wrappers:kotlin-react-dom:18.2.0-pre.693")
    implementation("org.jetbrains.kotlin-wrappers:kotlin-emotion:11.11.1-pre.693")
    implementation("org.jetbrains.kotlin-wrappers:kotlin-react-router-dom:6.20.1-pre.693")
    implementation("org.jetbrains.kotlin-wrappers:kotlin-redux:4.1.2-pre.691")
    implementation("org.jetbrains.kotlin-wrappers:kotlin-react-redux:7.2.6-pre.691")
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
