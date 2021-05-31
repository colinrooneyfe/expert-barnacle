FROM adoptopenjdk/openjdk11:jdk-11.0.11_9-centos
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]