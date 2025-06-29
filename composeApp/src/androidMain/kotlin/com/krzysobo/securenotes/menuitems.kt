package com.krzysobo.securenotes

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.Help
import androidx.compose.material.icons.automirrored.filled.List
import androidx.compose.material.icons.filled.Create
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Settings
import com.krzysobo.securenotes.settings.AppRes
import com.krzysobo.securenotes.settings.SCN_ROUTE_HANDLE
import com.krzysobo.soboapptpl.pubres.PubRes
import com.krzysobo.soboapptpl.service.AnyRes
import com.krzysobo.soboapptpl.widgets.menus.SoboMenuItem


val soboSecureNotesMenuItems: List<SoboMenuItem> = listOf(
    SoboMenuItem(
        "list",
        AnyRes(PubRes.string.list),
        Icons.AutoMirrored.Filled.List,
        routeHandle = SCN_ROUTE_HANDLE.LIST.value
    ),
    SoboMenuItem(
        "create",
        AnyRes(AppRes.string.add_note),
        Icons.Default.Create,
        routeHandle = SCN_ROUTE_HANDLE.EDIT.value
    ),

    SoboMenuItem("div0", null, null),

    SoboMenuItem(
        "about",
        AnyRes(PubRes.string.about),
        Icons.Default.Info,
        routeHandle = SCN_ROUTE_HANDLE.ABOUT.value
    ),
    SoboMenuItem(
        "help",
        AnyRes(PubRes.string.help),
        Icons.AutoMirrored.Filled.Help,
        routeHandle = SCN_ROUTE_HANDLE.HELP.value
    ),

    SoboMenuItem(
        "settings",
        AnyRes(PubRes.string.settings),
        Icons.Default.Settings,
        routeHandle = SCN_ROUTE_HANDLE.SETTINGS.value
    ),
)
