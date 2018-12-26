package io.pivotal.syanagihara.functions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Random;
import java.util.function.Function;

@SpringBootApplication
public class RandomApplication {

    @Bean
    public Function<Integer, Integer> random() {
        return s -> new Random().nextInt(s) + 1;
    }

    public static void main(String[] args) {
        SpringApplication.run(RandomApplication.class, args);
    }

}

