package co.za.openwindow.singlepageapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import co.za.openwindow.singlepageapp.ui.theme.CustomColour1
import co.za.openwindow.singlepageapp.ui.theme.CustomColour2
import co.za.openwindow.singlepageapp.ui.theme.CustomColour3
import co.za.openwindow.singlepageapp.ui.theme.CustomColour4
import co.za.openwindow.singlepageapp.ui.theme.PageTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PageTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
//                    Greeting("Android")
                }
            }
        }
    }
}




@Composable
fun DetailsScreen(
    modifier: Modifier = Modifier,
){

    val bookmarkIcon = painterResource(R.drawable.bookmark)
    val planetImage = painterResource(R.drawable.planet_earth_global)
    val dropImage = painterResource(R.drawable.drop)
    val techChip = painterResource(R.drawable.tech)

    Column( // <-- Parent Div
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .background(CustomColour1)
            .fillMaxSize()
    ){
        Row(modifier = modifier.padding(10.dp)){
           Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "Back arrow Icon", tint = Color.White)
            Text("Back", color = Color.White)
            Spacer(modifier = modifier.width(260.dp))
            Box(
                contentAlignment = Alignment.Center,
                modifier = modifier
                    .background(CustomColour2, shape = RoundedCornerShape(50))
                    .height(40.dp)
                    .width(40.dp)
            ){
                Image(painter = bookmarkIcon, contentDescription = "Bookmark Icon")
            }
        } //<-- Top back button and Bookmark icon section

        Image(painter = planetImage, contentDescription = "Earth Image")

        Column(modifier = modifier.padding(10.dp)) {
            Row(){
                Text("Planet", color = Color.White)
                Spacer(modifier = modifier.width(240.dp))
                Column(horizontalAlignment = Alignment.End) {
                    Row(){
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Star Rating Icon", tint = CustomColour2)
                        Text("4.8", color = Color.White)
                    }
                    Text("8 bilion reviews", color = Color.Gray, fontSize = 10.sp)
                }
            } //<-- top rating and planet section
            Text("THE EARTH", color = Color.White, fontWeight = FontWeight.Bold, fontSize = 35.sp)
            Spacer(modifier = modifier.height(15.dp))
            Text(
                "Nestled in the vastness of space. Earth is the third planet from the Sun and the " +
                        "only known celestial body to harbour life (so far). With its diverse ecosystems, ranging " +
                        "from lush forests to expansive deserts, and its vast oceans teeming with life, Earth is a " +
                        "vibrant oasis in the cosmos. Its atmosphere provides the perfect conditions for a rich " +
                        "tapestry of flora and fauna, making it a haven for countless species, including humans. " +
                        "From the highest peaks to the deepest ocean trenches, Earth's beauty and biodiversity " +
                        "inspire awe and reverence, earning it the nickname ''The Blue Jewel'' of the solar system.",
                color = Color.White,
                lineHeight = 15.sp,
                fontSize = 12.sp)
            Spacer(modifier = modifier.height(15.dp))
            Row(){
                DetailTile(iconImage = dropImage, percentValue = "71%", valueInfo = "TH2O Surface Coverage") //<-- details Tile
                Spacer(modifier =modifier.width(15.dp))
                DetailTile(iconImage = techChip, percentValue = "12%", valueInfo = "Technology Advancement")//<-- details Tile
            }
            Spacer(modifier = modifier.height(15.dp))
            Box(
                modifier = modifier
                    .background(CustomColour3, RoundedCornerShape(12.dp))
                    .width(365.dp)
                    .padding(10.dp)
            ){
                Row(){
                    Column(){
                        Text("FACTS ABOUT EARTH", color = Color.White, fontSize = 20.sp, fontWeight = FontWeight.Bold)
                        Text("3 Videos available", color = Color.White, fontSize = 10.sp)
                    }
                    Spacer(modifier = modifier.width(40.dp))
                    Button(onClick = { /*TODO*/ }, colors= ButtonDefaults.buttonColors(CustomColour4)){
                        Text("Watch")
                    }
                }
            }//<-- bottom Tile
        }//<-- Info text and details section

    }// <-- Parent Div
}

@Preview(showBackground = true)
@Composable
fun DetailsScreenPreview(){
    PageTheme{
        DetailsScreen()
    }
}

@Composable
fun DetailTile(
    iconImage: Painter,
    percentValue: String,
    valueInfo: String,
    modifier: Modifier = Modifier,
){

    Box(
        modifier = modifier
            .background(CustomColour3, RoundedCornerShape(12.dp))
            .padding(10.dp)
    ){
        Row(){
            Column(){
                Text(text=percentValue, color = Color.White, fontSize = 25.sp, fontWeight = FontWeight.Bold)
                Text(text=valueInfo, color = Color.White, fontSize = 10.sp)
            }
            Image(painter = iconImage, contentDescription = "Details image", modifier = modifier.size(35.dp))

        }
    }//<-- detail Tile
}



