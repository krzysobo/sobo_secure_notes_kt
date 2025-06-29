import org.jetbrains.compose.desktop.application.dsl.TargetFormat
import org.jetbrains.kotlin.gradle.ExperimentalKotlinGradlePluginApi
import org.jetbrains.kotlin.gradle.dsl.JvmTarget

plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.composeMultiplatform)
    alias(libs.plugins.composeCompiler)
    alias(libs.plugins.serialization)
}

kotlin {

    androidTarget {
        @OptIn(ExperimentalKotlinGradlePluginApi::class)
        compilerOptions {
            jvmTarget.set(JvmTarget.JVM_11)
        }
    }

    jvm("desktop")


    sourceSets {
        val desktopMain by getting

        androidMain.dependencies {
            implementation(compose.preview)
            implementation(libs.androidx.activity.compose)

            // using API instead of implementation to have access to resources
            api(project(":soboCryptoLib", ""))
            api(project(":soboAppTpl", ""))
        }

        commonMain.dependencies {
            implementation(compose.runtime)
            implementation(compose.foundation)
            implementation(compose.material)
            implementation(compose.ui)
            implementation(compose.components.resources)
            implementation(compose.components.uiToolingPreview)
            implementation(libs.androidx.lifecycle.viewmodel)
            implementation(libs.androidx.lifecycle.runtime.compose)
            implementation(compose.materialIconsExtended)  // icons for desktop/others
            implementation(libs.multiplatform.settings)

            implementation(project(":soboCryptoLib", ""))
            implementation(project(":soboAppTpl", ""))
        }

        desktopMain.dependencies {
            implementation(compose.desktop.currentOs)
            implementation(libs.kotlinx.coroutines.swing)
            implementation(compose.materialIconsExtended)  // icons for desktop/others

            implementation(project(":soboCryptoLib", ""))
            implementation(project(":soboAppTpl", ""))
        }
    }
}

android {
    namespace = "com.krzysobo.securenotes"
    compileSdk = libs.versions.android.compileSdk.get().toInt()

    defaultConfig {
        applicationId = "com.krzysobo.securenotes"
        minSdk = libs.versions.android.minSdk.get().toInt()
        targetSdk = libs.versions.android.targetSdk.get().toInt()
        versionCode = 1
        versionName = "1.2.0"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
            /*
                --> fix for the following BouncyCastle's error:
                2 files found with path 'META-INF/versions/9/OSGI-INF/MANIFEST.MF' from inputs:
                 - org.bouncycastle:bcprov-jdk18on:1.81/bcprov-jdk18on-1.81.jar
                 - org.jspecify:jspecify:1.0.0/jspecify-1.0.0.jar
                Adding a packaging block may help, please refer to
             */
            excludes += "META-INF/versions/9/OSGI-INF/MANIFEST.MF"
        }
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }


}

dependencies {
    implementation(libs.androidx.ui.android)
    implementation(libs.androidx.ui.text.android)
    implementation(libs.androidx.foundation.layout.android)
    implementation(libs.foundation.layout.android)
    implementation(libs.play.services.auth)
    implementation(libs.ui.android)    // for Android

    debugImplementation(compose.uiTooling)
}

compose.desktop {
    application {
        mainClass = "com.krzysobo.securenotes.MainKt"

        nativeDistributions {
            targetFormats(TargetFormat.Dmg, TargetFormat.Msi, TargetFormat.Deb)
            packageName = "com.krzysobo.securenotes"
            packageVersion = "1.2.0"
        }
    }
}
