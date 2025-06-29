//package com.krzysobo.cryptocenter
//
//import androidx.compose.material.icons.Icons
//import androidx.compose.material.icons.automirrored.filled.Help
//import androidx.compose.material.icons.filled.Info
//import androidx.compose.material.icons.filled.Key
//import androidx.compose.material.icons.filled.KeyOff
//import androidx.compose.material.icons.filled.Settings
//import sobocryptocenter.composeapp.generated.resources.Res
//import sobocryptocenter.composeapp.generated.resources.about
//import sobocryptocenter.composeapp.generated.resources.decrypt
//import sobocryptocenter.composeapp.generated.resources.encrypt
//import sobocryptocenter.composeapp.generated.resources.help
//import sobocryptocenter.composeapp.generated.resources.settings
//import com.krzysobo.cryptocenter.settings.SCC_ROUTE_HANDLE
//import com.krzysobo.soboapptpl.service.AnyRes
//import com.krzysobo.soboapptpl.widgets.menus.SoboMenuItem
//import sobocryptocenter.composeapp.generated.resources.decrypt_dh
//import sobocryptocenter.composeapp.generated.resources.encrypt_dh
//
//
//val soboCryptoCenterMenuItems: List<SoboMenuItem> = listOf(
//    SoboMenuItem(
//        "encrypt",
//        AnyRes(Res.string.encrypt),
//        Icons.Default.Key,
//        routeHandle = SCC_ROUTE_HANDLE.ENCRYPT.value
//    ),
//    SoboMenuItem(
//        "decrypt",
//        AnyRes(Res.string.decrypt),
//        Icons.Default.KeyOff,
//        routeHandle = SCC_ROUTE_HANDLE.DECRYPT.value
//    ),
//
//    SoboMenuItem("div0", null, null),
//
//    SoboMenuItem(
//        "encrypt_dh",
//        AnyRes(Res.string.encrypt_dh),
//        Icons.Default.Key,
//        routeHandle = SCC_ROUTE_HANDLE.ENCRYPT_DH.value
//    ),
//    SoboMenuItem(
//        "decrypt_dh",
//        AnyRes(Res.string.decrypt_dh),
//        Icons.Default.KeyOff,
//        routeHandle = SCC_ROUTE_HANDLE.DECRYPT_DH.value
//    ),
//
//    SoboMenuItem("div1", null, null),
//
//    SoboMenuItem(
//        "about",
//        AnyRes(Res.string.about),
//        Icons.Default.Info,
//        routeHandle = SCC_ROUTE_HANDLE.ABOUT.value
//    ),
//    SoboMenuItem(
//        "help",
//        AnyRes(Res.string.help),
//        Icons.AutoMirrored.Filled.Help,
//        routeHandle = SCC_ROUTE_HANDLE.HELP.value
//    ),
//
//    SoboMenuItem(
//        "settings",
//        AnyRes(Res.string.settings),
//        Icons.Default.Settings,
//        routeHandle = SCC_ROUTE_HANDLE.SETTINGS.value
//    ),
//)
