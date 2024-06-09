package co.za.openwindow.refproject

import android.os.Bundle
import android.text.style.ForegroundColorSpan
import android.widget.ScrollView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import co.za.openwindow.refproject.ui.theme.CustomColour1
import co.za.openwindow.refproject.ui.theme.CustomColour2
import co.za.openwindow.refproject.ui.theme.CustomColour3
import co.za.openwindow.refproject.ui.theme.CustomColour4
import co.za.openwindow.refproject.ui.theme.PageTheme

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
                    // New Composable goes here
                }
            }
        }
    }
}






@Composable
fun HomeScreen(
    modifier: Modifier = Modifier, // allows us to simply call "modifier" instead of defining the type and case everytime.
){

    val earthImg = painterResource(R.drawable.earth_img)
    val dropIcon = painterResource(R.drawable.drop)
    val techIcon = painterResource(R.drawable.tech)
    val bookMark = painterResource(R.drawable.bookmark)

    Column( //Parent Div (Vertical... Row would be Horizontal)
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
//            .background(Color.Red)
            .background(CustomColour1)
            .fillMaxSize()
    ){
        Row (modifier = modifier.padding(15.dp)) {
            Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "back button icon", tint = Color.White) //<-- back button icon
            Text(
                text = "Back",
                color = Color.White
            )
            Spacer(modifier = modifier.width(260.dp))
            Box(
                contentAlignment = Alignment.Center,
                modifier = modifier
                    .background(CustomColour2, shape = RoundedCornerShape(50))
                    .height(40.dp)
                    .width(40.dp)
                    .padding(1.dp)
            ){
                Image(painter = bookMark, contentDescription = "bookmark icon")
            }
        } // <-- Back + Bookmark Icon

        Spacer(modifier = modifier.height(20.dp))

        Image(painter = earthImg, contentDescription = "Planet Image") //<-- Planet Image

        Column(modifier = modifier.padding(10.dp)) {
            Row(){
                Text("Planet", color = Color.White)
                Spacer(modifier = modifier.width(240.dp))
                Column(horizontalAlignment = Alignment.End){
                    Row(){
                        Icon(imageVector = Icons.Default.Star, contentDescription = "Star Icon", tint = CustomColour2)
                        Text("4.8", color = Color.White)
                    }
                    Text("8 billion reviews", color = Color.Gray, fontSize = 10.sp)
                } // <-- Rating Column
            } // <-- Name and rating row

            Text("THE EARTH", color = Color.White, fontWeight = FontWeight.Bold, fontSize = 35.sp )

            Text("Nestled in the vastness of space. Earth is the third planet from the Sun and the " +
                    "only known celestial body to harbour life (so far). With its diverse ecosystems, ranging " +
                    "from lush forests to expansive deserts, and its vast oceans teeming with life, Earth is a " +
                    "vibrant oasis in the cosmos. Its atmosphere provides the perfect conditions for a rich " +
                    "tapestry of flora and fauna, making it a haven for countless species, including humans. " +
                    "From the highest peaks to the deepest ocean trenches, Earth's beauty and biodiversity " +
                    "inspire awe and reverence, earning it the nickname ''The Blue Jewel'' of the solar system.",
                color = Color.White,
                lineHeight = 15.sp,
                fontSize = 12.sp)
            Spacer(modifier = modifier.height(10.dp))
            Row(){
                Box(modifier = modifier
                    .background(CustomColour3, RoundedCornerShape(12.dp))
                    .padding(10.dp)
                    .width(160.dp)){
                    Row(verticalAlignment = Alignment.CenterVertically){
                        Column(){
                            Text("71%", color = Color.White, fontSize = 25.sp, fontWeight = FontWeight.Bold)
                            Text("H2O Surface Coverage", color = Color.White, fontSize = 10.sp)
                        }
                        Image(painter = dropIcon, contentDescription = "droplet", modifier = modifier.size(35.dp))
                    }
                } //<-- Info box
                Spacer(modifier = modifier.width(10.dp))
                Box(modifier = modifier
                    .background(CustomColour3, RoundedCornerShape(12.dp))
                    .padding(10.dp)
                    .width(160.dp)){
                    Row(verticalAlignment = Alignment.CenterVertically){
                        Column(){
                            Text("12%", color = Color.White, fontSize = 25.sp, fontWeight = FontWeight.Bold)
                            Text("Technology Advancement", color = Color.White, fontSize = 10.sp)
                        }
                        Image(painter = techIcon, contentDescription = "droplet", modifier = modifier.size(40.dp))
                    }
                } //<-- Info box
            } //<-- Two card row
            Spacer(modifier = modifier.height(10.dp))
            Box(modifier = modifier
                .background(CustomColour3, RoundedCornerShape(12.dp))
                .padding(10.dp)
                .width(350.dp)){
                Row(verticalAlignment = Alignment.CenterVertically){
                    Column(){
                        Text("FACTS ABOUT EARTH", color = Color.White, fontSize = 20.sp, fontWeight = FontWeight.Bold)
                        Text("3 videos available", color = Color.White, fontSize = 10.sp)
                    }
                    Spacer(modifier = modifier.width(50.dp))
                    Button(onClick = { /*TODO*/ }, colors = ButtonDefaults.buttonColors(CustomColour4)) {
                        Text("Watch")
                    }

                }
            } //<-- Info box
        } //<-- Planet Info Section


    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview(){
    PageTheme{
        HomeScreen()
    }
}
