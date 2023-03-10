FROM openjdk:17-alpine

COPY /target/FirstRest-0.0.1-SNAPSHOT.jar /docker-test.jar

CMD ["java","-jar","docker-test.jar"]