package com.example.androiddevchallenge.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.ProvideTextStyle
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.data.Dog

@Composable
fun DogDetails(dog: Dog, onAdopt: (Dog) -> Unit = {}) {
  Column(
    Modifier
      .fillMaxSize()
      .background(MaterialTheme.colors.secondary)
  ) {
    Box {
      Image(
        painterResource(dog.picture),
        "Dog picture: ${dog.name}",
        Modifier.aspectRatio(1f),
        contentScale = ContentScale.Crop
      )
      Button(
        { onAdopt(dog) },
        Modifier
          .align(Alignment.BottomEnd)
          .padding(16.dp)
      ) {
        Text(text = "Adopt")
      }
    }
    Column(Modifier.padding(16.dp, 8.dp)) {
      Text("Name: ${dog.name}", style = MaterialTheme.typography.h3)
      ProvideTextStyle(MaterialTheme.typography.h5) {
        Text("Breed: ${dog.breed}")
        Text("Location: ${dog.location}")
        Text("Age: ${dog.age}")
        Text("Gender: ${dog.gender}")
        Text("Size: ${dog.size}")
      }
    }
  }
}

@Preview
@Composable
fun DogDetailsPreview() {
  DogDetails(
    Dog(
      "Nala", "Pit Bull Terrier Mix", "Sunnyvale, CA",
      "Adult", "Female", "Large", R.drawable.img_puppy_nala
    )
  )
}