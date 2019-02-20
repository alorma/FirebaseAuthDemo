package com.alorma.firebaseauth.demo.ui

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlin.coroutines.CoroutineContext

open class BaseViewModel : ViewModel(), CoroutineScope {

    private val job = SupervisorJob()

    override val coroutineContext: CoroutineContext
        get() = job + Dispatchers.Main + CoroutineExceptionHandler { _, throwable ->
            onError(throwable)
        }

    protected open fun onError(throwable: Throwable) {

    }

    override fun onCleared() {
        job.cancel()
        super.onCleared()
    }
}