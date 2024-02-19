plugins {
  java
  id("org.springframework.boot") version "3.2.2"
  id("io.spring.dependency-management") version "1.1.4"
}

subprojects{
  group = "io.project.chagchagchag"
  version = "0.0.1-SNAPSHOT"

  apply(plugin = "java")
  apply(plugin = "java-library")
  apply(plugin = "org.springframework.boot")
  apply(plugin = "io.spring.dependency-management")

  java {
    sourceCompatibility = JavaVersion.VERSION_17
  }

  dependencies {
    implementation("org.springdoc:springdoc-openapi-starter-webmvc-ui:2.3.0")
    compileOnly("org.projectlombok:lombok")
    annotationProcessor("org.projectlombok:lombok")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testImplementation("org.springframework.boot:spring-boot-testcontainers")
    testImplementation("org.testcontainers:junit-jupiter")
  }

  repositories {
    mavenCentral()
  }

  tasks.withType<Test> {
    useJUnitPlatform()
  }

  tasks.getByName("bootJar"){
    enabled = false
  }

  tasks.getByName("jar"){
    enabled = true
  }
}