pluginManagement {
    repositories {
        mavenCentral()
        gradlePluginPortal()
    }
}

plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.5.0"
}

rootProject.name = "M3UF2A8BarbosaNikitaFabianGomezOmarZouaoui"
include("src:test")
findProject(":src:test")?.name = "test"
