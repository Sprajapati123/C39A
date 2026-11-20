package com.example.c39a

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.c39a.ui.theme.C39ATheme
import com.example.c39a.ui.theme.Purple80
import com.example.c39a.ui.theme.PurpleGrey80

class RegistrationActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            RegistrationBody()
        }
    }
}

@Composable
fun RegistrationBody() {

    var firstName by remember { mutableStateOf("") }
    var lastName by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
    ) {
        Spacer(modifier = Modifier.height(50.dp))

        Text(
            "Register", style = TextStyle(
                fontWeight = FontWeight.Bold,
                fontSize = 22.sp,
                color = PurpleGrey80
            ), textAlign = TextAlign.Center, modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(50.dp))

        Row(modifier = Modifier.fillMaxWidth()) {
            OutlinedTextField(
                placeholder = {
                    Text("First name")
                },
                value = firstName,
                colors = TextFieldDefaults.colors(
                    focusedContainerColor = Purple80,
                    focusedIndicatorColor = Purple80,
                    unfocusedIndicatorColor = Color.Transparent,
                    unfocusedContainerColor = Purple80
                ),
                onValueChange = { name ->
                    firstName = name
                },
                modifier = Modifier.weight(1f)
            )

            Spacer(modifier = Modifier.width(10.dp))
            OutlinedTextField(
                value = lastName,
                placeholder = {
                    Text("last name")
                },
                colors = TextFieldDefaults.colors(
                    focusedContainerColor = Purple80,
                    focusedIndicatorColor = Purple80,
                    unfocusedIndicatorColor = Color.Transparent,
                    unfocusedContainerColor = Purple80
                ),
                onValueChange = { name ->
                    lastName = name
                },
                modifier = Modifier.weight(1f)
            )
        }

        Spacer(modifier = Modifier.height(10.dp))
        OutlinedTextField(
            value = email,
            placeholder = {
                Text("Email")
            },
            colors = TextFieldDefaults.colors(
                focusedContainerColor = Purple80,
                focusedIndicatorColor = Purple80,
                unfocusedIndicatorColor = Color.Transparent,
                unfocusedContainerColor = Purple80
            ),
            onValueChange = {
                email = it
            },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(10.dp))
        OutlinedTextField(
            value = password,
            placeholder = {
                Text("Password")
            },
            colors = TextFieldDefaults.colors(
                focusedContainerColor = Purple80,
                focusedIndicatorColor = Purple80,
                unfocusedIndicatorColor = Color.Transparent,
                unfocusedContainerColor = Purple80
            ),
            onValueChange = {
                password = it
            },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(10.dp))

        ElevatedButton(
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Gray,
                contentColor = Color.White
            ),
            modifier = Modifier.fillMaxWidth(),
            onClick = {}) {
            Text("Register")
        }
        Spacer(modifier = Modifier.height(10.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.End,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                "Already has an account?", style = TextStyle(
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp,
                    color = PurpleGrey80
                ), textAlign = TextAlign.Center
            )
            Text(" Sign in", style = TextStyle(
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp,
                color = Color.Blue
            ),)
        }
        Spacer(modifier = Modifier.height(50.dp))

    }
}

@Preview
@Composable
fun RegistrationPreview() {
    RegistrationBody()
}