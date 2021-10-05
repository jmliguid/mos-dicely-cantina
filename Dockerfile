FROM openjdk:8-jdk-alpine
COPY /target/mos-dicely-cantina-0.0.1-SNAPSHOT.jar mos-dicely-cantina-0.0.1-SNAPSHOT.jar
EXPOSE 5000
ENTRYPOINT ["java", "-jar", "/mos-dicely-cantina-0.0.1-SNAPSHOT.jar"]