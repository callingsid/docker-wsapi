FROM openjdk:8
ADD target/docker-wsapi.jar docker-wsapi.jar
EXPOSE 8085
ENTRYPOINT ["java", "-jar", "docker-wsapi.jar"]