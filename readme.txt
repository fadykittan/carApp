app properties for postgres:
spring.datasource.driverClassName=org.postgresql.Driver
spring.datasource.url = jdbc:postgresql://localhost:5433/cardb
spring.datasource.username=postgres
spring.datasource.password=admin
spring.jpa.database-platform=org.hibernate.dialect.PostgreSQLDialect
spring.jpa.hibernate.ddl-auto = update
spring.jpa.properties.hibernate.jdbc.lob.non_contextual_creation=true


app properties for postgres in heroku:
spring.datasource.driverClassName=org.postgresql.Driver
spring.datasource.url = jdbc:postgresql://xqbdmgjgwnpoxh:29ab58789410241ab8914908cec8269d50e5b6bda7da5de325124a31d716e007@ec2-79-125-4-96.eu-west-1.compute.amazonaws.com:5432/d15l7rddi13d8t

spring.datasource.username=xqbdmgjgwnpoxh
spring.datasource.password=29ab58789410241ab8914908cec8269d50e5b6bda7da5de325124a31d716e007
spring.jpa.database-platform=org.hibernate.dialect.PostgreSQLDialect
spring.jpa.hibernate.ddl-auto = update
spring.jpa.properties.hibernate.jdbc.lob.non_contextual_creation=true