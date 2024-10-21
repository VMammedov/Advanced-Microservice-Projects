# Base image containing Java runtime
FROM openjdk:17-jdk-slim

# Info about maintainer
MAINTAINER eazybank.com

LABEL authors="Vusal.Mammadli"

# Add jar to the image
COPY target/eurekaserver-0.0.1-SNAPSHOT.jar eurekaserver-0.0.1-SNAPSHOT.jar

#execute the application
ENTRYPOINT ["java", "-jar", "eurekaserver-0.0.1-SNAPSHOT.jar"]