package com.example.sampleuiautomatorproject.test

import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.sampleuiautomatorproject.application.PlayMarket
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class InstallHabrTest: AbstractApplicationTest(PlayMarket()) {

    @Test
    fun installHabr() = with(PlayMarket()) {
        open()
        clickSearch()
        typeToSearch("Habrahabr")
        clickResult("Habr — сообщество IT-специалистов")
        clickInstall()
        waitForInstalled()
        openInstalledApp()
    }
}
