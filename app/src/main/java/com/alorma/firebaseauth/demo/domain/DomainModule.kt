package com.alorma.firebaseauth.demo.domain

import com.alorma.firebaseauth.demo.data.NoUserRepositoryImpl
import com.alorma.firebaseauth.demo.domain.repository.UserRepository
import org.koin.dsl.module

val domainModule = module {
    //factory<UserRepository> { UserRepositoryImpl() }
    //factory<UserRepository> { AnonymousUserRepositoryImpl() }
    factory<UserRepository> { NoUserRepositoryImpl() }
}