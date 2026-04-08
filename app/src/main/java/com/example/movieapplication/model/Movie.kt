package com.example.movieapplication.model

data class Movie(
    val id: String,
    val title: String,
    val year: String,
    val rating: Double,
    val votes: Int,
    val posterPath: String,
    val genres: List<Genre>
)