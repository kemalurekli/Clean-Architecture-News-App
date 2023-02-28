package com.kemalurekli.cleannews.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.widget.Toolbar
import androidx.core.view.get
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.kemalurekli.cleannews.R
import com.kemalurekli.cleannews.databinding.ActivityMainBinding
import com.kemalurekli.cleannews.ui.home.HomePageFragment
import com.kemalurekli.cleannews.ui.saved.SavedNewsFragment
import com.kemalurekli.cleannews.ui.settings.SettingsFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var navView: BottomNavigationView
    private lateinit var navController: NavController



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        navView = binding.navView
        navController = findNavController(R.id.nav_host_fragment)
        navView.setupWithNavController(navController)
        val appBarConfiguration = AppBarConfiguration(
            setOf(R.id.homePageFragment, R.id.savedNewsFragment, R.id.settingsFragment)
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)


    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            android.R.id.home -> {
                navController.navigateUp()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }


}