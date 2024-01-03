package com.example.calculator.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.rememberLottieComposition
import com.example.calculator.R
import com.example.calculator.ui.theme.MediumGray

@Composable
fun SplashScreen(){
    val composition by rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.animation))

    Box(modifier = Modifier
        .fillMaxSize()
        .background(MediumGray)
        .padding(16.dp)){
        LottieAnimation(composition = composition)
    }
}