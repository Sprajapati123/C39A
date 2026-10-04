package com.example.c39a

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.c39a.ui.theme.C39ATheme

class LoginActivity : ComponentActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LoginBody()
        }
    }

}

@Composable
fun LoginBody() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(12.dp)
            .background(color = Color.White)
    ) {
        Spacer(modifier = Modifier.height(70.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            Text(
                "Sign in", style = TextStyle(
                    fontSize = 27.sp,
                    color = Color.Blue,
                    fontWeight = FontWeight.W600
                )
            )
        }
        Spacer(modifier = Modifier.height(10.dp))
        Text(
            "Lorem ipsum is dummy placeholder text. Lorem ipsum is dummy placeholder text ",
            style = TextStyle(
                fontSize = 16.sp,
                color = Color.Gray,
                textAlign = TextAlign.Center
            )
        )

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 15.dp, horizontal = 15.dp)
        ) {
            SocialMediaCard(
                "Facebook", R.drawable.facebook, Modifier
                    .weight(1f)
                    .height(70.dp)
            )
            Spacer(modifier = Modifier.width(20.dp))
            SocialMediaCard(
                "Google", R.drawable.google, Modifier
                    .weight(1f)
                    .height(70.dp)
            )

        }
    }
}


@Composable
fun SocialMediaCard(label: String, image: Int, modifier: Modifier) {
    Card(
        modifier = modifier,
        shape = RoundedCornerShape(10.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color.Blue.copy(0.1f)
        )
    ) {
        Row(
            modifier = Modifier.fillMaxSize(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Image(
                painterResource(image),
                contentDescription = null,
                modifier = Modifier.size(30.dp)
            )
            Spacer(modifier = Modifier.width(10.dp))
            Text(label)
        }
    }
}

@Preview
@Composable
fun LoginPreview() {
    LoginBody()
}