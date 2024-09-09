plugins {
    id("java")
    id("org.springframework.boot")
    id("io.spring.dependency-management")
}


dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation(project(":student-management-domain"))
    implementation(project(":student-management-service"))
}
tasks.named<org.springframework.boot.gradle.tasks.bundling.BootJar>("bootJar") {
    enabled = false
}
