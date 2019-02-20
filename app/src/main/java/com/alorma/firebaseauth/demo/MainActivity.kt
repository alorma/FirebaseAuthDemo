package com.alorma.firebaseauth.demo

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.alorma.firebaseauth.demo.ui.MainViewModel
import com.alorma.firebaseauth.demo.ui.model.UserVM
import com.alorma.firebaseauth.demo.ui.uiModule
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.main_user_layout.*
import org.koin.androidx.viewmodel.ext.viewModel
import org.koin.core.context.loadKoinModules

class MainActivity : AppCompatActivity() {

    private val mainViewModel: MainViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loadKoinModules(uiModule)

        mainViewModel.user.observe(this, Observer {
            it?.let { user -> onUser(user) }
        })

        mainViewModel.loadUser()
    }

    private fun onUser(user: UserVM) {
        when (user) {
            UserVM.NoUser -> {
                userInfo.visibility = View.GONE
                signInButton.visibility = View.VISIBLE
                signInButton.setOnClickListener {
                    onSignIn()
                }
            }
            is UserVM.LoggedUser -> {
                userInfo.visibility = View.VISIBLE
                signInButton.visibility = View.GONE
                signInButton.setOnClickListener(null)
                userName.text = user.userName
                userEmail.text = user.email
                userPhone.text = user.phone
            }
        }
    }

    private fun onSignIn() {

    }
}
