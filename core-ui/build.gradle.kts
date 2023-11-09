plugins {
    `android-library`
    `kotlin-android`
}

apply(from = "$rootDir/compose-module.gradle")

//each module has to have defined own namespace
android {
    namespace = "com.example.core_ui"
}