Running spring-boot in docker with fabric8 plugin
==============

Sample pom configuration to build a docker image from a spring boot app using fabric8 docker plugin.

It uses fabric8 inline assembly configuration.


## Getting started

These instructions will get you a helloworld spring boot app running in a docker container

### Prerequisites

Install docker on your local machine.


### Installing

```
mvn clean install
```

## Running with docker

### Create image

Use fabric8 plugin to create image

```
mvn docker:build
```

You can see the image in your local registry

```
docker images
```

### Create container

Run a container using following command
```
docker run  -d -p 80:8080 demo/helloworld
```

Type in url browser 
```
http://localhost/helloworld
```
