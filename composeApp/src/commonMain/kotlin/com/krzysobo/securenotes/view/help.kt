package com.krzysobo.securenotes.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.krzysobo.securenotes.appVersion


@Composable
fun PageHelpSoboSecureNotes() {

    Column(
        Modifier
            .fillMaxSize()
            .padding(all = 32.dp)
    ) {
        Text("Sobo Secure Notes v. $appVersion HELP")
        Text("More at: https://github.com/krzysobo/")
    }
}


