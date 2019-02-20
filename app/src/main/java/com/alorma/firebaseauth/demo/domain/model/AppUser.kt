package com.alorma.firebaseauth.demo.domain.model

sealed class AppUser {
    object NoAppUser : AppUser()
    data class AnnonymousAppUser(val uId: String) : AppUser()
    data class LoggedAppUser(val uId: String) : AppUser()
}