FROM openjdk:16
ADD build/libs/ms-mail-0.0.1-SNAPSHOT.jar ms-mail-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","ms-mail-0.0.1-SNAPSHOT.jar"]
expose 8080