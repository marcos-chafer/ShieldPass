package com.mchafer.shieldpass.ui.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController

@Composable
fun PasswordManagerScreen(
    navController: NavController
) {

    LazyColumn(
        modifier = Modifier
            .fillMaxWidth()
        ,
        horizontalAlignment = Alignment.CenterHorizontally
        ,content = {
        items(100) { index ->
            CredentialCard(app = "Firefox", user = "mchafer", password = "marquitos");
        }
    })
}