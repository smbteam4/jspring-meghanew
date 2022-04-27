FROM openjdk:11
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} apocalypse_resistance.jar
ENTRYPOINT ["java","-jar","/apocalypse_resistance.jar"]
EXPOSE 8080