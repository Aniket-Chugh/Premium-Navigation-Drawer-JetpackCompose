package com.example.prodrawer

import androidx.annotation.DrawableRes

sealed class Screen(
    val title : String,
    val route : String,
){
    sealed class DrawerItems(val dtitle : String , val droute : String , @DrawableRes val icon : Int) : Screen(dtitle , droute){
        object Home : DrawerItems(
            "Home",
            "home",
            R.drawable.ic_home
        )

        object TransActions : DrawerItems(
            "Transactions",
            "transactions",
            R.drawable.ic_transactions
        )


        object Advance : DrawerItems(
            "Advance ",
            "advance",

            R.drawable.ic_wallet        )

object Expense : DrawerItems(
    "Expense",
    "expense",
    R.drawable.ic_expense
)

        object SeasonVehicle : DrawerItems(
            "Season Vehicle",
            "SeasonVehicle",
            R.drawable.ic_vehicle
        )

        object CropBuyer : DrawerItems(
            "Crop Buyer",
            "CropBuyer",
            R.drawable.ic_crop
        )


        object Village : DrawerItems(
            "Village ",
            "Village",

            R.drawable.ic_village     )

        object OwnervsAgent : DrawerItems(
            "Owner vs Agent",
            "OwnervsAgent",
            R.drawable.ic_owner
        )

        object Share : DrawerItems(
            "Share",
            "Share",
            R.drawable.ic_share
        )

object Help : DrawerItems(
    "Help",
    "Help",
    R.drawable.ic_help
)

    }




}


val DrawerList = listOf(
    Screen.DrawerItems.Home,
    Screen.DrawerItems.TransActions,
    Screen.DrawerItems.Advance,
    Screen.DrawerItems.Expense,
    Screen.DrawerItems.SeasonVehicle,
    Screen.DrawerItems.CropBuyer,
    Screen.DrawerItems.Village,
    Screen.DrawerItems.OwnervsAgent,
    Screen.DrawerItems.Share,
    Screen.DrawerItems.Help

)



