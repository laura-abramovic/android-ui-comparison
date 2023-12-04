package com.laura.composeui.utils

import androidx.annotation.DimenRes
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.dimensionResource

@Composable
fun fontDimensionResource(@DimenRes id: Int) = with(LocalDensity.current) {
    dimensionResource(id = id).toSp()
}