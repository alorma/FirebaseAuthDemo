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

    implementation(Config.Libs.AndroidX.appCompat)
    implementation(Config.Libs.Design.material)
    implementation(Config.Libs.Design.material)
    implementation(Config.Libs.AndroidX.coreKtx)
    implementation(Config.Libs.AndroidX.constraint)

    implementation(Config.Libs.DependencyInjection.koinBase)
    implementation(Config.Libs.DependencyInjection.koinViewModel)

    implementation(Config.Libs.Firebase.core)
    implementation(Config.Libs.Firebase.authUI)
    implementation(Config.Libs.Firebase.authUIGithub)
}
apply(plugin = "com.google.gms.google-services")