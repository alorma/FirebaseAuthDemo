package com.alorma.firebaseauth.demo.domain.model

sealed class AppUser {
    object NoAppUser : AppUser()
    data class AnonymousAppUser(val uId: String) : AppUser()
    data class LoggedAppUser(
        val uId: String,
        val userName: String?,
        val email: String?,
        val phone: String?,
        val avatar: String?
    ) : AppUser()
}