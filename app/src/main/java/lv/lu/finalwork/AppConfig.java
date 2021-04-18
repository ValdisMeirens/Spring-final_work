package lv.lu.finalwork;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Scanner;

@Configuration
@ComponentScan(basePackages = "lv.lu.finalwork")
public class AppConfig {

    @Bean
    public Scanner scanner(){
        return new Scanner(System.in);
    }
}
