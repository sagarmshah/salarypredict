# Salary Prediction App

Spring app to predict salary

## Introduction

Developed a Spring boot web app to predict annual salary from a given job title. Created API to predict the latest salary trends in the UK and US. Also, supports speech processing where a user speaks a job title and the relevant salary trend is displayed.
The app operates in three layers - Controller, Service, and Dao
1. Controller - the Controller handles the request mapping received from the browser by the user’s HTTP request and calls the appropriate service.
2. Service - this layer represents the logical representation of the app. It invokes the appropriate Dao which returns the output data. This data is returned to the Controller.
3. Dao - the data access object, queries the data and returns the appropriate results to the Service.
The input for speech processing controller is pre-recorded by a user and supplied to the appropriate API.

## Tool Used: Spring Tool Suite(STS)

STS comes with spring boot and includes maven that downloads all the dependencies. Using this tool we can effectively implement a Spring RESTful web services.

## API used

1. Glassdoor - https://www.glassdoor.com/developer/index.htm
2. Adzuna - https://developer.adzuna.com/overview
3. IBM Watson Speech to Text - http://www.ibm.com/watson/developercloud/doc/ speech-to-text/

## How to Use it? (Steps)

1. After navigating to the project directory, use a terminal and give the following command - mvn spring-boot:run
2. On a second terminal navigate to the created api and run - curl localhost:8080/ salarypredict/usa/accountant

### NOTE 

Also, shared on the following link with extra files and results shown in a read me file -
https://drive.google.com/open?id=0B_DLuJshkXLAYUxKLWdzbWo0a2c
