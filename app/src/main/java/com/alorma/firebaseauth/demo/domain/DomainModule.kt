package com.alorma.firebaseauth.demo.domain

import com.alorma.firebaseauth.demo.data.UserRepositoryImpl
import com.alorma.firebaseauth.demo.domain.model.Forlayo
import com.alorma.firebaseauth.demo.domain.repository.ForlayoRepository
import com.alorma.firebaseauth.demo.domain.repository.UserRepository
import org.koin.dsl.module

val domainModule = module {
    factory<UserRepository> { UserRepositoryImpl(get()) }
    factory<ForlayoRepository> {
        object : ForlayoRepository {
            private val forlayos: MutableList<Forlayo> = mutableListOf()

            override suspend fun getForlayos(): List<Forlayo> = forlayos

            override suspend fun create() {
                val text = "forlayo ${forlayos.size}"
                val forlayo = Forlayo(text, text)
                forlayos.add(forlayo)
            }
        }
    }
}