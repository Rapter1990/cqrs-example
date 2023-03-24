FROM openjdk:17-jdk-slim

ARG JAR_FILE=target/*.jar

COPY ${JAR_FILE} account.query.jar

ENTRYPOINT ["java", "-jar", "/account.query.jar"]

EXPOSE 5001