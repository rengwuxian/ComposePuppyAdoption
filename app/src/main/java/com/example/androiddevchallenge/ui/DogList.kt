/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.data.Dog
import com.example.androiddevchallenge.ui.theme.MyTheme

@Composable
fun DogList(dogs: List<Dog>, onDogClick: (Dog) -> Unit = {}) {
    LazyColumn(
        Modifier.background(MaterialTheme.colors.secondary),
        contentPadding = PaddingValues(8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(dogs) { dog ->
            DogItem(
                dog,
                Modifier.clickable {
                    onDogClick(dog)
                }.fillMaxWidth()
            )
        }
    }
}

@Composable
fun DogItem(dog: Dog, modifier: Modifier = Modifier) {
    Card(modifier) {
        Row {
            Image(
                painterResource(dog.picture),
                "Picture of dog: ${dog.name}",
                Modifier.size(120.dp),
                contentScale = ContentScale.Crop
            )
            Column(Modifier.padding(8.dp)) {
                Text(dog.name, style = MaterialTheme.typography.h4)
                Text(dog.breed)
                Text(dog.location)
            }
        }
    }
}

@Preview
@Composable
fun DogListPreview() {
    val dogs = listOf(
        Dog(
            "Nala", "Pit Bull Terrier Mix", "Sunnyvale, CA",
            "Adult", "Female", "Large", R.drawable.img_puppy_nala
        ),
        Dog(
            "Lulu", "Terrier Mix", "Sunnyvale, CA",
            "Young", "Female", "Medium", R.drawable.img_puppy_lulu
        ),
        Dog(
            "Billy", "American Staffordshire Terrier Mix", "Sunnyvale, CA",
            "Adult", "Male", "Large", R.drawable.img_puppy_billy
        )
    )
    MyTheme {
        DogList(dogs)
    }
}

@Preview
@Composable
fun DogListPreviewDark() {
    val dogs = listOf(
        Dog(
            "Nala", "Pit Bull Terrier Mix", "Sunnyvale, CA",
            "Adult", "Female", "Large", R.drawable.img_puppy_nala
        ),
        Dog(
            "Lulu", "Terrier Mix", "Sunnyvale, CA",
            "Young", "Female", "Medium", R.drawable.img_puppy_lulu
        ),
        Dog(
            "Billy", "American Staffordshire Terrier Mix", "Sunnyvale, CA",
            "Adult", "Male", "Large", R.drawable.img_puppy_billy
        )
    )
    MyTheme(darkTheme = true) {
        DogList(dogs)
    }
}

@Preview
@Composable
fun DogItemPreview() {
    MyTheme {
        DogItem(
            Dog(
                "Nala", "Pit Bull Terrier Mix", "Sunnyvale, CA",
                "Adult", "Female", "Large", R.drawable.img_puppy_nala
            )
        )
    }
}

@Preview
@Composable
fun DogItemPreviewDark() {
    MyTheme(darkTheme = true) {
        DogItem(
            Dog(
                "Nala", "Pit Bull Terrier Mix", "Sunnyvale, CA",
                "Adult", "Female", "Large", R.drawable.img_puppy_nala
            )
        )
    }
}
