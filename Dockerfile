FROM openjdk
WORKDIR demo
ADD target/demo-1.0.jar app.jar
ENTRYPOINT java -jar app.jar
