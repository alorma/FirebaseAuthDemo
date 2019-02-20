package com.alorma.firebaseauth.demo.ui.mapper

import com.alorma.firebaseauth.demo.domain.model.AppUser
import com.alorma.firebaseauth.demo.ui.model.UserVM

class UserMapper {
    fun map(appUser: AppUser): UserVM = when (appUser) {
        AppUser.NoAppUser -> UserVM.NoUser
        is AppUser.AnnonymousAppUser -> UserVM.AnnonymousUser(appUser.uId)
        is AppUser.LoggedAppUser -> UserVM.LoggedUser(appUser.uId)
    }
}