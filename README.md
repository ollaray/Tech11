# Tech11
Tech11 Assessment
===================================
**Description:**
===================================
This project uses an in-memory database called H2 according to specifications. 

**PORT CONFIGURATION:**
To change the portal, kindly visit the application.properties find, server.port=9090 (which is the default port for this application). If you are to work with this project
without changing anything, your base endpoint would be: http://localhost:9090.

**APIs:**
1. Create User
   Endpoint: http://localhost:9090/users
   Method: POST
   Request Format: {
    "firstName":"Samie",
    "lastName":"Fox",
    "password":"foxxies",
    "email":"jsox@gmail.com",
    "birthDate":"2022-06-06T17:50:24.814+00:00"

}
   
3. Get a User:
   Endpoint: http://localhost:9090/users/1
   Method: GET
   Request Format: Path Variable/URI segment
   
5. List all Users
   Endpoint: http://localhost:9090/users
   Method: GET
   Request Format: NILL
   
7. Update a User
   Endpoint: http://localhost:9090/users/1
   Method: PUT
   Request Format:Path Variable and JSON
   {
    "firstName":"Samie",
    "lastName":"Fox",
    "password":"foxxies",
    "email":"jsox@gmail.com",
    "birthDate":"2022-06-06T17:50:24.814+00:00"

}
   
9. Delete a user
   Endpoint: http://localhost:9090/users/1
   Method: DELETE
   Request Format: Path Variable
