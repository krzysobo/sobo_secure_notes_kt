package com.krzysobo.securenotes

import android.app.Activity
import androidx.activity.compose.BackHandler
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.LocalContext
import com.krzysobo.securenotes.settings.SCN_ROUTE_HANDLE
import com.krzysobo.securenotes.settings.soboSecureNotesRoutes
import com.krzysobo.soboapptpl.service.LocaleManager
import com.krzysobo.soboapptpl.service.SoboRouter
import com.krzysobo.soboapptpl.viewmodel.AppViewModelVM
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun SoboSecureNotesAndroidApp() {
    LocaleManager.useLocaleFromAppSettings()

    SoboRouter.initRouter(
        routes = soboSecureNotesRoutes,
        routeHandleWelcome = SCN_ROUTE_HANDLE.WELCOME.value,
        authUsed = false
    )
    SoboRouter.navigateToWelcomeIfBackStackEmpty()

    AppViewModelVM.isLayoutShown = remember { mutableStateOf(true) }

    SoboTheme(useDarkTheme = com.krzysobo.soboapptpl.viewmodel.isDarkMode()) {
        val routesDebug = false
        Column {
            // ---- routes debug ----
            if (routesDebug) {
                Text("BS SIZE: ${SoboRouter.backStack.size}")
                Text("Current route: ${SoboRouter.getCurrentRoute().handle}")
                Text("Previous Route: ${SoboRouter.getPreviousBackStackItemIfAvailable()?.route?.handle ?: "-nope-"}")
            }
            // ---- /routes debug ----

            val activity = (LocalContext.current as? Activity)
            BackHandler(enabled = true) {  // handling the Smartphone's "BACK" button
                com.krzysobo.soboapptpl.service.handleAndroidBackButton(activity)
            }

            com.krzysobo.soboapptpl.widgets.menus.AppLayoutWithDrawerMenu(
                soboSecureNotesMenuItems,
                {
                    if (it.routeHandle != "") {
                        SoboRouter.navigateToRouteHandle(it.routeHandle)
                    }
                },
                topAppBarTitle = "Sobo Secure Notes v. $appVersion",
                drawerAppTitle = "Sobo Secure Notes",
            )
        }
    }
}
