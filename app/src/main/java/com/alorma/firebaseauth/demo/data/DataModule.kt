package com.alorma.firebaseauth.demo.data

import com.alorma.firebaseauth.demo.data.firebase.FirebaseUserDataSource
import com.google.firebase.auth.FirebaseAuth
import org.koin.dsl.module

val dataModule = module {
    single { FirebaseUserDataSource(get()) }
    single { FirebaseAuth.getInstance() }
}