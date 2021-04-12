package com.dankbaarheid.api.entry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path="api/entries")
public class EntryController {

    private final EntryService entryService;

    @Autowired
    public EntryController(EntryService entryService) {
        this.entryService = entryService;
    }

    @GetMapping
    public List<Entry> getEntries() {
        return entryService.getEntries();
    }

    @GetMapping(path= {"{date}.json", "{date}"})

    public Optional<Entry> getEntry(@PathVariable String date) {
        return entryService.getEntry(date);
    }

    @PostMapping
    public boolean createEntry(@RequestBody Entry entry) {
        return entryService.createEntry(entry);
    }

    @PutMapping(path="{date}")
    public boolean updateEntry(@PathVariable String date, @RequestBody Entry entry) {
        return entryService.updateEntry(date, entry);
    }

    @DeleteMapping(path="{id}")
    public void deleteEntry(@PathVariable long id) {
        entryService.deleteEntry(id);
    }
}
