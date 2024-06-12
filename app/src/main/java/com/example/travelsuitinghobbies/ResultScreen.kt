package com.example.travelsuitinghobbies

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.travelsuitinghobbies.ui.theme.TravelSuitingHobbiesTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ResultScreen(navController: NavHostController) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("여행지 검색 결과") }
            )
        },
        content = { paddingValues ->
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(paddingValues)
                    .padding(16.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Text(
                    text = "추천 여행지",
                    style = MaterialTheme.typography.headlineMedium,
                    modifier = Modifier.padding(bottom = 16.dp)
                )

                // Placeholder for travel place information
                TravelPlaceCard(placeName = "Place 1", description = "Description for Place 1")
                TravelPlaceCard(placeName = "Place 2", description = "Description for Place 2")
                TravelPlaceCard(placeName = "Place 3", description = "Description for Place 3")
            }
        }
    )
}

@Composable
fun TravelPlaceCard(placeName: String, description: String) {
    Card(
        modifier = Modifier.fillMaxWidth(),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = placeName, style = MaterialTheme.typography.titleMedium)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = description, style = MaterialTheme.typography.bodyMedium)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ResultScreenPreview() {
    TravelSuitingHobbiesTheme {
        val navController = rememberNavController()
        ResultScreen(navController)
    }
}




