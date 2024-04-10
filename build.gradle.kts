plugins {
    id("java")
}

group = "org.fengmaster"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.projectlombok:lombok:1.18.28")
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation("cn.hutool:hutool-all:5.8.10")
}

tasks.test {
    useJUnitPlatform()
}

