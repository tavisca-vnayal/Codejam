FROM openjdk:11
RUN grep jar
COPY build/libs/ /var/www/java
WORKDIR /var/www/java
CMD ["java","-jar","Codejam-Assignments-Solutions-1.0-SNAPSHOT.jar"]