package com.alorma.firebaseauth.demo.ui.mapper

import android.content.Context
import com.alorma.firebaseauth.demo.R
import com.alorma.firebaseauth.demo.domain.model.AppUser
import com.alorma.firebaseauth.demo.ui.model.UserVM

class UserMapper(private val context: Context) {
    fun map(appUser: AppUser): UserVM = when (appUser) {
        AppUser.NoAppUser -> UserVM.NoUser
        is AppUser.AnonymousAppUser -> UserVM.LoggedUser(
            appUser.uId,
            context.resources.getString(R.string.anonymous_username),
            context.resources.getString(R.string.no_email),
            context.resources.getString(R.string.no_phone),
            null
        )
        is AppUser.LoggedAppUser -> UserVM.LoggedUser(
            appUser.uId,
            appUser.userName ?: context.resources.getString(R.string.no_username),
            appUser.email ?: context.resources.getString(R.string.no_email),
            appUser.phone ?: context.resources.getString(R.string.no_phone),
            appUser.avatar
        )
    }
}