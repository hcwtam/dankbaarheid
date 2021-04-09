package com.dankbaarheid.api.entry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
//@CrossOrigin(origins = "*")
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

    @GetMapping(path="{date}")
    public Optional<Entry> getEntry(@PathVariable String date) {
        return entryService.getEntry(date);
    }

    @PostMapping
    public void createEntry(@RequestBody Entry entry) {
        entryService.createEntry(entry);
    }

    @PutMapping(path="{id}")
    public void updateEntry(@PathVariable long id, @RequestBody String content) {
        entryService.updateEntry(id, content);
    }

    @DeleteMapping(path="{id}")
    public void deleteEntry(@PathVariable long id) {
        entryService.deleteEntry(id);
    }
}
