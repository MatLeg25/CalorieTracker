plugins {
    `android-library`
    `kotlin-android`
}

apply(from = "$rootDir/compose-module.gradle")

//each module has to have defined own namespace
android {
    namespace = "com.example.onboarding_presentation"
}

//get access to classes and functions from below modules
dependencies {
    implementation(project(Modules.core))
    implementation(project(Modules.coreUi))
    implementation(project(Modules.onboardingDomain))
}