#TODO
FROM openjdk:11
USER root
RUN curl -fsSLO https://get.docker.com/builds/Linux/x86_64/docker-17.04.0-ce.tgz \
  && tar xzvf docker-17.04.0-ce.tgz \
  && mv docker/docker /usr/local/bin \
  && rm -r docker docker-17.04.0-ce.tgz
COPY build/libs /var/www/java
WORKDIR /var/www/java
CMD ["java", "-jar", "Codejam-Assignments-Solutions-1.0-SNAPSHOT.jar"]
