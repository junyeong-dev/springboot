package hello.hellospringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloSpringbootApplication {

	// start.spring.io 에서 기본 프로젝트 빌드
	// Project : Gradle
	// Dependencies : Spring Web, Thymeleaf
	// GENERATE로 다운받은 후 project import

	// 빌드하기
	// ./gradlew build
	// 잘 안될경우
	// ./gradlew clean build
	// cd build/libs
	// 실행하기
	// java -jar hello-spring-0.0.1-SNAPSHOT.jar

	// 기본적으로 static/index.html 이 Welcome Page 기능을 함
	// localhost:8080 -> static/index.html 이 열림
	public static void main(String[] args) {
		SpringApplication.run(HelloSpringbootApplication.class, args);
	}

	// H2 데이터베이스 사용
	// H2 설치 -> H2 Console
	// 인터넷 창이 뜨게 되는데 로딩이 제대로 안될때는 주소창 앞의 ip번호를 지우고 localhost로 변경
	// jdbc:h2:~/test - 초기
	// jdbc:h2:tcp://localhost/~/test - 변경
	// 기본적으로 접속하게 되면 User Home에 test.mv.db가 생성됨


}
