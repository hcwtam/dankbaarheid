package com.dankbaarheid.api.entry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.Optional;

@Repository
public interface EntryRepository extends JpaRepository<Entry, Long> {

//    @Query("SELECT s FROM Entry e WHERE e.date = ?1")
    Optional<Entry> findEntryByDate(LocalDate date);
}
