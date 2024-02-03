


package com.ucne.primercomposable

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ucne.primercomposable.ui.theme.PrimerComposableTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PrimerComposableTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    PrimerComponente()
                }
            }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun PrimerComponente() {
    var Texto by remember { mutableStateOf("") }
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(20.dp)) {
        OutlinedTextField(value = Texto,modifier = Modifier.fillMaxWidth(), onValueChange ={ Texto = it} , label = {
            Text(text = "Nombres")
        })
        OutlinedButton( modifier = Modifier.fillMaxWidth(), onClick = { /*TODO*/ }) {
            Row {
                Icon(imageVector = Icons.Default.CheckCircle, contentDescription ="Guardar")
                Text(text = "Guardar")
            }

        }
    }

}