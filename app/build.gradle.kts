plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-android-extensions")
}

android {
    compileSdkVersion(Config.SdkVersions.compile)

    defaultConfig {
        applicationId = Config.applicationId
        minSdkVersion(Config.SdkVersions.min)
        targetSdkVersion(Config.SdkVersions.target)

        versionName = Config.versionName
        versionCode = Config.versionCode
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = true
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
        }
    }
}

dependencies {
    implementation(Config.Libs.Kotlin.jvm)
    implementation(Config.Libs.Firebase.core)
    implementation(Config.Libs.AndroidX.appCompat)
    implementation(Config.Libs.AndroidX.coreKtx)
    implementation(Config.Libs.AndroidX.constraint)

    /*
    testImplementation("junit:junit:4.12")
    androidTestImplementation("androidx.test:runner:1.1.2-alpha01")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.1.2-alpha01")
    */
}
apply(plugin = "com.google.gms.google-services")