package com.elfarsisy.doctorpoint.feature.splash.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.elfarsisy.doctorpoint.feature.onboarding.presentation.view.OnBoardingActivity

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val splashScreen = installSplashScreen()
        super.onCreate(savedInstanceState)
        splashScreen.setKeepOnScreenCondition{true}
        navigateTo()
        finish()

    }

    private fun navigateTo() {
        startActivity(Intent(this,OnBoardingActivity::class.java))
    }

}