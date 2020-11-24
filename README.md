# shardingsphere-demo
springboot jpa + shardingsphere + mysql

## branches:
### [done] table-sharding 
###### only table sharding demo. springboot jpa + sharding jdbc + mysql
usage: <br>
+ ```docker run -p3306:3306 -e MYSQL_ROOT_PASSWORD=root -d mysql:5.7 ``` <br>
+ create database dbs1
+ run sharding-jdbc-demo/src/main/resources/schema.sql to create tables
+ run springboot application
### [working] database-sharding 
###### only db sharding demo  
### [working] database-table-sharding 
###### only db and table sharding demo
### [done] proxy 
###### run shardingsphere proxy by using docker compose
usage:
+ just execute ``` docker-compose up```
### [done] proxy-and-table-sharding 
###### application side use table sharding. proxy use shardingsphere docker image. 
usage:
+ just execute ``` docker-compose up```
+ run springboot application