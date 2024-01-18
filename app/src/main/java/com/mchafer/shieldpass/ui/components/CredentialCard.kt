package com.mchafer.shieldpass.ui.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun CredentialCard (
    app: String,
    user: String,
    password: String
)
{
    Card(
        modifier = Modifier
//            .fillMaxWidth(0.5f)
            .padding(vertical = 10.dp)
            ,
        colors = CardDefaults.cardColors(
            containerColor = Color.Blue,
        ),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 10.dp
        ),
    ) {
        Row {
            Text(
                modifier = Modifier
                    .padding(10.dp)
                ,
                text = app,
                color = Color.White,
            )
            Text(
                modifier = Modifier
                    .padding(10.dp)
                ,
                text = user,
                color = Color.White,
            )
        }
        Row {
            Text(
                modifier = Modifier
                    .padding(10.dp)
                ,
                text = password,
                color = Color.White,
            )
        }

    }
}