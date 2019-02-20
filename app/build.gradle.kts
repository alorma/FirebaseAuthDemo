plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-android-extensions")
    id("kotlin-kapt")
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

    addDependencies(Config.Libs.Design)
    addDependencies(Config.Libs.AndroidX)
    addDependencies(Config.Libs.DependencyInjection)
    addDependencies(Config.Libs.Firebase)
    addDependencies(Config.Libs.Coroutines)
    addDependencies(Config.Libs.Ui)
}

fun DependencyHandler.addDependencies(deps: Config.DependenciesList) {
    deps.asList().forEach { implementation(it) }
    deps.asKaptList().forEach { kapt(it) }
}

apply(plugin = "com.google.gms.google-services")
