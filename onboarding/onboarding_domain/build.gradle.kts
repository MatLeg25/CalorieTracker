plugins {
    `android-library`
    `kotlin-android`
}

apply(from = "$rootDir/base-module.gradle")

//each module has to have defined own namespace
android {
    namespace = "com.example.onboarding_domain"
}

//get access to classes and functions from core modules
dependencies {
    implementation(project(Modules.core))
}