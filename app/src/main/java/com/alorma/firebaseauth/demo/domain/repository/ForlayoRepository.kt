package com.alorma.firebaseauth.demo.domain.repository

import com.alorma.firebaseauth.demo.domain.model.Forlayo

interface ForlayoRepository {
    suspend fun getForlayos(): List<Forlayo>
    suspend fun create()
}