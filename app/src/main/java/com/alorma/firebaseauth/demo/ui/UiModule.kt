package com.alorma.firebaseauth.demo.ui

import com.alorma.firebaseauth.demo.ui.mapper.UserMapper
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val uiModule = module {

    viewModel { MainViewModel(get(), get()) }

    factory { UserMapper() }
}