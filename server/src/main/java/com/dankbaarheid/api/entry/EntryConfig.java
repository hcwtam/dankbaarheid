package com.dankbaarheid.api.entry;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class EntryConfig {
    @Bean
    CommandLineRunner commandLineRunner(EntryRepository repository) {
        return args -> {
            Entry firstPost = new Entry(
                    LocalDate.of(2021, 4, 5),
                    "My first post let's gooooo\n" +
                            "============================\n" +
                            "Testing markdown"
            );
            Entry secondPost = new Entry(
                    LocalDate.of(2021, 4, 6),
                    "Making beans"
            );
            repository.saveAll(List.of(firstPost,secondPost));
        };
    }
}
