# Base image containing Java runtime
FROM openjdk:17-jdk-slim

# Info about maintainer
MAINTAINER eazybank.com

LABEL authors="Vusal.Mammadli"

# Add jar to the image
COPY target/gatewayserver-0.0.1-SNAPSHOT.jar gatewayserver-0.0.1-SNAPSHOT.jar

#execute the application
ENTRYPOINT ["java", "-jar", "gatewayserver-0.0.1-SNAPSHOT.jar"]