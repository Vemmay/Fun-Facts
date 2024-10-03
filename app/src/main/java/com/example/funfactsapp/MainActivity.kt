package com.example.funfactsapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.funfactsapp.ui.theme.FunFactsAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FunFactsAppTheme {
                val viewModel: FactsModelView by viewModels()
                Display(viewModel)
            }
        }
    }
}

@Composable
fun Display(viewModel: FactsModelView) {
    var fact by remember { mutableStateOf(viewModel.getRandomFact()) }
    Box(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxSize(),

        contentAlignment = Alignment.Center
    ) {
        Card(modifier = Modifier.border(1.dp, Color.Black, shape = RoundedCornerShape(12.dp))) {
            Column(
                verticalArrangement = Arrangement.Center, modifier = Modifier.padding(16.dp),
            ) {
                Text(text = fact )
                Spacer(modifier = Modifier.height(16.dp))
                Button(onClick = { fact = viewModel.getRandomFact() }) {
                    Text("Next Fact")
                }
            }
        }

    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    FunFactsAppTheme {}
}