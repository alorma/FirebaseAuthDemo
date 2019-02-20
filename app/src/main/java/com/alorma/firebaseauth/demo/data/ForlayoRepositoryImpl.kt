package com.alorma.firebaseauth.demo.data

import com.alorma.firebaseauth.demo.domain.model.AppUser
import com.alorma.firebaseauth.demo.domain.model.Forlayo
import com.alorma.firebaseauth.demo.domain.repository.ForlayoRepository
import com.alorma.firebaseauth.demo.domain.repository.UserRepository

class ForlayoRepositoryImpl(
    private val userRepository: UserRepository
) : ForlayoRepository {
    private val forlayos: MutableList<Forlayo> = mutableListOf()

    override suspend fun getForlayos(): List<Forlayo> = forlayos

    override suspend fun create() {
        val text = "forlayo ${forlayos.size}"
        val subText = when (val user = userRepository.loadUser()) {
            AppUser.NoAppUser -> "no user"
            is AppUser.AnonymousAppUser -> user.uId.take(10)
            is AppUser.LoggedAppUser -> user.userName ?: user.uId.take(10)
        }
        val forlayo = Forlayo(text, subText)
        forlayos.add(forlayo)
    }
}