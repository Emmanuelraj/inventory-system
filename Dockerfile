FROM openjdk:8
ADD target/inventory-system-0.0.1-SNAPSHOT.jar  inventory-system-0.0.1-SNAPSHOT.jar
EXPOSE 8050
ENTRYPOINT ["java", "-jar", "inventory-system-0.0.1-SNAPSHOT.jar"]