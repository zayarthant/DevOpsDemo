FROM openjdk:8
EXPOSE 8080
ADD demo.jar demo.jar
ENTRYPOINT ["java","-jar","demo-0.0.1-SNAPSHOT.jar"]
