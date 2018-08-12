package team.redrock.mybatisdemo1;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("team.redrock.mybatisdemo1.mapper")
public class Mybatisdemo1Application {


	public static void main(String[] args) {
		SpringApplication.run(Mybatisdemo1Application.class, args);
	}
}
