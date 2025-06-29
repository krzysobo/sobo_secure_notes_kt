package com.krzysobo.securenotes.view

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import com.krzysobo.soboapptpl.widgets.menus.PageTabsWithOutletAndLogin
import org.jetbrains.compose.ui.tooling.preview.Preview
import com.krzysobo.securenotes.SoboTheme
import com.krzysobo.securenotes.settings.soboSecureNotesRouteHandlesForDesktopMenu
import com.krzysobo.securenotes.settings.soboSecureNotesRoutes

@Composable
@Preview
fun SoboSecureNotesApp() {
    SoboTheme {
        Column {
            PageTabsWithOutletAndLogin(
                soboSecureNotesRouteHandlesForDesktopMenu, soboSecureNotesRoutes)
        }
    }
}