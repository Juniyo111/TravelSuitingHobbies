package com.example.travelsuitinghobbies

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.travelsuitinghobbies.ui.theme.TravelSuitingHobbiesTheme
import com.example.travelsuitinghubbies.QuestionGroups

@Composable
fun Screen5(navController: NavHostController) {
    Screen(navController, QuestionGroups.allGroups[4])
}

@Preview(showBackground = true)
@Composable
fun Screen5Preview() {
    TravelSuitingHobbiesTheme {
        val navController = rememberNavController()
        Screen5(navController)
    }
}