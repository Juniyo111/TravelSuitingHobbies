package com.example.travelsuitinghobbies

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.travelsuitinghobbies.ui.theme.TravelSuitingHobbiesTheme

@Composable
fun AppNavHost(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "screen2") {
        composable("screen2") { Screen2(navController) }
        composable("screen3") { Screen3(navController) }
        composable("screen4") { Screen4(navController) }
        composable("screen5") { Screen5(navController) }
        composable("screen6") { Screen6(navController) }
        composable("resultScreen") { ResultScreen(navController) }
    }
}

@Composable
fun Screen(navController: NavHostController, questionGroup: QuestionGroup) {
    var currentQuestionIndex by remember { mutableStateOf(0) }

    if (currentQuestionIndex >= questionGroup.questions.size) {
        navController.navigate(questionGroup.nextDestination)
        return
    }
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFFFFFE0)) // Set your desired background color here
            .padding(16.dp)
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = questionGroup.questions[currentQuestionIndex],
                modifier = Modifier.padding(50.dp)
            )
            Row(
                modifier = Modifier.padding(bottom = 16.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Button(onClick = {
                    handleAnswer(questionGroup.questions[currentQuestionIndex], "Yes")
                    currentQuestionIndex++
                }) {
                    Text("Yes")
                }

                Spacer(modifier = Modifier.width(16.dp))

                Button(onClick = {
                    handleAnswer(questionGroup.questions[currentQuestionIndex], "No")
                    currentQuestionIndex++
                }) {
                    Text("No")
                }
            }
        }
    }
}

fun handleAnswer(question: String, answer: String) {
    // Implement your data storage logic here
    // This is just a placeholder
    println("Question: $question, Answer: $answer")
}

@Preview(showBackground = true)
@Composable
fun ScreenPreview() {
    TravelSuitingHobbiesTheme {
        val navController = rememberNavController()
        val questionGroup = QuestionGroup(
            listOf(
                "Sample question 1?",
                "Sample question 2?",
                "Sample question 3?"
            ),
            "screen6"
        )
        Screen(navController, questionGroup)
    }
}


