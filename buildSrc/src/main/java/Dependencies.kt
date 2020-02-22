object Apps {
    const val compileSdk = 29
    const val minSdk = 21
    const val targetSdk = 29
    const val versionCode = 1
    const val versionName = "1.0.0"
    const val testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
}

object Versions {
    const val gradle = "3.6.0-rc02"
    const val kotlin = "1.3.50"
    const val appcompat = "1.1.0"
    const val coreKtx = "1.2.0-rc01"
    const val constraintLayout = "1.1.3"
    const val lottie = "3.2.2"

    /* test */
    const val junit = "4.12"

    /* Android Test */
    const val androidTestRunner = "1.3.0-alpha02"
    const val androidEspressoCore = "3.3.0-alpha02"
}

object Kotlin {
    const val stdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Versions.kotlin}"
    const val gradle = "com.android.tools.build:gradle:${Versions.gradle}"
    const val gradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
}

object Libs {
    const val appcompat = "androidx.appcompat:appcompat:${Versions.appcompat}"
    const val coreKtx = "androidx.core:core-ktx:${Versions.coreKtx}"
    const val constraintLayout =
        "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
    const val lottie = "com.airbnb.android:lottie:${Versions.lottie}"
}

object TestLibs {
    const val junit = "junit:junit:${Versions.junit}"
}

object AndroidTestLibs {
    const val androidTestRunner = "androidx.test:runner:${Versions.androidTestRunner}"
    const val androidEspresso =
        "androidx.test.espresso:espresso-core:${Versions.androidEspressoCore}"
}