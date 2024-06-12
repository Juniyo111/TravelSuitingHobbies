package com.example.travelsuitinghobbies

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.travelsuitinghobbies.ui.theme.TravelSuitingHobbiesTheme
import com.example.travelsuitinghubbies.QuestionGroups

@Composable
fun Screen2(navController: NavHostController) {
    Screen(navController, QuestionGroups.allGroups[1])
}

@Preview(showBackground = true)
@Composable
fun Screen2Preview() {
    TravelSuitingHobbiesTheme {
        val navController = rememberNavController()
        Screen2(navController)
    }
}