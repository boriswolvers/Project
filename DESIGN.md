## Project design - Minor Programmeren
  
    Name:   Boris Wolvers
    App:    Workout app (I still have to think about an appropriate name)
    
### User interface
The rough sketch of the user interface can be seen in the readme.md. When the user starts the app for the first time, user is prompted to choose a workout program. After choosing a workout program and filling some details such as body stats, experience, preferable exercises the user will be redirected to the main screen. Also the entire workout program will be scheduled in the calendar (background task). In the main screen the next workout with the upcoming date will be listed (as cardview item). When clicked on this cardview item user can see which exercises have to be done. The user can mark how many reps/sets he/she has done for the workout. This data will be saved to track progress. After finishing a workout the main screen will be refreshed to list the new next upcoming workout.

### Classes / Activities
To save progress data I will need a database class. Data such as body stats can be saved as sharedpreference or maybe just as well in the database.
Activities:
* MainActivity
* workout programs activity
* exercises activity
* calendar overview activity
* settings activity (form)


