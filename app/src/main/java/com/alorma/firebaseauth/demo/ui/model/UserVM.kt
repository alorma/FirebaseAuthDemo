package com.alorma.firebaseauth.demo.ui.model

sealed class UserVM {
    object NoUser : UserVM()
    data class LoggedUser(
        val uId: String,
        val userName: String,
        val email: String,
        val phone: String,
        val avatar: String?
    ) : UserVM()
}