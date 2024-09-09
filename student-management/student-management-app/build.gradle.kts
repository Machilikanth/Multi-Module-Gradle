plugins {
    id("org.springframework.boot") version "3.1.0"
    id("io.spring.dependency-management")
    id("java")
}

dependencies {
    implementation(project(":student-management-api"))
    implementation("org.springframework.boot:spring-boot-starter")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
}

springBoot {
    mainClass.set("com.example.MultiApplication") // Ensure this is the fully qualified name of your main class
}