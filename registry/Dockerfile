FROM goodrainapps/maven:jdk8-alpine
MAINTAINER guox <guox@goodrain.com>

# package
COPY . /app
WORKDIR /app

CMD ["java", "-Xmx200m","-Dserver.port=${PORT}","-jar", "/app/target/registry.jar"]

EXPOSE 8761
