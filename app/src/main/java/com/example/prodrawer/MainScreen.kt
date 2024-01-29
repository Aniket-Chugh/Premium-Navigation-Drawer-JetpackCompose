package com.example.prodrawer

// Make screens ui by yourself


import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.List
import androidx.compose.material.rememberScaffoldState
import androidx.compose.material3.DrawerState
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.SnackbarDefaults.backgroundColor
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.prodrawer.components.ButtonComponent
import com.example.prodrawer.components.DividerComponent
import com.example.prodrawer.components.DrawerTextIcon
import com.example.prodrawer.components.HeadingComposable
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(){



    val scaffoldState = rememberScaffoldState()
    val scope = rememberCoroutineScope()

    val viewModel : LiveViewModel = viewModel()

    val controller : NavController = rememberNavController()
    val navBackStackEntry by controller.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route


    val currentScreen = remember {
        viewModel.currentScreen.value
    }


    var title = remember {
        viewModel.currentScreen.value.title
    }

    Scaffold (
        topBar = {
            TopAppBar(title = {
                HeadingComposable(text = "Pro Drawer" , fontSize = 30 , color = Color.White)
              },
                modifier = Modifier,
                navigationIcon = {
                    Icon(
                        Icons.AutoMirrored.Filled.List,
                        contentDescription = null,
                        modifier = Modifier
                            .padding(8.dp)
                            .clickable {
                                scope.launch {
                                    scaffoldState.drawerState.open()
                                }
                            },
                        tint = colorResource(id = R.color.white)
                    )
                } ,
                colors = TopAppBarDefaults.mediumTopAppBarColors(colorResource(id = R.color.green))

                )
        },

        scaffoldState = scaffoldState,

        drawerContent = {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.Green)
                    .size(160.dp)
            ) {



                Column(
    modifier = Modifier.padding(top = 30.dp)
) {


                    HeadingComposable(text = "Pro Drawer" , fontSize = 26 , Color.Black)

                    ButtonComponent()

}


            }


            LazyColumn(){
           items(DrawerList){ item ->

               DrawerTextIcon(
                   selected = currentRoute == item.droute,
                   item = item,
                   onDrawerClickedEvent = {
                       scope.launch {
                           scaffoldState.drawerState.close()
                       }
                       controller.navigate(item.droute)
                       title = item.dtitle

                   }
               )
if (item.droute == "expense" || item.droute == "OwnervsAgent"){
    DividerComponent()
}

           }

            }


        }



    )

    {
        Column(
            modifier = Modifier.padding(it)
        ) {
            Navigation(controller , viewModel , it)
        }
    }
}

@Composable
fun Navigation(
    navController: NavController,
    viewModel : ViewModel,
    pd : PaddingValues
){
    NavHost(navController = navController as NavHostController, startDestination = Screen.DrawerItems.Home.route ,
        modifier = Modifier.padding(pd)
    ){

        composable(Screen.DrawerItems.Home.route){
            //TODO
              }

        composable(Screen.DrawerItems.TransActions.route){
            Transactions()

        }

        composable(Screen.DrawerItems.Advance.route){
            //TODO
        }
        composable(Screen.DrawerItems.Expense.route){
            //TODO
        }
        composable(Screen.DrawerItems.SeasonVehicle.route){
            //TODO

        }
        composable(Screen.DrawerItems.CropBuyer.route){
            //TODO

        }
        composable(Screen.DrawerItems.Village.route){
//TODO

        }
        composable(Screen.DrawerItems.OwnervsAgent.route){
//TODO

        }

        composable(Screen.DrawerItems.Share.route){
//TODO

        }

        composable(Screen.DrawerItems.Help.route){
//TODO
        }




    }
}

