package com.alorma.firebaseauth.demo.ui.mapper

import com.alorma.firebaseauth.demo.domain.model.Forlayo
import com.alorma.firebaseauth.demo.ui.model.ForlayoVM

class ForlayoMapper {

    fun map(it: List<Forlayo>): List<ForlayoVM> = it.map {
        ForlayoVM(it.text, it.subText)
    }
}