FROM openjdk:11
COPY target/stackoverflow_application.jar stackoverflow_application.jar
ENTRYPOINT ["java","-jar","/stackoverflow_application.jar"]