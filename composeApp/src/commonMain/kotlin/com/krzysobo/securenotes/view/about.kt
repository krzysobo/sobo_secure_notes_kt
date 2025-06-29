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
fun PageAboutSoboSecureNotes() {
    Column(
        Modifier
            .fillMaxSize()
            .padding(all = 32.dp)
    ) {
        Text("Sobo Secure Notes v. $appVersion")
        Text("Copyright (c) Krzysztof Sobolewski <krzysobo_dev@o2.pl>")
        Text("Apache 2.0 License")
        Text("https://github.com/krzysobo")
    }
}