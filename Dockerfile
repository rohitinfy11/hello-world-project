FROM openjdk:8-jdk-alpine
VOLUME /tmp
<<<<<<< HEAD
COPY target/sb-hello-world-0.0.1-SNAPSHOT.jar app.jar
=======
COPY ./target/hello-world-project-0.0.1-SNAPSHOT.jar app.jar
>>>>>>> 93f10506ba15e7434621c124fc86a3797aefd781
EXPOSE 8080/tcp
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","app.jar"]
