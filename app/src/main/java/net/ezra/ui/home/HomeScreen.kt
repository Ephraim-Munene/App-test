package net.ezra.ui.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.R
import net.ezra.navigation.ROUTE_ABOUT
import net.ezra.navigation.ROUTE_HOME
import net.ezra.navigation.ROUTE_SERVICES
import net.ezra.navigation.ROUTE_CONTACT
import net.ezra.navigation.ROUTE_EVENING
import net.ezra.navigation.ROUTE_PRODUCTS
import net.ezra.navigation.ROUTE_SHOP
import net.ezra.navigation.ROUTE_ADD_STUDENTS
import net.ezra.navigation.ROUTE_STUDENTS

@Composable
fun HomeScreen(navController: NavHostController) {

    LazyColumn (
        modifier = Modifier
            .fillMaxSize()
    ){
        item {


            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .padding(10.dp)
                    .padding(top = 10.dp)

            ){

                Text(text = "LEARN", fontSize = 35.sp)
                Text(text = "CODING", fontWeight = FontWeight.Bold,color = Color.Black, fontSize = 60.sp)
                LazyRow {
                    item {
                        OutlinedButton(onClick = {

                            navController.navigate(ROUTE_EVENING) {
                                popUpTo(ROUTE_HOME) { inclusive = true }
                            }

                        }) {

                            Text(text = "UI/UX Design")

                        }

                        Spacer(modifier = Modifier.width(5.dp))

                        OutlinedButton(onClick = {

                            navController.navigate(ROUTE_ADD_STUDENTS) {
                                popUpTo(ROUTE_HOME) { inclusive = true }
                            }

                        }) {

                            Text(text = "Python")

                        }

                        Spacer(modifier = Modifier.width(5.dp))

                        OutlinedButton(onClick = {

                            navController.navigate(ROUTE_ADD_STUDENTS) {
                                popUpTo(ROUTE_HOME) { inclusive = true }
                            }

                        }) {

                            Text(text = "Java")

                        }

                        Spacer(modifier = Modifier.width(5.dp))

                        OutlinedButton(onClick = {

                            navController.navigate(ROUTE_ADD_STUDENTS) {
                                popUpTo(ROUTE_HOME) { inclusive = true }
                            }

                        }) {

                            Text(text = "Html")

                        }







                    }



                }
                Card (
                    modifier = Modifier
                        .padding(3.dp)
//                    horizontalArrangement = Arrangement.SpaceEvenly
                ){

                        Image(painter = painterResource(id = R.drawable.imge),
                            contentDescription = "",
                            modifier = Modifier
                                .fillMaxWidth(),

                            contentScale = ContentScale.Fit


                            )
                    Row {
                        Column {
                            Text(text = "User Experience Design")
                            Text(text = "Fundamentals")
                        }
                        OutlinedButton(onClick = {

                            navController.navigate(ROUTE_ADD_STUDENTS) {
                                popUpTo(ROUTE_HOME) { inclusive = true }
                            }

                        }) {

                            Text(text = "U")

                        }
                    }


                        Text(text = "the best course to be able to come up with good designs")




                }

                    Spacer(modifier = Modifier.height(10.dp))

                Card (
                ){


                        Image(painter = painterResource(id = R.drawable.imge),
                            contentDescription = "",
                            modifier = Modifier
                                .fillMaxWidth(),

                            contentScale = ContentScale.Fit


                        )

                    Row {
                        Column {
                            Text(text = "User Experience Design")
                            Text(text = "Fundamentals")
                        }
                        OutlinedButton(onClick = {

                            navController.navigate(ROUTE_ADD_STUDENTS) {
                                popUpTo(ROUTE_HOME) { inclusive = true }
                            }

                        }) {

                            Text(text = "Add Students")

                        }
                    }


                        Text(text = "the best course to be able to come up with good designs")





                }


                Card (
                ){


                    Image(painter = painterResource(id = R.drawable.imge),
                        contentDescription = "",
                        modifier = Modifier
                            .fillMaxWidth(),

                        contentScale = ContentScale.Fit


                    )

                    Row {
                        Column {
                            Text(text = "User Experience Design")
                            Text(text = "Fundamentals")
                        }
                        OutlinedButton(onClick = {

                            navController.navigate(ROUTE_ADD_STUDENTS) {
                                popUpTo(ROUTE_HOME) { inclusive = true }
                            }

                        }) {

                            Text(text = "Add Students")

                        }
                    }


                    Text(text = "the best course to be able to come up with good designs")





                }

                Card (
                ){


                    Image(painter = painterResource(id = R.drawable.html),
                        contentDescription = "",
                        modifier = Modifier
                            .fillMaxWidth(),

                        contentScale = ContentScale.Fit


                    )

                    Row {
                        Column {
                            Text(text = "User Experience Design")
                            Text(text = "Fundamentals")
                        }
                        OutlinedButton(onClick = {

                            navController.navigate(ROUTE_ADD_STUDENTS) {
                                popUpTo(ROUTE_HOME) { inclusive = true }
                            }

                        }) {

                            Text(text = "Add Students")

                        }
                    }


                    Text(text = "the best course to be able to come up with good designs")





                }










            }
        }
    }

}

@Preview(showBackground = true)
@Composable
fun PreviewLight() {
    HomeScreen(rememberNavController())
}

