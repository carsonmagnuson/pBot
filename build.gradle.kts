plugins {
  java
  application
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
  mavenCentral()
}

application {
  mainClass.set("cs222.pbot.Main")
}
