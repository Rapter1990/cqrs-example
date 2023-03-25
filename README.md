# Spring Boot CQRS Example


### 🔨 Run the App

There are 2 ways to run the app.

### Maven

1. Install mysql in your computer
2. Install mongodb in your computer
3. Download your project from this link `https://github.com/Rapter1990/cqrs-example`
4. Go to the project's home directory :  `cd cqrs-example`
5. Go to the account.cmd of bank-account :  `cd bank-account` and then `cd account.cmd`
6. Go to the account.query of bank-account :  `cd bank-account` and then `cd account.query`
7. Create a jar file though this command under both directories `mvn clean install`
8. Run the project though this command `mvn spring-boot:run`
9. Send any request of collection under postman collections folder through Postman 

### Docker Compose

1. Download your project from this link `https://github.com/Rapter1990/cqrs-example`
2. Go to the project's home directory :  `cd cqrs-example`
3. Go to the account.cmd of bank-account :  `cd bank-account` and then `cd account.cmd`
4. Go to the account.query of bank-account :  `cd bank-account` and then `cd account.query`
5. Run docker-compose of account.cmd though this command `docker-compose up --build`
6. Run docker-compose of account.query though this command `docker-compose up --build`
7. Send any request of collection under postman collections folder through Postman 

