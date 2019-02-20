object Config {

    const val versionName = "1.0.0"
    const val versionCode = 1

    const val applicationId = "com.alorma.firebaseauth.demo"

    private const val kotlinVersion = "1.3.21"

    object SdkVersions {
        const val compile = 28
        const val target = 28
        const val min = 23
    }

    object LibsVersions {
        const val firebaseCoreVersion = "16.0.7"
        const val firebaseAuthUiVersion = "4.3.1"
        const val appCompat = "1.1.0-alpha02"
        const val coreKtx = "1.1.0-alpha04"
        const val constraint = "1.1.3"
        const val materialVersion = "1.1.0-alpha03"
        const val koinVersion = "2.0.0-beta-1"
        const val coroutinesVersion = "1.1.1"
    }

    object Plugins {
        const val android = "com.android.tools.build:gradle:3.3.1"
        const val kotlin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion"
        const val google = "com.google.gms:google-services:4.2.0"
    }

    object Libs {
        object Kotlin {
            const val jvm = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:$kotlinVersion"
        }

        object Firebase {
            const val core = "com.google.firebase:firebase-core:${LibsVersions.firebaseCoreVersion}"
            const val authUI = "com.firebaseui:firebase-ui-auth:${LibsVersions.firebaseAuthUiVersion}"
            const val authUIGithub = "com.firebaseui:firebase-ui-auth-github:${LibsVersions.firebaseAuthUiVersion}"
        }

        object AndroidX {
            const val appCompat = "androidx.appcompat:appcompat:${LibsVersions.appCompat}"
            const val coreKtx = "androidx.core:core-ktx:${LibsVersions.coreKtx}"
            const val constraint = "androidx.constraintlayout:constraintlayout:${LibsVersions.constraint}"
        }

        object Design {
            const val material = "com.google.android.material:material:${LibsVersions.materialVersion}"
        }

        object DependencyInjection {
            const val base = "org.koin:koin-android:${LibsVersions.koinVersion}"
            const val scope = "org.koin:koin-androidx-scope:${LibsVersions.koinVersion}"
            const val viewModel = "org.koin:koin-androidx-viewmodel:${LibsVersions.koinVersion}"
        }

        object Coroutines {
            const val core = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${LibsVersions.coroutinesVersion}"
            const val common = "org.jetbrains.kotlinx:kotlinx-coroutines-core-common:${LibsVersions.coroutinesVersion}"
            const val android = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${LibsVersions.coroutinesVersion}"
        }
    }
}