package com.example.demo.entry;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class EntryConfig {

    @Bean
    CommandLineRunner commandLineRunner(EntryRepository repository){
        return args -> {
            Entry One = new Entry( "Test Title", "This is the Content of the first Entry of my diary", LocalDate.of(2002, Month.JULY, 22), 10
            );
            Entry Two = new Entry( "Test Title", "This is the Content of the second Entry of my diary", LocalDate.of(2002, Month.JULY, 24), 10
            );

            repository.saveAll(
                    List.of(One,Two)
            );
        };
    }
}
