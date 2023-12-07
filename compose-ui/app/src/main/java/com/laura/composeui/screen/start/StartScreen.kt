package com.laura.composeui.screen.start

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.laura.composeui.R
import com.laura.composeui.core.Spacing
import com.laura.composeui.ui.theme.ComposeUITheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun StartScreen() {
    val input = rememberSaveable { mutableStateOf("") }
    val username = rememberSaveable { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = stringResource(
                id = R.string.hello_user,
                username.value.ifBlank { stringResource(id = R.string.user) }
            ),
            style = MaterialTheme.typography.headlineMedium
        )

        TextField(
            value = input.value,
            onValueChange = { input.value = it },
            modifier = Modifier.padding(vertical = Spacing.ExtraLarge)
        )

        Button(
            onClick = { username.value = input.value }
        ) {
            Text(
                text = stringResource(id = R.string.greet).uppercase(),
                style = MaterialTheme.typography.bodyLarge,
                modifier = Modifier.padding(
                    horizontal = Spacing.Medium,
                    vertical = Spacing.Small
                )
            )
        }
    }
}

@Preview
@Composable
private fun StartScreenPreview() = ComposeUITheme {
    StartScreen()
}