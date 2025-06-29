package com.krzysobo.securenotes.settings


import com.krzysobo.securenotes.view.PageAboutSoboSecureNotes
import com.krzysobo.securenotes.view.PageHelpSoboSecureNotes
import com.krzysobo.securenotes.view.PageSoboSecureNotesEdit
import com.krzysobo.securenotes.view.PageSoboSecureNotesList
import com.krzysobo.securenotes.view.PageSoboSecureNotesSettings
import com.krzysobo.securenotes.view.PageWelcomeSoboSecureNotes
import com.krzysobo.soboapptpl.pubres.PubRes
import com.krzysobo.soboapptpl.service.AnyRes
import com.krzysobo.soboapptpl.service.SoboRoute


enum class SCN_ROUTE_HANDLE(val value: String) {
    WELCOME("welcome"),
    ABOUT("about"),
    HELP("help"),
    LIST("list"),
    EDIT("edit"),
    SETTINGS("settings"),
}


val soboSecureNotesRouteHandlesForDesktopMenu = listOf(
    SCN_ROUTE_HANDLE.LIST.value,
    SCN_ROUTE_HANDLE.EDIT.value,
    SCN_ROUTE_HANDLE.ABOUT.value,
    SCN_ROUTE_HANDLE.HELP.value,
    SCN_ROUTE_HANDLE.SETTINGS.value,
)

val soboSecureNotesRoutes = listOf(
    SoboRoute(
        SCN_ROUTE_HANDLE.WELCOME.value,
        AnyRes(PubRes.string.welcome),
        { PageWelcomeSoboSecureNotes() },
        perms = listOf()
    ),

    SoboRoute(
        SCN_ROUTE_HANDLE.LIST.value,
        AnyRes(PubRes.string.list),
        { PageSoboSecureNotesList() },
        perms = listOf()
    ),

    SoboRoute(
        SCN_ROUTE_HANDLE.EDIT.value,
        AnyRes(PubRes.string.edit),
        { PageSoboSecureNotesEdit() },
        perms = listOf()
    ),
    SoboRoute(
        SCN_ROUTE_HANDLE.SETTINGS.value,
        AnyRes(PubRes.string.settings),
        { PageSoboSecureNotesSettings() }
    ),
    SoboRoute(
        SCN_ROUTE_HANDLE.ABOUT.value,
        AnyRes(PubRes.string.about),
        { PageAboutSoboSecureNotes() },
    ),
    SoboRoute(
        SCN_ROUTE_HANDLE.HELP.value,
        AnyRes(PubRes.string.help),
        { PageHelpSoboSecureNotes() },
    )
)
