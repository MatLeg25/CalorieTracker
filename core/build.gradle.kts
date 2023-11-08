plugins {
    `android-library`
    `kotlin-android`
}

apply(from = "$rootDir/base-module.gradle")

//each module has to have defined own namespace
android {
    namespace = "com.example.core"
}

//extra dependencies for this module can be added here