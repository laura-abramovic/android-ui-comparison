package com.laura.composeui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.laura.composeui.R
import com.laura.composeui.components.PetCard
import com.laura.composeui.core.Spacing
import com.laura.composeui.utils.fontDimensionResource
import com.laura.shared.pets.domain.MockRepo

@Composable
fun PetsScreen() {
    Column {

        Text(
            text = stringResource(id = R.string.pets_title),
            fontSize = fontDimensionResource(id = R.dimen.title_font_size),
            modifier = Modifier.padding(Spacing.Medium)
        )

        LazyColumn {
            items(MockRepo.petList()) {
                PetCard(
                    pet = it,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = Spacing.Small, vertical = Spacing.ExtraSmall)
                )
            }
        }
    }
}
