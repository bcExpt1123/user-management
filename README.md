# A REST API for managing users. 

## This service is responsible for the following:
- Creating new users
- Listing all available users
- Listing a single user
- Updating an existing user
- Deleting an existing user

## Users can store the following information:
- A username
- A first name
- A last name
- An email
- A phone number

## Service can perform the following:
- Present a REST API (producing and consuming JSON)
- Persist users through restarts

## Service presents the following API endpoint:
- POST /users - create a new user
- GET /users - get a list of users
- GET /users/{id}
- PUT /users/{id}
- DELETE /users/{id}
