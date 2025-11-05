package com.bilal.moneyconvertorapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.mc.designsystem.components.MCTextMenu
import com.mc.designsystem.theme.MoneyConvertorAppTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MoneyConvertorAppTheme {
                MCTextMenu(
                    selectedOption = "USD",
                    options = listOf(
                        "USD", "EUR", "GBP",
                    )
                ) { }
            }
        }
    }
}