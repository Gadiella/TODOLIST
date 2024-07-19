package com.example.todolist

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.ClickableText
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.todolist.ui.theme.ToDoListTheme

class MainActivity3() : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ToDoListTheme {
                Greeting3()
                }
            }
        }
    }


@Composable
fun Greeting3() {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.LightGray)
            .padding(10.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "CONNEXION", fontSize = 24.sp, color = Color.Black)
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "Veuillez renseigner les champs avec vos informations", color = Color.Black)
        Spacer(modifier = Modifier.height(16.dp))
        OutlinedTextField(value = email, onValueChange = { email = it }, label = { Text("Email") })
        Spacer(modifier = Modifier.height(8.dp))
        OutlinedTextField(value = password, onValueChange = { password = it }, label = { Text("Mot de passe") }, visualTransformation = PasswordVisualTransformation())
        Spacer(modifier = Modifier.height(8.dp))
        ClickableText(text = AnnotatedString("Mot de passe oublié ?"), onClick = { /* Handle password reset */ })
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = {
//            if (email.isEmpty() || password.isEmpty()) {
//                Toast.makeText(LocalContext.current, "Veuillez remplir tous les champs", Toast.LENGTH_SHORT).show()
//            } else {
//                Toast.makeText(LocalContext.current, "Connexion réussie", Toast.LENGTH_SHORT).show()
//            }
        }) {
            Text("Soumettre")
        }
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "Ou se connecter avec", color = Color.Black)
        Spacer(modifier = Modifier.height(8.dp))
        Image(painter = painterResource(id = R.drawable.icons),
            contentDescription = "Google Sign-In", modifier = Modifier.size(48.dp))
    }
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview2() {
    ToDoListTheme {
        Greeting3()
    }
}