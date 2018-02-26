# docked_grizzly

Jersey and Grizzly in a docker container. Uses Java and Maven.
Reference: https://yurisubach.com/2016/07/14/jersey-dockerize/

## Build

mvn clean
mvn install
mvn exec:java
curl http://localhost:8080/myapp/myresource

## Dockerize 

docker build --tag=myapp .
docker run -p 18080:8080 -t -i myapp
curl http://localhost:18080/myapp/myresource

## Notes

