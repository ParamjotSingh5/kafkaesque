FROM eclipse-temurin:17-jdk-alpine

EXPOSE 8081

COPY ./build/libs/consumer.jar app.jar

ENTRYPOINT [ "java", "-jar", "./app.jar" ]