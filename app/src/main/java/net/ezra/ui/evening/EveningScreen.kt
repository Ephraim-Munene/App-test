package net.ezra.ui.evening

import android.os.Build.VERSION_CODES.R
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import net.ezra.R
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.navigation.ROUTE_ABOUT
import net.ezra.navigation.ROUTE_HOME
import net.ezra.navigation.ROUTE_SERVICES
import net.ezra.navigation.ROUTE_CONTACT
import net.ezra.navigation.ROUTE_EVENING
import net.ezra.navigation.ROUTE_PRODUCTS
import net.ezra.navigation.ROUTE_SHOP

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun EveningScreen(navController: NavHostController) {

    LazyColumn (
        modifier = Modifier
            .fillMaxSize()

    ){
        item {
            Box (
                modifier = Modifier
                    .fillMaxSize(),
            ){
//                Image(painter = painterResource(id = R.drawable.imge),
//                    contentDescription = "",
//                    modifier = Modifier
//                        .fillMaxSize(),
//                    contentScale = ContentScale.Crop
//
//
//                    )

                var logIn by rememberSaveable {
                    mutableStateOf("")
                }

                var signUp by rememberSaveable {
                    mutableStateOf("")
                }



                OutlinedTextField(
                    value = logIn,
                    onValueChange = { logIn = it },
                    label = { Text(text = "Name",color = Color.Black) },
                    modifier = Modifier
                        .padding(16.dp)
                        .fillMaxWidth(),
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        focusedBorderColor = Color.Black,
                        focusedLabelColor = Color.Black,
                        unfocusedBorderColor = Color.Cyan,
                        cursorColor = Color.Cyan,
                    )
                )

                OutlinedTextField(
                    value = signUp,
                    onValueChange = { signUp = it },
                    label = { Text(text = "Name",color = Color.Black) },
                    modifier = Modifier
                        .padding(16.dp)
                        .fillMaxWidth(),
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        focusedBorderColor = Color.Black,
                        focusedLabelColor = Color.Black,
                        unfocusedBorderColor = Color.Black,
                        cursorColor = Color.Cyan,
                    )
                )



                OutlinedButton(onClick = {

                    navController.navigate(ROUTE_HOME) {
                        popUpTo(ROUTE_EVENING) { inclusive = true }
                    }

                }) {

                    Text(text = "UI/UX Design")

                }
















            }
        }
    }



}

@Preview(showBackground = true)
@Composable
fun PreviewLight() {
    EveningScreen(rememberNavController())
}

