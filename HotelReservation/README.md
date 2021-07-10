# This project includes two API which is used for Viewing and reserving the hotel.

Languages/frameworks:
The API is developed on Java/Spring Boot and the working project war is deployed on  AWS Elastic Beanstalk.

API URL:

Github URL:
https://github.com/Ramyau55/A00442585_MCDA5550

Database:
The API’s are using MySQL database for fetching and saving the database. Mysql server that is running on linux machine(dbcourse.cs.smu.ca). “mysql-connector-java”  dependency is used to connect the java code to Mysql database.
 
API CALLS:

API1:
Description: 
This API fetches the list of hotels such as hotel name, Price and Availability. Currently it fetches the data from mysql database. The API is protected with Basic Auth Security.
Function name: getListOfHotels

URL: http://localhost:8080/getListOfHotels

Method: GET
 
Input Parameter: Nothing

Authorization:

Type: Basic Auth
Username: test
Password: Password

Response:

[
    {
        "hotel_id": 1,
        "hotel_name": "A2B",
        "price": 2000,
        "availability": false
    },
    {
        "hotel_id": 2,
        "hotel_name": "KFC",
        "price": 4000,
        "availability": true
    },
    {
        "hotel_id": 4,
        "hotel_name": "Leela Palace",
        "price": 3000,
        "availability": true
    },
    {
        "hotel_id": 6,
        "hotel_name": "Marriot",
        "price": 6000,
        "availability": false
    }
]


API2:

Description: 
This API save the reservation details such as hotel name, check-in date, checkout date, and guest details(name and gender) into database and returns the booking confirmation to the user. Currently it fetches the data from MySQL database. Also, this API is protected with Basic Auth Security.
Function name: reserveHotel

URL: http://localhost:8080/reserveHotel

Method: POST
 
Input Parameter: 

    {
        "hotel_name": "Leela Palace3",
        "checkin": "12/2/2021",
        "checkout": "15/2/2021",
        "guests": [{
            
            "guest_name" : "Ramya",
            "gender" : "Female"
        },
        {  
            "guest_name" : "Sasikumar",
            "gender" : "Male"
        }]
    }

Authorization:

Type: Basic Auth
Username: test
Password: Password

Response:

Your Booking Confirmation Number is 999999 for the hotel Leela Palace3

 









