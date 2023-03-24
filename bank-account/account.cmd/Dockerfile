FROM openjdk:17-jdk-slim AS build

COPY pom.xml mvnw ./
RUN chmod +x mvnw
COPY .mvn .mvn
RUN ./mvnw dependency:resolve

COPY src src
RUN ./mvnw package -Dmaven.test.skip

FROM openjdk:17-jdk-slim
WORKDIR account-cmd
COPY --from=build target/*.jar account.cmd.jar
ENTRYPOINT ["java", "-jar", "account.cmd.jar"]