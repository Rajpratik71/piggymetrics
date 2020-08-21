FROM java:8-jre
MAINTAINER Chi Dov <d.chiproeng@gmail.com>

COPY ./target/turbine-stream-service.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/turbine-stream-service.jar"]

EXPOSE 8989