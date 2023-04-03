FROM openjdk:8
WORKDIR /opt
EXPOSE 8080
COPY target/*.jar /opt/user-registration.jar
ENTRYPOINT exec java $JAVA_OPTS -jar user-registration.jar
