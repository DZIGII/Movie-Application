package com.example.movieapplication.ui.screen.main


import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.foundation.lazy.items
import com.example.movieapplication.model.Genre
import com.example.movieapplication.model.Movie
import com.example.movieapplication.ui.components.MovieListItem

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen() {
    val movies = listOf(
        Movie(
            id = "tt0111161",
            title = "The Shawshank Redemption",
            year = "1994",
            rating = 9.3,
            votes = 3171582,
            posterPath = "/9cqNxx0GxF0bflZmeSMuL5tnGzr.jpg",
            genres = listOf(
                Genre(1,"Drama"),
                Genre(2, "Crime")
            )
        ),
        Movie(
            id = "tt0068646",
            title = "The Godfather",
            year = "1972",
            rating = 9.2,
            votes = 2215919,
            posterPath = "/3bhkrj58Vtu7enYsRolD1fZdja1.jpg",
            genres = listOf(
                Genre(2,"Drama"),
                Genre(1,"Crime")
            )
        ),
        Movie(
            id = "tt0468569",
            title = "The Dark Knight",
            year = "2008",
            rating = 9.1,
            votes = 3150267,
            posterPath = "/qJ2tW6WMUDux911r6m7haRef0WH.jpg",
            genres = listOf(
                Genre(3,"Action"),
                Genre( 4,"Thriller"),
                Genre(1,"Crime")
            )
        ),
        Movie(
            id = "tt0050083",
            title = "12 Angry Men",
            year = "1957",
            rating = 9.0,
            votes = 978730,
            posterPath = "/2QXLVh32JKaWTjFJU3n8aIxRK9P.jpg",
            genres = listOf(
                Genre(2,"Drama")
            )
        ),
        Movie(
            id = "tt0071562",
            title = "The Godfather Part II",
            year = "1974",
            rating = 9.0,
            votes = 1488902,
            posterPath = "/hek3koDUyRQk7FIhPXsa6mT2Zc3.jpg",
            genres = listOf(
                Genre(1, "Drama"),
                Genre(2, "Crime")
            )
        )
    )

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Movies") }
            )
        }
    ) { padding ->

        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
        ) {
            items(movies) { movie ->
                MovieListItem(movie)
            }
        }
    }

}