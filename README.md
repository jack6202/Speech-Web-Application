# Speech-Web-Application

This project was generated with [Angular CLI](https://github.com/angular/angular-cli) version 9.0.5.

## Angular Server

Make sure Angular CLI is downloaded and Node.js
Run `ng serve` from the SpeechAppFrontend folder for a dev server. 
The default port should be 4200 so it will be running on `http://localhost:4200/`. 
The app will automatically reload if you change any of the source files.

## Java Server

This project was developed in IntelliJ and run as a Maven project.
The easist way to load the project into IntelliJ:
  1. Choose "Open" from the IntelliJ launcher and navigate to the pom.xml file in the backend project.
  2. Select "Open as project" and the project should load.
  3. Navigate to src/main/java/com/dialectric/SpeechApplication.java and run this class.
The backend should begin running on localhost port 8080, but make sure this is the case from the terminal.

## Database Communication

The database that the backend connects to is hosted on Google Cloud from the ip address 35.247.82.214.
Connections are limited to only authorized networks:
  Add yourself to this list from Cloud Console by navigating to SQL->speech-database->Connections->Authorized networks.




To get more help on the Angular CLI use `ng help` or go check out the [Angular CLI README](https://github.com/angular/angular-cli/blob/master/README.md).
