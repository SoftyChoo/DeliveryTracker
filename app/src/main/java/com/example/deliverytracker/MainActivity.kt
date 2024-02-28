package com.example.deliverytracker

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import com.example.deliverytracker.ui.theme.DeliveryTrackerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DeliveryTrackerTheme {
                MainScreen()
            }
        }
    }
}

@Composable
fun MainScreen() {
    val scaffoldState = rememberScaffoldState() //최근의 상태를 저장
    val scope = rememberCoroutineScope () // CoroutineScope 생성

}