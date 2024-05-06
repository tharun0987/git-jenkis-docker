FROM azul/zulu-openjdk:17-jre
VOLUME /tmp
COPY target/dockertest-0.0.1-SNAPSHOT.jar abc.jar
EXPOSE 8080/tcp
ENTRYPOINT ["java","-jar","abc.jar"]