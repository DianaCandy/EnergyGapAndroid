package icu.takemeto.android.energygap

import android.content.Context
import android.os.Bundle
import android.text.Layout
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.coordinatorlayout.widget.CoordinatorLayout
import androidx.navigation.Navigation
import com.google.android.material.navigation.NavigationBarView
import com.google.android.material.navigation.NavigationView
import icu.takemeto.android.energygap.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        WindowCompat.setDecorFitsSystemWindows(window, false)
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        val bottomNavigationBar = findViewById<NavigationBarView>(R.id.bottom_navigation)
//        bottomNavigationBar.setOnItemSelectedListener { item ->
//            when(item.itemId) {
//                R.id.home -> {
//                    true
//                }
//                R.id.records -> {
//                    true
//                }
//                R.id.settings -> {
//                    true
//                }
//                else -> false
//            } }
    }
}