package com.example.layoutandtheming

import android.os.Bundle
import android.text.Layout
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Canvas
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.layoutandtheming.ui.theme.LayoutAndThemingTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Greeting()
        }
    }
}


@Composable
fun Greeting() {
    Column() {
        Row(
            Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.Top
        ) {
            Android()
            Android()
            Android()
            Android()
            Android()
            Android()
        }
        Row(
            Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.Top
        ) {
            Android()
            Android()
            Android()
            Android()
            Android()
            Android()
        }
        Row(
            Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.End,
            verticalAlignment = Alignment.Top
        ) {
            Android()
            Android()
            Android()
            Android()
            Android()
            Android()
        }
    }

}

@Composable
fun Android() {
    Image(
        contentDescription = null,
        painter = painterResource(id = R.drawable.ic_launcher_foreground),
        modifier = Modifier.size(40.dp)
    )
}

@Composable
fun Layouts() {

    Column() {
        LazyRow() {
            items(30) { android ->
                Android()
            }
        }

        Spacer(Modifier.padding(20.dp))

        LazyColumn(Modifier.height(200.dp)) {
            items(30) { android ->
                Android()
            }
        }

        Spacer(Modifier.padding(20.dp))


        LazyHorizontalGrid(GridCells.Fixed(2),
            Modifier.height(100.dp)) {
            items(30) { item ->
                Android()
            }

        }
        Spacer(Modifier.padding(20.dp))

        LazyVerticalGrid(GridCells.Fixed(3),

            Modifier.height(100.dp)
        ) {
            items(50){
                item -> Android()
            }
        }

    }

}

@Preview
@Composable
private fun LayoutPreview() {
    Layouts()
}

// Color and Typography Practice
@Composable
fun Typography() {
    Row() {
        Column() {
            Text(
                text = "Large",
                style = MaterialTheme.typography.displayLarge,
                color = MaterialTheme.colorScheme.primary
            )
            Text(
                text = "Medium",
                style = MaterialTheme.typography.displayMedium,
                color = MaterialTheme.colorScheme.secondary
            )
            Text(
                text = "Small",
                style = MaterialTheme.typography.displaySmall,
                color = MaterialTheme.colorScheme.tertiary
            )
            Text(
                text = "Large",
                style = MaterialTheme.typography.headlineLarge,
                color = MaterialTheme.colorScheme.primary
            )
            Text(
                text = "Medium",
                style = MaterialTheme.typography.headlineLarge,
                color = MaterialTheme.colorScheme.secondary
            )
            Text(
                text = "Small",
                style = MaterialTheme.typography.headlineSmall,
                color = MaterialTheme.colorScheme.tertiary
            )
        }

        Spacer(Modifier.padding(20.dp))

        Column() {
            Text(
                text = "Large",
                style = MaterialTheme.typography.bodyLarge,
                color = MaterialTheme.colorScheme.primary
            )
            Text(
                text = "Medium",
                style = MaterialTheme.typography.bodyMedium,
                color = MaterialTheme.colorScheme.secondary
            )
            Text(
                text = "Small",
                style = MaterialTheme.typography.bodySmall,
                color = MaterialTheme.colorScheme.tertiary
            )
            Text(
                text = "Large",
                style = MaterialTheme.typography.labelLarge,
                color = MaterialTheme.colorScheme.primary
            )
            Text(
                text = "Medium",
                style = MaterialTheme.typography.labelMedium,
                color = MaterialTheme.colorScheme.secondary
            )
            Text(
                text = "Small",
                style = MaterialTheme.typography.labelSmall,
                color = MaterialTheme.colorScheme.tertiary
            )
        }
    }
}

@Composable
fun RoundedShapes() {
    Column() {
        Row(
            Modifier
                .fillMaxWidth()
                .background(
                    MaterialTheme.colorScheme.primary,
                    MaterialTheme.shapes.small
                )
                .height(60.dp)
        ) {}
        Spacer(Modifier.padding(10.dp))
        Row(
            Modifier
                .fillMaxWidth()
                .background(
                    MaterialTheme.colorScheme.primary,
                    MaterialTheme.shapes.medium
                )
                .height(60.dp)
        ) {}
        Spacer(Modifier.padding(10.dp))
        Row(
            Modifier
                .fillMaxWidth()
                .background(
                    MaterialTheme.colorScheme.primary,
                    MaterialTheme.shapes.large
                )
                .height(60.dp)
        ) {}
        Spacer(Modifier.padding(10.dp))
        Row(
            Modifier
                .fillMaxWidth()
                .background(
                    MaterialTheme.colorScheme.primary,
                    MaterialTheme.shapes.extraLarge
                )
                .height(60.dp)
        ) {}
        Spacer(Modifier.padding(10.dp))
        Row(
            Modifier
                .fillMaxWidth()
                .background(
                    MaterialTheme.colorScheme.primary,
                    MaterialTheme.shapes.extraSmall
                )
                .height(60.dp)
        ) {}
        Spacer(Modifier.padding(10.dp))
        Row(
            Modifier
                .fillMaxWidth()
                .background(
                    MaterialTheme.colorScheme.primary,
                    CircleShape
                )
                .height(60.dp)
        ) {}

    }

}

@Preview
@Composable
private fun RoundedShapePreview() {
    RoundedShapes()
}

@Preview
@Composable
private fun TypographyPreview() {
    Typography()
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Greeting()
}

@Composable
fun Styling(modifier: Modifier = Modifier) {
    Column() {
        Text(
            text = "Styling the font in compose",
            style = MaterialTheme.typography.displayMedium,
            color = MaterialTheme.colorScheme.primary,
            fontFamily = FontFamily.Monospace
        )

        androidx.compose.foundation.Canvas(Modifier.fillMaxSize()) {
            drawCircle(Color.Blue, radius = 100.dp.toPx())
            drawRect(Color.Magenta, size = size/3f)
            drawOval(Color.Cyan, size = size/4f)
        }
    }
}

@Preview
@Composable
private fun StylingPreview() {
    Styling()
    
}

