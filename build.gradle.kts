plugins {
    kotlin("jvm") version "1.6.10"
}

group = "com.github.dmillying.sampleplugin.SamplePlugin"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven { url = uri("https://papermc.io/repo/repository/maven-public/") }
    }

dependencies {
    implementation(kotlin("stdlib"))
    compileOnly("io.papermc.paper:paper-api:1.18.1-R0.1-SNAPSHOT")
    implementation("io.github.monun:kommand-api:2.8.1")
}

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(17))
}