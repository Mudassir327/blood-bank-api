# Use a base image with Java installed
FROM openjdk:17-jdk-slim

# Set the working directory
WORKDIR /app

# Copy the Maven wrapper files and the project's pom.xml
COPY .mvn .mvn
COPY mvnw .
COPY pom.xml .

# Copy the source code
COPY src ./src

# Build the application using Maven
RUN ./mvnw clean package -DskipTests

# Expose the port the application runs on
EXPOSE 8081

# Define the command to run the application
CMD ["java", "-jar", "target/blood-bank-api-0.0.1-SNAPSHOT.jar"]