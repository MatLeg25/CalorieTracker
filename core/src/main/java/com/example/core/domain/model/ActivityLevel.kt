package com.example.core.domain.model

sealed class ActivityLevel(val name: String) {
    object Low: ActivityLevel("low")
    object Medium: ActivityLevel("medium")
    object Height: ActivityLevel("height")

    companion object {
        const val default = "medium"
        fun fromString(name: String): ActivityLevel {
            return when (name) {
                "low" -> Low
                "medium" -> Medium
                "height" -> Height
                else -> Medium
            }
        }
    }
}