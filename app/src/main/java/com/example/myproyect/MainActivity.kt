
package com.example.myproyect
import MyViewModel
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import com.example.myproyect.ui.theme.MyProyectTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyProyectTheme {
                MainActivityContent()
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainActivityContent(viewModel: MyViewModel = viewModel()) {
    var text1 by remember { mutableStateOf(TextFieldValue("")) }
    var text2 by remember { mutableStateOf(TextFieldValue("")) }
    var resultText by remember { mutableStateOf("") }

    Column(
        modifier = Modifier.padding(16.dp)
    ) {
        TextField(
            value = text1,
            onValueChange = { newText -> text1 = newText },
            label = { Text("Texto 1") },
            modifier = Modifier.fillMaxWidth().padding(8.dp)
        )

        TextField(
            value = text2,
            onValueChange = { newText -> text2 = newText },
            label = { Text("Texto 2") },
            modifier = Modifier.fillMaxWidth().padding(8.dp)
        )

        Button(
            onClick = {
                resultText = if (text1 == text2) {
                    "Las cadenas son iguales"
                } else {
                    "Las cadenas son diferentes"
                }
            },
            modifier = Modifier.fillMaxWidth().padding(8.dp)
        ) {
            Text(text = "Comparar")
        }

        Spacer(modifier = Modifier.padding(8.dp))

        Text(
            text = resultText,
            modifier = Modifier.fillMaxWidth().padding(8.dp)
        )
    }
}
