# fetch basic image
# original: FROM maven:3.3.9-jdk-8
FROM maven:3.5.2-jdk-8-alpine

# application placed into /opt/app
RUN mkdir -p /opt/app
WORKDIR /opt/app

# selectively add the POM file and
# install dependencies
COPY pom.xml /opt/app/
RUN mvn install

# rest of the project
COPY src /opt/app/src
RUN mvn package

# local application port
EXPOSE 8080

# execute it
CMD ["mvn", "exec:java"]
