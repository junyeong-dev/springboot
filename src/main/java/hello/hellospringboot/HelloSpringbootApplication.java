package hello.hellospringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloSpringbootApplication {

	// start.spring.io 에서 기본 프로젝트 빌드
	// Project : Gradle
	// Dependencies : Spring Web, Thymeleaf
	// GENERATE로 다운받은 후 project import
	
	// 기본적으로 static/index.html 이 Welcome Page 기능을 함
	// localhost:8080 -> static/index.html 이 열림
	public static void main(String[] args) {
		SpringApplication.run(HelloSpringbootApplication.class, args);
	}

}
