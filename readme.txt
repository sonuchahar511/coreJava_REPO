https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html

mvn archetype:generate -DgroupId=com.chahar -DartifactId=CoreJavaRepo -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false

mvn clean install -o -DskipTests
mvn clean install -DskipTests