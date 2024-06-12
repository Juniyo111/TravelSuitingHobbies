package com.example.travelsuitinghobbies

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.travelsuitinghobbies.ui.theme.TravelSuitingHobbiesTheme
import com.example.travelsuitinghubbies.QuestionGroups

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TravelSuitingHobbiesTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val navController = rememberNavController()
                    val questionGroups = QuestionGroups.allGroups

                    NavHost(navController = navController, startDestination = "mainScreen") {
                        composable("mainScreen") { MainScreen(navController) }
                        composable("screen2") { Screen(navController, questionGroups[0]) }
                        composable("screen3") { Screen(navController, questionGroups[1]) }
                        composable("screen4") { Screen(navController, questionGroups[2]) }
                        composable("screen5") { Screen(navController, questionGroups[3]) }
                        composable("screen6") { Screen6(navController) } // Connect to Screen6
                        composable("resultScreen") { ResultScreen(navController) }
                        // Add more composable routes for additional screens
                    }
                }
            }
        }
    }
}


data class QuestionGroup(
    val questions: List<String>,
    val nextDestination: String
)


