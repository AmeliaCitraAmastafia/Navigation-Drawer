package com.example.navdrawerapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.example.navdrawerapp.ui.navigation.NavGraph
import com.example.navdrawerapp.ui.theme.NavDrawerAppTheme
import com.example.navdrawerapp.ui.theme.BackgroundScreen

/**
 * File MainActivity.kt
 * ====================
 * Activity utama dan satu-satunya dalam aplikasi ini.
 *
 * Di Jetpack Compose, kita biasanya hanya punya 1 Activity.
 * Semua "halaman" ditangani oleh Navigation Compose,
 * bukan dengan membuat Activity baru seperti cara lama.
 *
 * Analogi: MainActivity = panggung teater.
 * Hanya ada satu panggung, tapi latar belakangnya (screen)
 * bisa berganti-ganti sesuai adegan (navigasi).
 */
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()  // Mengaktifkan tampilan edge-to-edge (fullscreen modern)

        setContent {
            // Membungkus seluruh app dengan tema yang sudah didefinisikan
            NavDrawerAppTheme {
                // Membuat NavController = pengontrol navigasi antar halaman
                val navController = rememberNavController()

                // Gunakan Surface dengan warna BackgroundScreen sebagai root agar tidak ada flash putih
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = BackgroundScreen
                ) {
                    // Memanggil NavGraph yang berisi semua halaman
                    NavGraph(navController = navController)
                }
            }
        }
    }
}
