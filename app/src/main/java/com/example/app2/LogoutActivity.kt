package com.example.app2

import android.content.Intent
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.app2.databinding.ActivityLogout2Binding
import com.example.app2.databinding.ActivityLogoutBinding

class LogoutActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLogoutBinding
    override fun onCreate(savedInstanceState: Bundle?)
    {super.onCreate(savedInstanceState)
        binding =
            ActivityLogoutBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.btnLogout.setOnClickListener {
            SessionManager.clearData(this)

            val intent = Intent(this,
                MainActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK)
            intent.addFlags(Intent.FLAG_ACTIVITY_NO_HISTORY)
            startActivity(intent)
        }
    }
}