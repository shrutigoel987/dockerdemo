FROM openjdk:8

RUN mkdir /app

WORKDIR /app

COPY target/dockerdemo-0.0.1-SNAPSHOT.jar /app

EXPOSE 8081

ENTRYPOINT ["java","-jar","dockerdemo-0.0.1-SNAPSHOT.jar"]