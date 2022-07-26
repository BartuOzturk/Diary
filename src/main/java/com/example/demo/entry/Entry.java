package com.example.demo.entry;

import javax.persistence.*;
import java.time.LocalDate;


@Entity
@Table
public class Entry {
    @Id
    @SequenceGenerator(name = "entry_sequence",
                       sequenceName = "entry_sequence",
                        allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "entry_sequence"
    )
    private Long id;
    private String title;
    private String content;
    private LocalDate doe;

    @Transient
    private Integer nop;

    public Entry() {
    }

    public Entry(Long id, String title,String content, LocalDate doe) {
        this.id = id;
        this.title = title;
        this.content =content;
        this.doe = doe;

    }

    public Entry(String title, String content, LocalDate doe) {
        this.title = title;
        this.content =content;
        this.doe = doe;

    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getContent(){
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public LocalDate getDoe() {
        return doe;
    }
    public void setDoe(LocalDate doe) {
        this.doe = doe;
    }


    @Override
    public String toString() {
        return "Entry{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", doe=" + doe +
                '}';
    }
}
