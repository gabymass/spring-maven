# Utilisez une image de base avec Java
FROM eclipse-temurin:17-jdk [cite: 22]

# Définir le répertoire de travail dans le conteneur
WORKDIR /app [cite: 24]

# Copier le fichier jar généré dans le conteneur
COPY target/*.jar app.jar [cite: 26]

# Exposer le port sur lequel Spring Boot écoute
EXPOSE 8080 [cite: 28]

# Commande pour lancer l'application Spring Boot
ENTRYPOINT ["java", "-jar", "/app/docker-demo.jar"] [cite: 30]
