```bash
# check existing java version
java --version 

# install both for testing purpose
brew install openjdk@17
brew install openjdk@21

# installation path
/usr/local/opt/openjdk@17/
/usr/local/opt/openjdk@21/

user-2:bin user$  /usr/local/opt/openjdk@21/bin/java -version
openjdk version "21.0.9" 2025-10-21
OpenJDK Runtime Environment Homebrew (build 21.0.9)
OpenJDK 64-Bit Server VM Homebrew (build 21.0.9, mixed mode, sharing)

user-2:bin user$  /usr/local/opt/openjdk@17/bin/java -version
openjdk version "17.0.17" 2025-10-21
OpenJDK Runtime Environment Homebrew (build 17.0.17+0)
OpenJDK 64-Bit Server VM Homebrew (build 17.0.17+0, mixed mode, sharing)
user-2:bin user$ 

# export PATH for testing
export JAVA_HOME=/usr/local/opt/openjdk@17/

# setup mvn
export MAVEN_HOME=/usr/local/apache-maven/apache-maven-3.9.x
export PATH=$MAVEN_HOME/bin:$PATH

# create java app
https://start.spring.io/
Java
Maven
Spring 3.4.12
Project Metadata (use default)
Packaging: jar
Configuration: Properties
Java: 17

# build and run
mvn compile
mvn package 
java -jar target/demo-0.0.1-SNAPSHOT.jar 

$ curl http://localhost:8080/hello
Hello World!user-2:aws user

$ curl http://localhost:8080/
Home Page!user-2:aws user$ 

```