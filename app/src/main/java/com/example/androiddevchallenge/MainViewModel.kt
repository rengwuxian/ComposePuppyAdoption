package com.example.androiddevchallenge

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.androiddevchallenge.data.Dog

class MainViewModel : ViewModel() {
  val dogs by mutableStateOf(
    listOf(
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
      ),
      Dog(
        "Arnie", "Chihuahua Mix", "Mountain View, CA",
        "Young", "Male", "Small", R.drawable.img_puppy_arnie
      ),
      Dog(
        "Doby", "Mountain Dog & Shepherd Mix", "Sunnyvale, CA",
        "Puppy", "Female", "Medium", R.drawable.img_puppy_doby
      ),
      Dog(
        "Bowen", "Mountain Dog & Shepherd Mix", "Sunnyvale, CA",
        "Puppy", "Male", "Medium", R.drawable.img_puppy_bowen
      ),
      Dog(
        "Rumi", "Border Collie & German Shepherd Dog Mix", "Los Altos, CA",
        "Young", "Male", "Medium", R.drawable.img_puppy_rumi
      ),
      Dog(
        "Mikey", "Chihuahua & Rat Terrier Mix", "Santa Clara, CA",
        "Young", "Male", "Medium", R.drawable.img_puppy_mikey
      ),
      Dog(
        "Layla", "Chihuahua & Terrier Mix", "Santa Clara, CA",
        "Young", "Female", "Medium", R.drawable.img_puppy_layla
      ),
      Dog(
        "Tessie", "Pit Bull Terrier Mix", "Santa Clara, CA",
        "Adult", "Female", "Large", R.drawable.img_puppy_tessie
      ),
      Dog(
        "Sia", "Pit Bull Terrier", "Santa Clara, CA",
        "Young", "Female", "Medium", R.drawable.img_puppy_sia
      ),
    )
  )

  var currentDog: Dog? by mutableStateOf(null)

  fun showDog(dog: Dog) {
    currentDog = dog
  }

  fun closeDog() {
    currentDog = null
  }
}