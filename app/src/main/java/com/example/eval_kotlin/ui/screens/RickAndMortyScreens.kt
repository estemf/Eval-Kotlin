package com.example.eval_kotlin.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.FlowRowScopeInstance.weight
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.eval_kotlin.R
import com.example.eval_kotlin.ui.composables.Card

// Ecran de l'API
@Composable
fun RickAndMortyScreens(){
    Column(modifier = Modifier
        .fillMaxSize()
        .background(color = colorResource(id = R.color.LightBlack))
    )
    {
        // Bandeau d'entete
        Box(Modifier
            .height(150.dp)
            .fillMaxSize()
            .background(color = Color.White),
                contentAlignment = Alignment.Center,
            ){
            Text(
                text = "The Rick and Morty API",
                fontWeight = FontWeight.Bold,
                color = colorResource(id = R.color.LightBlack),
                fontSize = 30.sp
            )
        }
        // Contenu avec les différent Card
        Spacer(Modifier.height(15.dp))
        Column(Modifier.padding(50.dp)) {
            Card()
            Spacer(Modifier.height(15.dp))
            Card()
            Spacer(Modifier.height(15.dp))
            Card()
            Spacer(Modifier.height(15.dp))
            Card()
            Spacer(Modifier.height(15.dp))
        }




    }
}

@Preview
@Composable
fun RickAndMortyScreensPreview() {
    RickAndMortyScreens()
}