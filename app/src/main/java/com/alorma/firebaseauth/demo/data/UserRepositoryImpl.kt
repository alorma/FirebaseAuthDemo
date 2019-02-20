package com.alorma.firebaseauth.demo.data

import com.alorma.firebaseauth.demo.domain.model.AppUser
import com.alorma.firebaseauth.demo.domain.repository.UserRepository
import java.util.*

class UserRepositoryImpl : UserRepository {
    override suspend fun loadUser(): AppUser = AppUser.LoggedAppUser(
        UUID.randomUUID().toString(),
        "Bernat Borrás Paronella",
        "bernatbor15@gmail.com",
        "+34 637 09 85",
        null
    )
}