# Sample of Java Dynamic Proxy

This is an example of Java Dynamic Proxy to get you started with this feature. To understand how it works read the following article,

- [Getting started with dynamic proxies in Java](https://blog.madadipouya.com/2020/01/25/getting-started-with-dynamic-proxies-in-java/)

## Requirements

- JDK 11 or above
- Maven

## How to run

Execute,

```bash
$ mvn clean package && java -jar  target/sample-java-dynamic-proxy-1.0-SNAPSHOT-jar-with-dependencies.jar
``` 

## Dynamic proxy related classes

The implementation of the dynamic proxy can be found under in `/proxy/MethodexecutorLogger.java`. 
And demonstration on how to use it is in `Application.java`. 
