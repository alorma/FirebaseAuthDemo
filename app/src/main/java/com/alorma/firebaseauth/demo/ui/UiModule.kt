package com.alorma.firebaseauth.demo.ui

import com.alorma.firebaseauth.demo.ui.mapper.UserMapper
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val uiModule = module(override = true) {

    viewModel { MainViewModel(get(), get()) }

    factory { UserMapper(androidContext()) }
}