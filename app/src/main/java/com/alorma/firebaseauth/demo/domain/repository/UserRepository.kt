package com.alorma.firebaseauth.demo.domain.repository

import com.alorma.firebaseauth.demo.domain.model.AppUser

interface UserRepository {

    suspend fun loadUser(): AppUser

}