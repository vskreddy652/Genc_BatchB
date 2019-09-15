FROM java:8
EXPOSE 9032
ADD com.sprst-0.0.1-SNAPSHOT.jar com.sprst-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "com.sprst-0.0.1-SNAPSHOT.jar"]
