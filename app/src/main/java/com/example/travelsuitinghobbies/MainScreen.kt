package com.example.travelsuitinghobbies

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.travelsuitinghobbies.ui.theme.TravelSuitingHobbiesTheme

@Composable
fun MainScreen(navController: NavHostController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFFFFFE0)) // Set your desired background color here
            .padding(16.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(70.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ) {
            Text(
                text = "여행과 취미",
                color = Color.Red,
                fontSize = 40.sp,
                modifier = Modifier
                    .padding(start = 5.dp, end = 5.dp, bottom = 16.dp),
                textAlign = TextAlign.Center
            )
            Text(
                text = "취미에 맞는 여행지 검색",
                color = Color.Blue,
                fontSize = 20.sp,
                modifier = Modifier.padding(bottom = 8.dp),
                textAlign = TextAlign.Center
            )
            Image(
                painter = painterResource(id = R.drawable.travel),
                contentDescription = "Travel Image",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)  // Adjust the height as needed
                    .padding(bottom = 16.dp),
                contentScale = ContentScale.Crop
            )
            Text(
                text = "질문에 '예' 또는 '아니요'로 답변해 주세요.",
                fontSize = 13.sp,
                modifier = Modifier.padding(bottom = 16.dp),
                textAlign = TextAlign.Center
            )
            Button(onClick = { navController.navigate("screen2") }) {
                Text(text = "다음")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
    TravelSuitingHobbiesTheme {
        val navController = rememberNavController()
        MainScreen(navController)
    }
}
