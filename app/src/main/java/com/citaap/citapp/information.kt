package com.citaap.citapp

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.citaap.citapp.ui.theme.CitAppTheme

@Preview
@Composable

fun information() {
    CitAppTheme {
        Scaffold (modifier = Modifier.fillMaxSize().fillMaxHeight()){ innerPadding ->
            Column (modifier = Modifier
                .padding(innerPadding)
                .padding(14.dp)
                .fillMaxSize() , verticalArrangement = Arrangement.Center){
                Card {
                    Column {
                        Text(text = "Información", fontSize = 25.sp, fontWeight = FontWeight.Bold)
                        OutlinedTextField(
                            value = "",
                            onValueChange = {},
                            label = { Text(text = "Nombre") },
                            modifier = Modifier.fillMaxWidth()
                        )
                        OutlinedTextField(
                            value = "",
                            onValueChange = {},
                            label = { Text(text = "Correo electrónico") },
                            modifier = Modifier.fillMaxWidth()
                        )
                        OutlinedTextField(
                            value = "",
                            onValueChange = {},
                            label = { Text(text = "Cédula") },
                            modifier = Modifier.fillMaxWidth()
                        )
                        OutlinedTextField(
                            value = "",
                            onValueChange = {},
                            label = { Text(text = "Contraseña") },
                            modifier = Modifier.fillMaxWidth()
                        )
                        Button(onClick = { /*TODO*/ }, modifier = Modifier.fillMaxWidth()) {
                            Text(text = "Editar información")
                        }

                    }
                }

            }
        }
    }
}