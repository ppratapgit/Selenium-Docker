FROM  openjdk:8u212-jre-alpine3.9
#Workspace
WORKDIR /usr/share/udemy

#Add files from target folder to host
ADD target/selenium-docker.jar          selenium-docker.jar
ADD target/selenium-docker-tests.jar    selenium-docker-tests.jar
ADD target/libs                         libs

#in case of any csv, json, xls add that also to target folder

#Add suite files
ADD mvnDockerTestNg.xml     mvnDockerTestNg.xml
ENTRYPOINT java -cp selenium-docker-tests.jar:selenium-docker.jar:libs/* -DHUB_HOST=$HUB_HOST org.testng.TestNG mvnDockerTestNg.xml
