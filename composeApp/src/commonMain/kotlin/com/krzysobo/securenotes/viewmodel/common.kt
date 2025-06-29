package com.krzysobo.securenotes.viewmodel


fun getSettingsPageVM(): SettingsPageVM {
    return AllViewModels.settingsPageVM
}

private object AllViewModels {

    val settingsPageVM = SettingsPageVM()
}

