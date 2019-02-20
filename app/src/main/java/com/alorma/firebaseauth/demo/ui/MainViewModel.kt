package com.alorma.firebaseauth.demo.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import com.alorma.firebaseauth.demo.domain.model.AppUser
import com.alorma.firebaseauth.demo.domain.repository.UserRepository
import com.alorma.firebaseauth.demo.ui.mapper.UserMapper
import com.alorma.firebaseauth.demo.ui.model.UserVM
import kotlinx.coroutines.async
import kotlinx.coroutines.launch

class MainViewModel(
    private val userRepository: UserRepository,
    private val mapper: UserMapper
) : BaseViewModel() {

    private val _userLiveData: MutableLiveData<AppUser> = MutableLiveData()

    val user: LiveData<UserVM>
        get() = Transformations.map(_userLiveData) { mapper.map(it) }

    fun loadUser() {
        launch {
            val appUser = async { userRepository.loadUser() }
            _userLiveData.postValue(appUser.await())
        }
    }
}