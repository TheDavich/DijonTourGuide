# 🗺️ Dijon Tour Guide App

## 📖 Overview

The Dijon Tour Guide App is your travel companion for exploring the beautiful city of Dijon, France. Discover coffee shops ☕, kid-friendly zones 🧒, parks 🌳, shopping centers 🛍️, and restaurants 🍽️ with ease. This app is built using modern Android app development practices, including the MVVM architecture, Compose UI framework, and Navigation component.

## 🧱 MVVM Architecture

The app follows the Model-View-ViewModel (MVVM) architecture:

### `DijonDataProvider`

```kotlin
class DijonDataProvider {
    fun getPlaces(placeType: PlaceType): List<Dijon> {
        // Implement the logic to fetch places based on placeType
        // Return a list of Dijon objects representing the places
        // ...
    }
}
```
The DijonDataProvider class provides data for different place types, such as coffee shops, restaurants, parks, etc.

### `UI Components`

The user interface is built using Jetpack Compose and includes components like PlaceCard, PlaceImage, PlaceText, and BottomNavigationBar.

### `DijonViewModel`
```kotlin
class DijonViewModel : ViewModel() {
    // ViewModel code...
}
```
The DijonViewModel class manages UI data, communicates with DijonDataProvider, and handles navigation.

### `Bottom Navigation`
The app features a bottom navigation bar that allows users to switch between different place types.

## 🚀 Getting Started
To run the app locally, follow these steps:

1. Clone this repository.
2. Open the project in Android Studio.
3. Build and run the app on an Android emulator or device.

## 📷 Screenshots
<img width="372" alt="Снимок экрана 2023-09-19 в 13 43 42" src="https://github.com/TheDavich/DijonTourGuide/assets/87846576/ea66f729-4447-47bc-a677-b20461540fd4">

<img width="378" alt="Снимок экрана 2023-09-19 в 13 44 07" src="https://github.com/TheDavich/DijonTourGuide/assets/87846576/68a497ea-95a9-44a8-b839-21fd53079ac8">

<img width="373" alt="Снимок экрана 2023-09-19 в 13 44 26" src="https://github.com/TheDavich/DijonTourGuide/assets/87846576/b54db9fb-b10e-4d86-9fe0-59a1b032e718">

<img width="374" alt="Снимок экрана 2023-09-19 в 13 44 44" src="https://github.com/TheDavich/DijonTourGuide/assets/87846576/76a8f0ef-be69-423b-bf73-c09d651cdf42">

<img width="370" alt="Снимок экрана 2023-09-19 в 13 45 00" src="https://github.com/TheDavich/DijonTourGuide/assets/87846576/e8c90dac-5f01-41c9-a611-80ca40b11f17">
