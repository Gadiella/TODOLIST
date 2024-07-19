package com.example.todolist

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.todolist.ui.theme.ToDoListTheme

class MainActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ToDoListTheme {
                Greeting2()
                }
            }
        }
    }


@Composable
fun Greeting2() {
    var code1 by remember { mutableStateOf("") }
    var code2 by remember { mutableStateOf("") }
    var code3 by remember { mutableStateOf("") }
    var code4 by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.LightGray)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "CODE DE CONFIRMATION", fontSize = 24.sp, color = Color.Black)
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "Entrer le code que vous avez reçu", color = Color.Black)
        Spacer(modifier = Modifier.height(16.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 32.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            OutlinedTextField(
                value = code1,
                onValueChange = { if (it.length <= 1) code1 = it },
                modifier = Modifier.width(48.dp),
                visualTransformation = VisualTransformation.None
            )
            OutlinedTextField(
                value = code2,
                onValueChange = { if (it.length <= 1) code2 = it },
                modifier = Modifier.width(48.dp),
                visualTransformation = VisualTransformation.None
            )
            OutlinedTextField(
                value = code3,
                onValueChange = { if (it.length <= 1) code3 = it },
                modifier = Modifier.width(48.dp),
                visualTransformation = VisualTransformation.None
            )
            OutlinedTextField(
                value = code4,
                onValueChange = { if (it.length <= 1) code4 = it },
                modifier = Modifier.width(48.dp),
                visualTransformation = VisualTransformation.None
            )
        }
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = {
//            if (code1.isEmpty() || code2.isEmpty() || code3.isEmpty() || code4.isEmpty()) {
//                Toast.makeText(LocalContext.current, "Veuillez remplir tous les champs", Toast.LENGTH_SHORT).show()
//            } else {
//                Toast.makeText(LocalContext.current, "Code soumis", Toast.LENGTH_SHORT).show()
//            }
        }) {
            Text("Soumettre")
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview5() {
    ToDoListTheme {
     Greeting2( )
    }
}