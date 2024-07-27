FROM openjdk:11
MAINTAINER "Suyad"
COPY target/dockerVm.jar  /usr/app/
WORKDIR /usr/app/
EXPOSE 8085
ENTRYPOINT ["java", "-jar", "dockerVm.jar"]
