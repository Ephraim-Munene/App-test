package net.ezra.ui.python

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Card
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.navigation.ROUTE_ABOUT
import net.ezra.navigation.ROUTE_ADD_STUDENTS
import net.ezra.navigation.ROUTE_HOME
import net.ezra.navigation.ROUTE_PYTHON


@Composable
fun PythonScreen(navController: NavHostController) {

        LazyColumn {
            item {

                Column {
                    Card {
                        Row {
                            Image(imageVector = Icons.Default.Favorite, contentDescription = "")

                            OutlinedButton(onClick = {

                                navController.navigate(ROUTE_ADD_STUDENTS) {
                                    popUpTo(ROUTE_PYTHON) { inclusive = true }
                                }

                            }) {

                                Text(text = "Java")

                            }
                        }
                    }

                    Spacer(modifier = Modifier.height(10.dp))


                    Card {
                        Row {
                            Image(imageVector = Icons.Default.Favorite, contentDescription = "")

                            OutlinedButton(onClick = {

                                navController.navigate(ROUTE_ADD_STUDENTS) {
                                    popUpTo(ROUTE_PYTHON) { inclusive = true }
                                }

                            }) {

                                Text(text = "Java")

                            }
                        }
                    }

                    Spacer(modifier = Modifier.height(10.dp))


                    Card {
                        Row {
                            Image(imageVector = Icons.Default.Favorite, contentDescription = "")

                            OutlinedButton(onClick = {

                                navController.navigate(ROUTE_ADD_STUDENTS) {
                                    popUpTo(ROUTE_PYTHON) { inclusive = true }
                                }

                            }) {

                                Text(text = "Java")

                            }
                        }
                    }

                    Spacer(modifier = Modifier.height(10.dp))
































                }




            }
        }




}

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun HomeScreenPreviewLight() {
    PythonScreen(rememberNavController())
}

