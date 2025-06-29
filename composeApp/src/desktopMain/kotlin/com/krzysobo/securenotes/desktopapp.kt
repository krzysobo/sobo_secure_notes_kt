package com.krzysobo.securenotes


import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.window.FrameWindowScope
import com.krzysobo.cryptocenter.settings.SCC_ROUTE_HANDLE
import com.krzysobo.securenotes.settings.AppRes
import com.krzysobo.securenotes.settings.soboSecureNotesRouteHandlesForDesktopMenu
import com.krzysobo.securenotes.settings.soboSecureNotesRoutes
import com.krzysobo.soboapptpl.service.AnyRes
import com.krzysobo.soboapptpl.service.LocaleManager
import com.krzysobo.soboapptpl.service.SoboRouter
import com.krzysobo.soboapptpl.service.anyResText
import com.krzysobo.soboapptpl.widgets.menus.PageTabsWithOutletAndLogin
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun SoboSecureNotesDesktopApp() {
    LocaleManager.useLocaleFromAppSettings()

    SoboRouter.initRouter(
        routes = soboSecureNotesRoutes,
        routeHandleLoggedInUserHome = "",
        routeHandleWelcome = SCC_ROUTE_HANDLE.WELCOME.value,
        authUsed = false  // no auth needed in this app!
    )

    SoboTheme {
        Column {
            Text(anyResText(AnyRes(AppRes.string.app_name_sobo_secure_notes_desktop)))
            PageTabsWithOutletAndLogin(
                soboSecureNotesRouteHandlesForDesktopMenu,
                soboSecureNotesRoutes
            )
        }
    }
}


@Composable
fun FrameWindowScope.DesktopApp() {
    SoboTheme {
        Column {
            Column {
                SoboSecureNotesDesktopApp()
            }
        }
    }
}
