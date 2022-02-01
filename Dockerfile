FROM openjdk:8
ADD target/dockerExample-0.0.1-SNAPSHOT.jar dockerExample-0.0.1-SNAPSHOT.jar
EXPOSE 8085
ENTRYPOINT ["java","-jar","dockerExample-0.0.1-SNAPSHOT.jar"]