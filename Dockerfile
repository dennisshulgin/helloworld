FROM openjdk:24-slim
COPY target/helloworld-0.0.1-SNAPSHOT.jar /usr/src/myapp/App.jar
WORKDIR /usr/src/myapp
CMD ["java", "-jar", "App.jar"]