FROM openjdk:8-jdk-alpine
COPY ./build/libs/shtp-0.0.1.jar .
EXPOSE 3001:3001
ENTRYPOINT ["java","-jar","./shtp-0.0.1.jar"]
