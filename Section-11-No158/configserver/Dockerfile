# Base image containing Java runtime
FROM openjdk:17-jdk-slim

# Info about maintainer
MAINTAINER eazybank.com

LABEL authors="Vusal.Mammadli"

# Add jar to the image
COPY target/configserver-0.0.1-SNAPSHOT.jar configserver-0.0.1-SNAPSHOT.jar

#execute the application
ENTRYPOINT ["java", "-jar", "configserver-0.0.1-SNAPSHOT.jar"]