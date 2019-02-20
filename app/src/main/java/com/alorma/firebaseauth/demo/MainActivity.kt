package com.alorma.firebaseauth.demo

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.alorma.firebaseauth.demo.ui.MainViewModel
import com.alorma.firebaseauth.demo.ui.model.UserVM
import com.alorma.firebaseauth.demo.ui.uiModule
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
        Toast.makeText(this, user::class.java.simpleName, Toast.LENGTH_SHORT).show()
    }
}
