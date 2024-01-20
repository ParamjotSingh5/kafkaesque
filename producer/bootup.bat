@echo off

:: Navigate to the project directory
cd .

call .\gradlew.bat clean build

cd .\..\consumer\

call .\gradlew.bat clean build

cd .\..\producer\

call docker-compose -f .\docker-compose-message-service.yml up