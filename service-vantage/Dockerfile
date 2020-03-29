FROM openjdk:8-jdk-alpine

RUN addgroup -S marcat_group && adduser -S marcat_vantage_user -G marcat_group

USER marcat_group:marcat_vantage_user

ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]

EXPOSE 8080
