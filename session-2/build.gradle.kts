import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("org.springframework.boot") version "2.3.3.RELEASE"
    id("io.spring.dependency-management") version "1.0.10.RELEASE"
    kotlin("jvm") version "1.5.10"
    kotlin("plugin.spring") version "1.5.10"
    id("idea")
}

group = "me.deepikajhanwar"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-webflux")
    testImplementation("io.kotlintest:kotlintest-assertions:3.4.2")
    testImplementation(kotlin("test"))
    testImplementation("io.mockk:mockk:1.10.0")
}

tasks.test {
    useJUnitPlatform()
}
tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict")
        jvmTarget = "1.8"
    }
}
//task(name = "ktlint", type = JavaExec::class) {
//
//}
//tasks.compileKotlin.get().dependsOn(tasks.getByName("ktlint"))