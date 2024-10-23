package com.citaap.citapp

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import java.lang.reflect.Modifier

@Preview
@Composable
fun FormMovieScreen(){
    Column (modifier = Modifier
        .fillMaxSize()
        .padding(16.dp),
        verticalArrangement = Arrangement.Center
    ) {

        Card (modifier = Modifier.fillMaxWidth()
        ) {
            Column (modifier = Modifier.padding(16.dp)){
                Text(
                    text = "Login",
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Bold

                )
                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    label =  { Text(text = "Titlle")},
                    modifier = Modifier.fillMaxWidth()
                )
            }
            Column (modifier = Modifier.padding(16.dp)) {
                OutlinedTextField(value = "",
                    onValueChange = {},
                    label =  { Text(text = "Description")},
                    modifier = Modifier.fillMaxWidth()
                )
            }
            Column (modifier = Modifier.padding(16.dp)) {

                OutlinedTextField(value = "",
                    onValueChange = {},
                    label =  { Text(text = "Realease year")},
                    modifier = Modifier.fillMaxWidth()
                )
            }
            Column (modifier = Modifier.padding(16.dp)) {
                OutlinedTextField(value = "",
                    onValueChange = {},
                    label =  { Text(text = "Url")},
                    modifier = Modifier.fillMaxWidth()
                )

                Button(onClick = { /*TODO*/

                },
                    modifier = Modifier)
                { Text(text = "ADD Movie")


                }
            }
        }
    }

}