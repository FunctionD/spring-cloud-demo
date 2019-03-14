**1.先打个包**
<br>
`mvn clean package`


**2.按各个配置文件运行jar**
<br>
`java -jar eureka-server-0.0.1-SNAPSHOT.jar --spring.profiles.active=peer1`

`java -jar eureka-server-0.0.1-SNAPSHOT.jar --spring.profiles.active=peer2`

`java -jar eureka-server-0.0.1-SNAPSHOT.jar --spring.profiles.active=peer3`