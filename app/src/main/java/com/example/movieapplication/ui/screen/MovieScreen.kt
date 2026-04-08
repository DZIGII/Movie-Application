package com.example.movieapplication.ui.screen

import android.icu.text.CaseMap
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.movieapplication.R
import com.example.movieapplication.model.Genre
import com.example.movieapplication.model.MovieDetail


@Composable
fun MovieScreen() {

    val movieDetail = MovieDetail(
        imdbId = "tt0111161",
        tmdbId = 278,
        title = "The Shawshank Redemption",
        originalTitle = "The Shawshank Redemption",
        overview = "Imprisoned in the 1940s for the double murder of his wife and her lover, upstanding banker Andy Dufresne begins a new life at the Shawshank prison, where he puts his accounting skills to work for an amoral warden. During his long stretch in prison, Dufresne comes to be admired by the other inmates -- including an older prisoner named Red -- for his integrity and unquenchable sense of hope.",
        tagline = "Fear can hold you prisoner. Hope can set you free.",
        releaseDate = "1994-09-23",
        year = 1994,
        runtime = 142,
        budget = 25000000,
        revenue = 28341469,
        languageCode = "en",
        popularity = 42.1605f,
        imdbRating = 9.3f,
        imdbVotes = 3171582,
        tmdbRating = 8.717f,
        tmdbVotes = 29992,
        posterPath = "/9cqNxx0GxF0bflZmeSMuL5tnGzr.jpg",
        backdropPath = "/zfbjgQE1uSd9wiPTX4VzsLi0rGG.jpg",
        homepage = "",
        genres = listOf(
            Genre(id = 18, genre = "Drama"),
            Genre(id = 80, genre = "Crime")
        )
    )

    Scaffold (
        containerColor = Color(0xFF121212)
    ) { padding ->

        Column(
            modifier = Modifier.padding(padding)
        ) {

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
            ) {

                Image(
                    painter = painterResource(id = R.drawable.godfather),
                    contentDescription = null,
                    modifier = Modifier.fillMaxSize(),
                    contentScale = ContentScale.Crop
                )

                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight(0.4f)
                        .align(Alignment.BottomCenter)
                        .background(
                            Brush.verticalGradient(
                                colors = listOf(
                                    Color.Transparent,
                                    Color(0xFF121212)
                                )
                            )
                        )
                )

                Button(
                    onClick = {},
                    shape = RoundedCornerShape(1000.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.Red
                    ),
                    modifier = Modifier.align(Alignment.Center)
                ) {
                    Text("▶", color = Color.White)
                }

                Button(
                    onClick = {},
                    modifier = Modifier.align ( Alignment.TopStart),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color.Transparent
                    )
                ) {
                    Text(text = "<", color = Color.White)
                }
            }

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp)
            ) {

                Row(
                    horizontalArrangement = Arrangement.spacedBy(12.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {

                    Image(
                        painter = painterResource(id = R.drawable.movie),
                        contentDescription = null,
                        modifier = Modifier
                            .width(100.dp)
                            .clip(RoundedCornerShape(12.dp)),
                        contentScale = ContentScale.Crop
                    )

                    Column {

                        Text(
                            text = movieDetail.title,
                            color = Color.White,
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold
                        )

                        Text(
                            text = "${movieDetail.year} • ${movieDetail.runtime} min",
                            color = Color(0xFFCCCCCC),
                            fontSize = 16.sp,
                            modifier = Modifier.padding(top = 4.dp)
                        )
                    }
                }

            }

        }
    }

}