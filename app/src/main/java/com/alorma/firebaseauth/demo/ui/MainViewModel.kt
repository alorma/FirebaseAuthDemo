package com.alorma.firebaseauth.demo.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import com.alorma.firebaseauth.demo.domain.model.AppUser
import com.alorma.firebaseauth.demo.domain.model.Forlayo
import com.alorma.firebaseauth.demo.domain.repository.ForlayoRepository
import com.alorma.firebaseauth.demo.domain.repository.UserRepository
import com.alorma.firebaseauth.demo.ui.mapper.ForlayoMapper
import com.alorma.firebaseauth.demo.ui.mapper.UserMapper
import com.alorma.firebaseauth.demo.ui.model.ForlayoVM
import com.alorma.firebaseauth.demo.ui.model.UserVM
import kotlinx.coroutines.async
import kotlinx.coroutines.launch

class MainViewModel(
    private val userRepository: UserRepository,
    private val forlayoRepository: ForlayoRepository,
    private val userMapper: UserMapper,
    private val forlayoMapper: ForlayoMapper
) : BaseViewModel() {

    private val _userLiveData: MutableLiveData<AppUser> = MutableLiveData()

    val user: LiveData<UserVM>
        get() = Transformations.map(_userLiveData) { userMapper.map(it) }

    private val _forlayoLiveData: MutableLiveData<List<Forlayo>> = MutableLiveData()

    val forlayos: LiveData<List<ForlayoVM>>
        get() = Transformations.map(_forlayoLiveData) { forlayoMapper.map(it) }

    fun loadUser() {
        launch {
            val appUser = async { userRepository.loadUser() }
            _userLiveData.postValue(appUser.await())
        }
    }

    fun createForlayo() {
        launch {
            val forlayos = async {
                forlayoRepository.create()
                forlayoRepository.getForlayos()
            }

            _forlayoLiveData.postValue(forlayos.await())
        }
    }
}