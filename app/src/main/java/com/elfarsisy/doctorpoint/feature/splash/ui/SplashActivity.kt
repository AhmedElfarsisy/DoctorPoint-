package com.elfarsisy.doctorpoint.feature.splash.ui

import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.databinding.DataBindingUtil
import com.elfarsisy.doctorpoint.R
import com.elfarsisy.doctorpoint.databinding.ActivitySplashBinding
import kotlinx.coroutines.GlobalScope

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val splashScreen = installSplashScreen()
        super.onCreate(savedInstanceState)
        splashScreen.setKeepOnScreenCondition(){true}

    }

    private fun navigateTo() {
        // navigate to onBoarding
    }

}