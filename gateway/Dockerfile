FROM goodrainapps/maven:jdk8-alpine
MAINTAINER guox <guox@goodrain.com>

# Caching Maven dependencies
WORKDIR /app

# package
COPY . /app

ENV PORT=4000
CMD ["java", "-Xmx200m","-Dserver.port=${PORT}","-jar", "/app/target/gateway.jar"]

EXPOSE 4000