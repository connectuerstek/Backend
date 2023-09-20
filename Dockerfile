FROM openjdk:18
RUN mkdir -p /app
WORKDIR /app
COPY ./target/learn-spring-boot-0.0.1-SNAPSHOT.jar /app
EXPOSE 8087

CMD [ "java", "-jar", "learn-spring-boot-0.0.1-SNAPSHOT.jar" ]
