# backbase-app
README.md
project name =backbase-app

Demonstrates the capabilities of the Spring MVC web framework through small, simple examples. After reviewing this showcase, you should have a good understanding of what Spring MVC can do and get a feel for how easy it is to use. Includes project code along with a supporting slideshow and screen cast.

The (backbase-app) project consumes the services exposed by openbank project. Below is the service exposed by OpenBank. 
https://apisandbox.openbankproject.com/obp/v1.4.0/banks/rbs/accounts/savings-kids-john/public/transactions
This projects exposes three endpoints based diffrent criteria . Below are the three Endpoints 

1. http://localhost:8080/backbase-app/transactions/transactionlist
2. http://localhost:8080/backbase-app/transactions/transactionlist/sandbox-payment/
3. http://localhost:8080/backbase-app/transactions/transactionlist/totaltxnAmount/sandbox-payment

The first Endpoint gives the list of all the transactions .
The second endpooint gives the list of transactions based on the transaction Type . Here (Transaction type ='sandbox-payment'). we can replace transaction type with any type of transaction.
The Third endpoint gives the total(sum) of transaction amount based on the transactions type.Here (Transaction type ='sandbox-payment'). we can replace transaction type with any type of transaction.

 

##Below are the actions which are perfomed by invidual components (controllers and services )
###Project Details###

@TransactionController
Mapping Requests - Maps the request 
Obtaining Request Data - collects the data from the exposed service
Responses  -In the response return the list of transaction from the service.
Exception Handling

@ResultController
Mapping Requests -Maps the request for the user login .
Response - returns the view fir the login page.

@TransactionService
This service is used to fetch the data from the exposed transaction service from OpenBank.

##Security features :
The project implements the basic spring security feature for authorization .(Login to application).

#LOGIN CREDENTAILS 
username : admin
password : admin

###tools and technologies###

Springframework version -4.3.10.RELEASE
jackson-core version -
log4j version -1.2.17
spring-security-web version - 4.0.3.RELEASE
spring-security-config -4.0.3.RELEASE
mockito-all version -1.9.5
hamcrest-all version 
jackson-databind version -2.4.1
jackson-core  version -2.6.3
junit        version -4.11
javax.servlet-api version - 3.1.0
tomcat7-maven-plugin 
maven-compiler-plugin 
JDK 1.8
Tomcat 7.0
Maven
Eclipse


Installation Steps: 

Clone the repository:

$ git clone https://github.com/vaidyanath08/backbase-app.git

To run the application:

From the command line with Maven:

$ cd backbase-app
$ mvn clean install tomcat7:run  


In your preferred IDE Eclipse , InteliJ:

Import backbase-app as a Maven Project


Access the deployed web application at: http://localhost:8080/backbase-app/login

Note:

For testing the endpoints via POSTMAN by giving AUTH credentials (username  :admin , password : admin)
1.Trasactionlist  : http://localhost:8080/backbase-app/transactions/transactionlist

2.Transactions on type  : http://localhost:8080/backbase-app/transactions/transactionlist/{type}
replace {type} with any type of transaction (In this case type =sandbox-payment)

3. Total transaction amount on transaction type : http://localhost:8080/backbase-app/transactions/transactionlist/totaltxnAmount/{type}
replace {type} with any type of transaction (In this case type =sandbox-payment)
