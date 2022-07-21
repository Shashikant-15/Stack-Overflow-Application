<<<<<<< HEAD
#FROM openjdk:11
#COPY target/stackoverflow_application.jar stackoverflow_application.jar
#ENTRYPOINT ["java","-jar","/stackoverflow_application.jar"]
=======
FROM openjdk:11
COPY target/stackoverflow_application.jar stackoverflow_application.jar
ENTRYPOINT ["java","-jar","/stackoverflow_application.jar"]
>>>>>>> e78f17480db8c42b44c9a9a64ba64527eb55abec
