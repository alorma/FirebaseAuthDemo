package com.alorma.firebaseauth.demo.data

import com.alorma.firebaseauth.demo.domain.model.AppUser
import com.alorma.firebaseauth.demo.domain.repository.UserRepository

class NoUserRepositoryImpl : UserRepository {
    override suspend fun loadUser(): AppUser = AppUser.NoAppUser
}