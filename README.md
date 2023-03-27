# Spring Boot CQRS Example


### 🔨 Run the App

There are 2 ways to run the app.

### Maven

1. Install mysql in your computer
2. Install mongodb in your computer
3. Download your project from this link `https://github.com/Rapter1990/cqrs-example`
4. Go to the project's home directory :  `cd cqrs-example`
5. Go to the bank-account :  `cd bank-account`
6. Create a jar file under bank-account directory though this command  `mvn clean install`
7. Run the project though this command `mvn spring-boot:run`
8. Send any request of collection under postman collections folder through Postman 
9. Show data from both mongodb by following all these commands shown below
```
    -> Open Mongodb Comprass
    -> Create a new connection (mongodb://localhost:27017)
    -> Show data from eventStore collection of bankAccount database
```
10. Show data from both mongodb by following all these commands shown below
```
    -> Open Mysql Workbench
    -> Use default connection
    -> Show data from bank_account table of bankAccount database
```

### Docker Compose

1. Download your project from this link `https://github.com/Rapter1990/cqrs-example`
2. Go to the project's home directory :  `cd cqrs-example`
3. Go to the bank-account directory :  `cd bank-account`
4. Run docker-compose though this command `docker-compose up --build`
5. Send any request of collection under postman collections folder through Postman
6. Show data from both mongodb by following all these commands shown below
```
    -> docker exec -it mongo-container bash
    -> mongosh
    -> show dbs
    -> use bankAccount
    -> show collections
    -> db.eventStore.find({})
```
7. Show data from both mongodb by following all these commands shown below
```
    -> docker exec -it mysql-database mysql -uroot -p
    -> Enter password: password defined in database
    -> USE bankAccount
    -> show tables;
    -> SELECT * FROM bank_account;
```

### Show data from both mongodb and 

### Screenshots

<details>
<summary>Click here to show the screenshots of project</summary>
    <p> Figure 1 </p>
    <img src ="">
</details>
