# Stage 1: Build the application with Maven
FROM maven:3.8.4-openjdk-17-slim AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

# Stage 2: Create the final Docker image
FROM openjdk:17-jdk-slim
WORKDIR /app
COPY --from=build /app/target/skill-0.0.1-SNAPSHOT.jar /app/skill-0.0.1-SNAPSHOT.jar

# Expose port 9000 (the port your Spring Boot application is running on)
EXPOSE 9000

# Define the command to run your application
CMD ["java", "-jar", "skill-0.0.1-SNAPSHOT.jar"]
