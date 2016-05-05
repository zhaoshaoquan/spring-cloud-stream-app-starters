echo off

REM Changing Diretory to project DIR
cd /d %~dp0

REM execute mvn plugin with app generation
echo on
mvnw clean install scs:generate-app -pl :spring-cloud-stream-app-generator
