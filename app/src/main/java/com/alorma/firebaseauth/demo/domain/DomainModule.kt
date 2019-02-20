package com.alorma.firebaseauth.demo.domain

import com.alorma.firebaseauth.demo.domain.model.AppUser
import com.alorma.firebaseauth.demo.domain.repository.UserRepository
import org.koin.dsl.module

val domainModule = module {
    factory<UserRepository> {
        object : UserRepository {
            // TODO
            override suspend fun loadUser(): AppUser = AppUser.NoAppUser
        }
    }
}