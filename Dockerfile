FROM openjdk
COPY target/Product-0.0.1-SNAPSHOT.jar Product-0.0.1-SNAPSHOT.jar
CMD [ "java" , "-jar" , "Product-0.0.1-SNAPSHOT.jar"]