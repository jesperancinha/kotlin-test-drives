buildscript {
    repositories {
        mavenLocal()
        mavenCentral()
    }
}

group = "org.jesperancinha.kotlin"
version = "0.0.0"

tasks.withType<Test> {
    useJUnitPlatform()
}
