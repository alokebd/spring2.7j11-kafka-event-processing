### Spring Kafka External Event Handler (Kafka message)
- The demo projects with Spring boot and Apache Kafka for publishing messages from exteral source through event handler and consuming to save in database.

## Prerequisites
- Spring Boot (2.7.5)
- Maven 
- Java (11)
- Libraries:
  * starter-web 
  * kafka
  * lombok/logback
  * okhttp-eventsource
  * jackson-core & jackson-databind
  * MySQL DB
  * JPA
- Note: The Consumer used Lob (javax.persistence.Lob) data type for saving large data in database. The jakarta.persistence.Lob has an issue for this reason we use spring 2.7.x instead of 3.x. In Spring 3.x, we need to use jakarta.persistence instead of javax.persistence.

## START THE KAFKA ENVIRONMENT:
- NOTE: Local environment must have Java 8+ installed.

- Kafka Servers Start (local: eg. C:\kafka_2.13-3.7.0) with zookeeper.
* 1) .\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties
* 2) .\bin\windows\kafka-server-start.bat .\config\server.properties

## Run applications
- producer first and then consumer 
- Check DB 

