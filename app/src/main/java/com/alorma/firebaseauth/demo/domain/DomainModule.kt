package com.alorma.firebaseauth.demo.domain

import com.alorma.firebaseauth.demo.data.UserRepositoryImpl
import com.alorma.firebaseauth.demo.domain.repository.UserRepository
import org.koin.dsl.module

val domainModule = module {
    factory<UserRepository> { UserRepositoryImpl(get()) }
}