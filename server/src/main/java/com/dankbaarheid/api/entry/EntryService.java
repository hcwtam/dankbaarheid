package com.dankbaarheid.api.entry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class EntryService {
    private final EntryRepository entryRepository;

    @Autowired
    public EntryService(EntryRepository entryRepository) {
        this.entryRepository = entryRepository;
    }

    public List<Entry> getEntries() {
        return entryRepository.findAll();
    }

    public Optional<Entry> getEntry(String date) {

        LocalDate localDate = LocalDate.parse(date);

        Optional<Entry> byDate = entryRepository.findEntryByDate(localDate);
        if (byDate.isEmpty()) {
            throw new IllegalStateException("This entry does not exist.");
        }
        return entryRepository.findEntryByDate(localDate);
    }

    public void createEntry(Entry entry) {
        Optional<Entry> entryByDate = entryRepository.findEntryByDate(entry.getDate());
        if (entryByDate.isPresent()) {
            throw new IllegalStateException("Entry on this date already exists.");
        }
        entryRepository.save(entry);
    }

    public void deleteEntry(long id) {
        boolean exists = entryRepository.existsById(id);
        if (!exists) {
            throw new IllegalStateException("Entry with id " + id + "does not exist.");
        }
        entryRepository.deleteById(id);
    }

    @Transactional
    public void updateEntry(long id, String content) {
        if (content.isEmpty()) {
            throw new IllegalStateException("Content must not be empty.");
        }
        Entry entry = entryRepository.findById(id).orElseThrow(()->new IllegalStateException("Entry with id " + id + "does not exist."));

        entry.setContent(content);
    }
}
