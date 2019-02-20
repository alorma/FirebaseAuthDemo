package com.alorma.firebaseauth.demo.data

import com.alorma.firebaseauth.demo.domain.model.AppUser
import com.alorma.firebaseauth.demo.domain.repository.UserRepository
import java.util.*

class AnonymousUserRepositoryImpl : UserRepository {
    override suspend fun loadUser(): AppUser = AppUser.AnonymousAppUser(
        UUID.randomUUID().toString()
    )
}