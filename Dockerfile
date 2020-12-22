FROM openjdk:12-alpine
VOLUME /tmp
ADD target /*.jar
COPY ${JAR_FILE} rides.jar
EXPOSE 8000
ENTRYPOINT ["java","-jar","rides.jar"]