@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.thirtydaysofwellness

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.thirtydaysofwellness.model.ExerciseDatasource
import com.example.thirtydaysofwellness.ui.theme.ThirtyDaysOfWellnessTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ThirtyDaysOfWellnessTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ThirtyDaysOfWellnessApp()
                }
            }
        }
    }
}

@Composable
fun ThirtyDaysOfWellnessApp() {
    Scaffold(
        topBar = {
            ThirtyDaysOfWellnessTopAppBar()
        }
    ) { innerPadding ->
        DailyExerciseList(
            ExerciseDatasource.dailyExercises,
            Modifier.padding(innerPadding)
        )
    }
}

@Composable
fun ThirtyDaysOfWellnessTopAppBar(modifier: Modifier = Modifier) {
    CenterAlignedTopAppBar(
        title = {
            Text(
                text = stringResource(id = R.string.app_name),
                style = MaterialTheme.typography.displayLarge
            )
        },
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun ThirtyDaysOfWellnessAppPreview() {
    ThirtyDaysOfWellnessTheme(darkTheme = false) {
        ThirtyDaysOfWellnessApp()
    }
}

@Preview(showBackground = true)
@Composable
fun ThirtyDaysOfWellnessAppDarkThemePreview() {
    ThirtyDaysOfWellnessTheme(darkTheme = true) {
        ThirtyDaysOfWellnessApp()
    }
}