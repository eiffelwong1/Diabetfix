# Diabetfix
this is an Android app for both diabetic and non-diabetic users who wish to improve their health. It provides exercise and food recommendations based on the user's daily activities.

# to edit and run file in Android Studio
download the file and import it to Android Studio, click open diabetfix and open the app icon and you will be able to build and run.

The Fragment java fles are all front end pages that handle displaying and inputting the user's data
The DiabeticClassifier is our classifier that takes some hyper parameters and outputs whether a user is diabetic or not
The Context file is our recommendations calculator
The SharedPrefManager file handles syncing the remote db data with local data
The User file is the model for the user
The VolleySingleton file handles all API requests
The URL file defines all URIs for our API
The Score file determines the score given some activity, food, or glucose value

There are some extra activity files that were used during development as well as some other auxiliary files.