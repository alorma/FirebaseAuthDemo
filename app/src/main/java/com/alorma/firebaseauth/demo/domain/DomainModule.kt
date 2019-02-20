package com.alorma.firebaseauth.demo.domain

import com.alorma.firebaseauth.demo.data.ForlayoRepositoryImpl
import com.alorma.firebaseauth.demo.data.UserRepositoryImpl
import com.alorma.firebaseauth.demo.domain.repository.ForlayoRepository
import com.alorma.firebaseauth.demo.domain.repository.UserRepository
import org.koin.dsl.module

val domainModule = module {
    factory<ForlayoRepository> { ForlayoRepositoryImpl(get()) }
    factory<UserRepository> { UserRepositoryImpl(get()) }
}