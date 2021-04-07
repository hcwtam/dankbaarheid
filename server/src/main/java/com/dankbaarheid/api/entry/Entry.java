package com.dankbaarheid.api.entry;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table
public class Entry {
    @Id
    @SequenceGenerator(name = "entry_sequence", sequenceName = "entry_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "entry_sequence")
    private long id;
    private LocalDate date;
    private String content;

    public Entry() {
    }

    public Entry(long id, LocalDate date, String content) {
        this.id = id;
        this.date = date;
        this.content = content;
    }

    public Entry(LocalDate date, String content) {
        this.date = date;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Entry{" +
                "id=" + id +
                ", date=" + date +
                ", content='" + content + '\'' +
                '}';
    }
}
