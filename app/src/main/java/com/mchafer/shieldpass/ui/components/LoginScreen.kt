package com.mchafer.shieldpass.ui.components

import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.mchafer.shieldpass.R


@Composable
fun LoginScreen(
    navController: NavHostController,
) {
    var masterPassword by rememberSaveable { mutableStateOf("") }
    val savedMasterPassword = "marcos";
    val context = LocalContext.current;

    fun checkLogin(masterPassword: String) {
        if (masterPassword == savedMasterPassword) {
            navController.navigate("passwordmanager")
        } else{
            Toast.makeText(context, "Master password isn't correct", Toast.LENGTH_LONG).show();
        }
    }

    Column (
        modifier = Modifier
            .fillMaxWidth()
        ,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // App title
        Text(
            modifier = Modifier
                .padding(top = 80.dp)
            ,
            text = stringResource(R.string.app_name),
            fontSize = 60.sp,
            color = Color.White,
            textAlign = TextAlign.Center,
        )
        // Brief description
        Text(
            modifier = Modifier
                .padding(bottom = 150.dp)
            ,
            text = "The best way to save your passwords",
            color = Color.Gray,
            textAlign = TextAlign.Center,
        )
        Text(
            modifier = Modifier
                .padding(bottom = 60.dp)
            ,
            text = "Introduce your master password:",
            color = Color.White,
            textAlign = TextAlign.Center,
        )
        OutlinedTextField(
            modifier = Modifier
                .padding(bottom = 20.dp)
            ,
            value = masterPassword,
            onValueChange = { newValue -> masterPassword = newValue },
            label = {Text("Master password") },
            singleLine = true,
            textStyle = TextStyle(Color.White)
        )
        Button(
            modifier = Modifier
                .width(100.dp)
            ,
            shape = RoundedCornerShape(10.dp),
            border = BorderStroke(color = Color.LightGray, width = 1.dp),
            onClick = { checkLogin(masterPassword) }
        ) {
            Text ("Enter")
        }
    }


}