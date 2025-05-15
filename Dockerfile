# Используем официальный образ OpenJDK как базовый
FROM openjdk:17-jdk-slim

CMD ["bash", "-c", "build.sh"]

# Указываем рабочую директорию внутри контейнера
WORKDIR /app

# Копируем собранный JAR в контейнер
COPY target/msapp-0.0.1.jar app.jar

# Открываем порт, который использует ваше приложение (например, 8080)
EXPOSE 8080

# Команда для запуска приложения
ENTRYPOINT ["java", "-jar", "app.jar"]