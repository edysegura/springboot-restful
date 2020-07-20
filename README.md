# Spring Boot RESTful

I've create this project to learn about Spring Boot by doing!

## Docker Image

In order to generate a Docker Image just run the command below:

```
./mvnw spring-boot:build-image -Dspring-boot.build-image.imageName=edysegura/springboot-restful
```

## Instruction

```
docker run -p 8080:8080 edysegura/springboot-restful
```

## References

- [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
- [Spring Boot CRUD REST API + Spring Data JPA + H2 Database Example](https://www.javaguides.net/2019/08/spring-boot-crud-rest-api-spring-data-jpa-h2-database-example.html)
- [Spring REST OpenAPI documentation](https://www.baeldung.com/spring-rest-openapi-documentation)
- [Bean validation with Spring Boot](https://reflectoring.io/bean-validation-with-spring-boot/)
- [Java REST API Showdown: Which is the Best Framework on the Market?](https://app.getpocket.com/read/2847693089)
