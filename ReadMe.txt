Game Of Thrones Houses App

This App fetches data about the Game Of Thrones houses in JSON format from a backend specified server given a URL,
processes the data and displays it in an user friendly and readable format for the user to view and work with.

API: https://anapioficeandfire.com

@GET houses : https://anapioficeandfire.com/houses/

*Project Overview*:

The App is made up of 3 screens/activities.

Welcome Activity:

In this activity, a welcome message is displayed for the user. In this activity also, a user is prompted to continue
forward and view the different Game of Thrones houses.

This Activity is made up of a screen with a welcome message displayed in a textview widget. The screen is also made up of an imageview widget which loads a
simple Game Of Thrones visual image to have the user have a feeling of being in the Game Of thrones ecosystem. This screen also
contains a button which when clicked, takes one to the MainActivity screen.

MainActivity:

In this Activity, the Game of Thrones houses are loaded into a list view of the form RecyclerView view by the help of a custom adapter called HousesAdapter
which also defines the functionality of displaying more information about a respective Game Of Thrones house once selected or clicking 
by the user in the list RecyclerView view.

modelView:
In the MainActivity, we load and define the User Interface views like the recyclerview to which the houses will be rendered using the custom HousesAdapter which we also initialize
in this activity. I also initialize an Instance of modelView class which helps in binding and rendering information to
the views. Here We take use of the modelFactory class and the repository instance

	configuration changes:
	The modelView instance also helps with managing application rendered data in response to configuration changes like 
	orientation changes in the app.

Retrofit
Retrofit and it's helper classes are used to help fetch data from the backend server using the Retrofit interface defined functions that map to service on the
backend server to get the data in JSON format which is processed by the help of GSON and mapped to my model classes.

network calls:
I have used Kotlin coroutines to help with the network calls and optimize the app  

HouseDetailActivity

Once a user selects a house from the MainActivities list Recyclerview, this activity is loaded and is responsible for displaying abit more information about the
respective Game Of Thrones house.

*Project Architecture*

The MVVM Architecture is used in this project and I use the kotlin model classes as well as an instance of the ViewModel class for data rendering to the views


*version control*
Github