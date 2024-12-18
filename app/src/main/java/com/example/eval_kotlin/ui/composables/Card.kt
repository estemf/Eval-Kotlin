package com.example.eval_kotlin.ui.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.eval_kotlin.R
import com.example.eval_kotlin.ui.theme.LightBlack

@Composable
fun Card (){
    Box(Modifier
        .width(300.dp)
        .background(colorResource(id = R.color.BlackGrey),
            shape = RoundedCornerShape(8.dp))
    ){
Row {
    Image(
        modifier = Modifier
            .size(120.dp)
            .clip(
                RoundedCornerShape(
                    topStart = 8.dp,
                    bottomStart = 8.dp
                )
                ),
        painter = painterResource(id = R.drawable.img),
        contentDescription = "Image",
    )
    Spacer(Modifier.size(2.dp))
    Column(Modifier //Description de la Card
        .padding(5.dp)) {
        // Titre
        Text(
            text = stringResource(id = R.string.Title),
            fontWeight = FontWeight.Bold,
            color = Color.White,
            fontSize = 19.sp)
        // Etat du personnage (en vie, mort, ou non connu) et race
        Row (){
            Box(Modifier
                .padding(3.dp)
                .size(6.dp)
                .background(color = Color.Green, shape = CircleShape),
            )
            Text(
                text = stringResource(id = R.string.State),
                color = Color.White,
                fontSize = 10.sp)
        }
        // Sous titre catégorie
        Spacer(Modifier.size(10.dp))
        Text(
            text = "Last Known location",
            color = colorResource(id = R.color.Grey),
            fontSize = 10.sp)
        // Dernier lieu connu
        Text(
            text = stringResource(id = R.string.Location),
            color = Color.White,
            fontSize = 10.sp)
        Spacer(Modifier.size(10.dp))
        // Sous titre catégorie
        Text(
            text = "First seen in:",
            color = colorResource(id = R.color.Grey),
            fontSize = 10.sp)
        // Première fois apparu
        Text(
            text = stringResource(id = R.string.Seen),
            color = Color.White,
            fontSize = 10.sp)
    }
    }

    }
}


@Preview
@Composable
fun CardPreview() {
    Card()
}