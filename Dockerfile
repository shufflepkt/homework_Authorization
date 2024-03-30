FROM classmethod/openjdk-alpine-git:latest

EXPOSE 8080

ADD target/homework_Authorization-0.0.1-SNAPSHOT.jar app.jar

CMD ["java", "-jar", "app.jar"]