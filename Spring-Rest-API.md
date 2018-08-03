Testing the API:

Do a maven build without test and then run as Spring application

1. now go to browser and Install Postman chrome plugin
2. Open new Request 

################################################################
API 1:
URL : localhost:8080/register
Request : POST
Header: Content-type - application/json
Request Body :
{
	"username" : "KB",
	"password" : "password",
	"email" : "abcd@gmail.com",
	"phone" : "7799452213",
	"name" : "Kulbhushan"
}

---------------------------------------------------------------
Response : Account Registered with Username :Kulbhushan

################################################################
API 2:
URL : localhost:8080/login
Request : POST
Header: Content-type - application/json
Request Body :
{
"username":"KB",
"password":"password"
}

---------------------------------------------------------------
Response : true
