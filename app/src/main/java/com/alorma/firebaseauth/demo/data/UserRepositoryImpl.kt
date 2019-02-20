package com.alorma.firebaseauth.demo.data

import com.alorma.firebaseauth.demo.data.firebase.FirebaseUserDataSource
import com.alorma.firebaseauth.demo.domain.model.AppUser
import com.alorma.firebaseauth.demo.domain.repository.UserRepository

class UserRepositoryImpl(
    private val firebaseUserDataSource: FirebaseUserDataSource
) : UserRepository {

    override suspend fun loadUser(): AppUser = firebaseUserDataSource.getUser()
}