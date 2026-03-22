package com.example.hellocompose
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.tooling.preview.Preview
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HelloComposeApp()
        }
    }

}
@Composable
fun HelloComposeApp() {
    MaterialTheme {
        var name by remember { mutableStateOf("Студент") }
        Surface {
            Column {
                Text(text = "Hello, $name!", style =
                    MaterialTheme.typography.headlineMedium)
                Button(onClick = { name = "Світ" }) { Text("Натисни") }
            }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun PreviewHello() {
    HelloComposeApp()
}