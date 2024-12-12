package com.example.actividad_pmdm

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.dam23_24.composecatalogolayout.screens.Actividad1
import com.dam23_24.composecatalogolayout.screens.Actividad3
import com.dam23_24.composecatalogolayout.screens.Actividad4
import com.dam23_24.composecatalogolayout.screens.Actividad5

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Actividad5()
        }
    }
}
