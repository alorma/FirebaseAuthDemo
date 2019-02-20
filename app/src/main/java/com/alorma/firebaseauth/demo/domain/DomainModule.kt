package com.alorma.firebaseauth.demo.domain

import com.alorma.firebaseauth.demo.domain.model.AppUser
import com.alorma.firebaseauth.demo.domain.repository.UserRepository
import org.koin.dsl.module
import java.util.*

val domainModule = module {
    factory<UserRepository> {
        object : UserRepository {
            override suspend fun loadUser(): AppUser = AppUser.AnonymousAppUser(UUID.randomUUID().toString())
        }
    }
}