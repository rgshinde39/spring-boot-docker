FROM openjdk:17-alpine
EXPOSE 8080
ADD taget/spring-boot-image.jar spring-boot-image.jar
ENTRYPOINT ["java", "-jar", "/spring-boot-image.jar"]
