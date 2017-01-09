## Project proposal - Minor Programmeren
  
    Name:   Boris Wolvers
    App:    Workout app (I still have to think about an appropriate name)
    
    GOALS:
    * Strength program(s)
    * List of exercises with info
    * Calendar
    * Log progress
    * Nice user interface
    
### Previous app idea
At first I wanted to make an app that recognizes plants, flowers in particular. This app would enable users to make pictures of a specific flower and subsequently the app will tell the user which flower they are dealing with. As an additional feature of the app I wanted to list the possible stores (based on GPS) in the neighbourhood where the flower can be bought. 

However...

I could not go through with this app idea because the recognition of flowers was not ideal. To be clear, I didn't want to make a recognition software by myself (that would probably take several years) rather I would use some sort of flower api. After searching for some time on the interwebs I couldn't find a flower api which fulfilled my needs. So then I chose for Google/Yahoo image search, but unfortunately these search api's weren't reliable at all. The well known flowers were recognized by Google/Yahoo but only still when the images where very evident. Because I couldn't rely fully on the search api's I could not make this app due to the insecurities of the search results :(

### New app idea: workout app
Because I had to scrap my first idea I didn't really think through this new app idea. However a friend of mine is really into sports and I could make a well suited work out app. The idea is fairly simple but the app could be very well made if it's executed right and surely it can take a full month to build because extra feautures can be implemented along the way. Also, a workout app is well fitted at this time of the year because of the new year resolutions.

#### Main idea
The workout app is a strength training based app, meaning the app will be centered about strength improvement. The app will contain mostly 'powerlifting-style' training programs, because strength rather than volume can be well tracked in logs. Also a powerlifting-style of training is probably the best way to get results.

When the user starts the app, the user can select a strength program as prefered. The user then enters what weight he/she can lift for some various exercises, based on these numbers and the program selected the app will determine which exercises will be executed at the aimed weight for some period of time. Meaning the training program is set for the user for lets say a month. So for the upcoming month the user doesn't need to think about anything, he/she just simply obeys the program.

#### Features
So the features of the app would be a small amount of training programs to begin with. A list of various exercises with a description and an animation of the exercise to be performed, perhaps a link to an website with some more information. The app also needs a calendar, such that the user has a quick overview of the workouts that already has been done and of course an overview of the upcoming workouts. I also want to add some statistics, so that the user can visualize his/her progress in order to determine what parts can be improved on.

#### User interface
First picure is the screen when the user starts the app, second screen a week overview, third screen calandar overview and fourth screen
log progress.
![alt text](https://github.com/boriswolvers/project/blob/master/doc/userinterface.png "User interface")

#### Data sources / api
For this app an api is not necessary. Although it could be in handy for extracting information of the various excercises but this information could be very well be self written. Same goes for the workout programs. The workout programs I'm going to use are well known workout programs, these programs can be implemented by my self, as tedious it may sound. An extra feature could be to download a workout program in an excel file into the app to speed things up.

#### Technical problems
Limitations could be that some features can be very tedious to implement, so I really need to plan ahead. Apart from that I don't see other difficulties.  

#### Similar applications
There are lots of fitness/health related apps out there. They are all based on an improvement aspect, this is obvious because the user wants to get results. The popularity of the apps are determined by how this improvement aspect is displayed. For example, a barchart or a fancy graph. So all of the similar apps (similar to my app) have some kind of log to track progress, furthermore mostly of the apps have a list provided various exercises. Similar apps:

* StrongLifts 5x5 Workout
* Madcow 5x5
* WORKIT  

#### Minimum viable product
Requirement:
* Strength program(s)
* List of exercises with info
* Calendar
* Log progress
* Nice user interface

Optional:
* Find gyms in neighborhood (gps)
* Upload programs with excel into the app
* Let user make his/her own program
