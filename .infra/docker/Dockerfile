FROM java:8
COPY build/libs/Codejam-Assignments-Solutions-1.0-SNAPSHOT.jar /var/www/java/
WORKDIR /var/www/java/
EXPOSE 8888
RUN chmod 777 Codejam-Assignments-Solutions-1.0-SNAPSHOT.jar
CMD ["java","-jar","Codejam-Assignments-Solutions-1.0-SNAPSHOT.jar"]