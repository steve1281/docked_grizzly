# docked_grizzly

Jersey and Grizzly in a docker container. (Uses Java and Maven.)

`Reference: https://yurisubach.com/2016/07/14/jersey-dockerize/`

## Build

```
mvn clean
mvn install
mvn exec:java
curl http://localhost:8080/myapp/myresource
```

## Dockerize 

```
docker build --tag=myapp .
docker run -p 18080:8080 -t -i myapp
curl http://localhost:18080/myapp/myresource
curl "http://localhost:18080/myapp/addit?a=10&b=20"
curl "http://localhost:18080/myapp/additj?a=10&b=20"

```

## Notes

```
Maven home: /opt/apache-maven-3.5.2
Java version: 1.8.0_65, vendor: Oracle Corporation
Java home: /usr/lib/jvm/jdk-8-oracle-arm32-vfp-hflt/jre
Default locale: en_CA, platform encoding: UTF-8
OS name: "linux", version: "4.9.59-v7+", arch: "arm", family: "unix"

```
