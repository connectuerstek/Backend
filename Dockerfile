FROM openjdk:18
RUN mkdir -p /app
WORKDIR /app
COPY target/*.jar ./app.jar
EXPOSE 8087

CMD [ "java", "-jar", "./app.jar" ]
