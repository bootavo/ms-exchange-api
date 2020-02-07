FROM openjdk:8-jdk-alpine
LABEL maintainer="tavo.tf@gmail.com"
VOLUME /tmp
ARG JAR_FILE=target/ms-exchange-api-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} ms-exchange-api.jar
EXPOSE 8080
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/ms-exchange-api.jar"]