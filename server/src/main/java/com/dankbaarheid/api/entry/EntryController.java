package com.dankbaarheid.api.entry;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(path="api/entries")
public class EntryController {
    @GetMapping
    public List<Entry> getEntries() {
        return List.of(
                new Entry(
                        1L,
                        LocalDate.of(2021,4, 5),
                        "My first post let's gooooo"
                )
        );
    }
}
