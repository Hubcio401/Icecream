package com.example.Icecream.icecream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class IcecreamConfig {

    @Bean
    CommandLineRunner commandLineRunner(IcecreamRepository repository){
        return args -> {
            Icecream chocolate = new Icecream( "czekolada", "spytkowice");
            Icecream strawberry = new Icecream( "truskawka", "spytkowice");

            repository.saveAll(List.of(chocolate,strawberry));
        };
    }

}
