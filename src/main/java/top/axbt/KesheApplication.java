package top.axbt;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("top.axbt.keshe.dao")
public class KesheApplication {

    public static void main(String[] args) {
        SpringApplication.run(KesheApplication.class, args);
    }
}
