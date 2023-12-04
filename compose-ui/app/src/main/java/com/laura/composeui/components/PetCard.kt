package com.laura.composeui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.tooling.preview.Preview
import coil.compose.AsyncImage
import com.laura.composeui.R
import com.laura.composeui.core.Spacing
import com.laura.composeui.domain.Pet
import com.laura.composeui.domain.PetSpecies
import com.laura.composeui.ui.theme.ComposeUITheme
import com.laura.composeui.utils.fontDimensionResource

private const val FIFTY = 50f

@Composable
fun PetCard(
    pet: Pet,
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = Spacing.Medium, vertical = Spacing.Small)
            .clip(RoundedCornerShape(Spacing.Medium))
            .border(
                width = dimensionResource(id = R.dimen.pets_border_width),
                color = Color.Black,
                shape = RoundedCornerShape(Spacing.Medium)
            )
            .padding(Spacing.Small)
    ) {
        AsyncImage(
            model = pet.image,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(dimensionResource(id = R.dimen.pets_image_size))
                .clip(RoundedCornerShape(Spacing.Medium))
        )

        Spacer(modifier = Modifier.padding(Spacing.Small))

        Column {
            Text(
                text = pet.name,
                fontSize = fontDimensionResource(id = R.dimen.pets_name_font_size)
            )

            Spacer(modifier = Modifier.padding(Spacing.ExtraSmall))

            Text(
                text = pet.species.name.uppercase(),
                fontSize = fontDimensionResource(id = R.dimen.pets_species_font_size),
                modifier = Modifier
                    .background(Color.Gray, RoundedCornerShape(FIFTY))
                    .padding(horizontal = Spacing.ExtraSmall, vertical = Spacing.Micro)
            )
        }

    }
}

@Preview
@Composable
private fun PetCardPreview() = ComposeUITheme {
    PetCard(pet = Pet("Miki", PetSpecies.CAT, ""))
}