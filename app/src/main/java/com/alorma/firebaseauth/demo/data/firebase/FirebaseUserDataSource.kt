package com.alorma.firebaseauth.demo.data.firebase

import com.alorma.firebaseauth.demo.domain.model.AppUser
import com.google.firebase.auth.FirebaseAuth
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class FirebaseUserDataSource(
    private val firebaseAuth: FirebaseAuth
) {

    suspend fun getUser(): AppUser = withContext(Dispatchers.IO) {
        when (val user = firebaseAuth.currentUser) {
            null -> AppUser.NoAppUser
            else -> when (user.isAnonymous) {
                true -> AppUser.AnonymousAppUser(user.uid)
                false -> AppUser.LoggedAppUser(
                    user.uid,
                    user.displayName,
                    user.email,
                    user.phoneNumber,
                    user.photoUrl?.toString()
                )
            }
        }
    }
}