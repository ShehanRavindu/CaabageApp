FROM openjdk:8-jdk-alpine
WORKDIR /opt/app
ARG JAR_FILE=target/spring-boot-web.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","app.jar"]
FROM adoptopenjdk/openjdk:8-jdk-alpine
ARG JAR_FILE=target/spring-boot-web.jar
WORKDIR /opt/app
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","app.jar"]