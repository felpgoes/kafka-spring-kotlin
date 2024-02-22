FROM openjdk:21-jdk

EXPOSE 8080

ADD ./build/libs/kafka-spring-0.0.1-SNAPSHOT.jar docker.jar

ENTRYPOINT ["java", "-jar", "docker.jar"]