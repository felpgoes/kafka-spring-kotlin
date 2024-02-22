# Kafka with Spring

### Application Features
- [x] Dockerized
- [x] Docker compose with Kafka and AVRO
- [x] Ktlint
- [x] Simple Producer
- [x] Simple Consumer
- [ ] Add docker compose validation (healthcheck and connections)
- [ ] AVRO Configuration
- [ ] Producer with AVRO Patterns
- [ ] Consumer following AVRO Patterns


## Linting 
[KTLint](https://pinterest.github.io/ktlint/latest/) using [Gradle Integration](https://github.com/jeremymailen/kotlinter-gradle)

### Format
```shell
./gradlew formatKotlin
```
### Validate Linting
```shell
./gradlew lintKotlin
```
---
## Running Application

### Build JAR file
```shell
 ./gradlew jar
```

### Execute docker compose with kafka
```shell
docker compose up
```


---
## Kafka CLI

### Connect
```shell
docker exec -it broker bash
```

### Produce
```shell
kafka-console-producer --broker-list localhost:9092 --topic test-topic
```

### Consumer
```shell
kafka-console-consumer --bootstrap-server localhost:9092 --topic test-topic
```

## AVRO CLI

### Connect
```shell
docker exec -it schema-registry bash
```

### Produce
```shell
kafka-avro-console-producer --broker-list broker:29092 --topic greetings --property value.schema='{"type": "record","name":"Greeting","fields": [{"name": "greeting","type": "string"}]}'
```

### Consumer
```shell
kafka-avro-console-consumer --bootstrap-server broker:29092 --topic greetings --from-beginning
```