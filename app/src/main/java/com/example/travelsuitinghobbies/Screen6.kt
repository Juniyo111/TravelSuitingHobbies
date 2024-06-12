package com.example.travelsuitinghobbies

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.travelsuitinghobbies.ui.theme.TravelSuitingHobbiesTheme
import com.example.travelsuitinghubbies.QuestionGroups

@Composable
fun Screen6(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Use the existing Screen composable for the question group
        Box(
            modifier = Modifier.weight(1f), // Fill available height
            contentAlignment = Alignment.Center
        ) {
            Screen(navController, QuestionGroups.allGroups[4])
        }

        Spacer(modifier = Modifier.height(32.dp))

        // Button to navigate to the ResultScreen
        Button(onClick = { navController.navigate("resultScreen") }) {
            Text("추천 여행지 보기")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Screen6Preview() {
    TravelSuitingHobbiesTheme {
        val navController = rememberNavController()
        Screen6(navController)
    }
}






