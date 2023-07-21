package com.hl.jna.demo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.hl.jna.demo.ui.theme.JNAAndroidTheme

class MainActivity : ComponentActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContent {
			JNAAndroidTheme {
				// A surface container using the 'background' color from the theme
				Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
					TestJNA()
				}
			}
		}
	}
}

@Composable
fun TestJNA(modifier: Modifier = Modifier) {
	Column(
		horizontalAlignment = Alignment.CenterHorizontally,
		verticalArrangement = Arrangement.Center,
		modifier = modifier
	) {

		var displayResult by remember { mutableStateOf("JNA 调用结果") }

		Text(text = displayResult)

		TextButton(onClick = {
			displayResult = TestLib.instance.hello_world()
		}) {
			Text(text = "JNA 调用 Hello World 方法")
		}

		TextButton(onClick = {
			displayResult = TestLib.instance.add_count().toString()
		}) {
			Text(text = "JNA 调用 Add Count 方法")
		}
	}
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
	JNAAndroidTheme {
		TestJNA()
	}
}