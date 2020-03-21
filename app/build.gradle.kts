plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("android.extensions")
    kotlin("kapt")
}

android {
    compileSdkVersion(Apps.compileSdk)
    defaultConfig {
        applicationId = "com.codingpizza.starwars"
        minSdkVersion(Apps.minSdk)
        targetSdkVersion(Apps.targetSdk)
        versionCode = Apps.versionCode
        versionName = Apps.versionName
        testInstrumentationRunner = Apps.testInstrumentationRunner
    }
    flavorDimensions("default")

    productFlavors {
        create("develop") {
            applicationId = "com.codingpizza.starwars.develop"
            resValue("string","secret",System.getenv("SECRET") ?: "")
        }
        create("staging") {
            applicationId = "com.codingpizza.starwars.staging"
            resValue("string","secret",System.getenv("SECRET") ?: "")
        }
        create("production") {
            applicationId = "com.codingpizza.starwars"
            resValue("string","secret",System.getenv("SECRET") ?: "")
        }
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    implementation(Kotlin.stdlib)
    implementation(Libs.appcompat)
    implementation(Libs.coreKtx)
    implementation(Libs.constraintLayout)
    implementation(Libs.lottie)
    testImplementation(TestLibs.junit)
    androidTestImplementation(AndroidTestLibs.androidTestRunner)
    androidTestImplementation(AndroidTestLibs.androidEspresso)
}
