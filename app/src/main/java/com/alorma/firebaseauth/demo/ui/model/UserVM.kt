package com.alorma.firebaseauth.demo.ui.model

sealed class UserVM {
    object NoUser : UserVM()
    data class AnnonymousUser(val uId: String) : UserVM()
    data class LoggedUser(val uId: String) : UserVM()
}