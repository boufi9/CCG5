# Étape 1: Utiliser une image de base Java
FROM openjdk:17-jdk

# Étape 2: Copier le fichier jar dans l'image
COPY target/notification-service-0.0.1-SNAPSHOT.jar notification-service-0.0.1-SNAPSHOT.jar

# Étape 3: Exécuter l'application
ENTRYPOINT ["java","-jar","/notification-service-0.0.1-SNAPSHOT.jar"]
