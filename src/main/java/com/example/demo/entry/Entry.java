package com.example.demo.entry;

import java.time.LocalDate;

public class Entry {
    private Long id;
    private String title;
    private String content;
    private LocalDate doe;
    private Integer nop;

    public Entry() {
    }

    public Entry(Long id, String title,String content, LocalDate doe, Integer nop) {
        this.id = id;
        this.title = title;
        this.content =content;
        this.doe = doe;
        this.nop = nop;
    }

    public Entry(String title, String content, LocalDate doe, Integer nop) {
        this.title = title;
        this.content =content;
        this.doe = doe;
        this.nop = nop;
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
    public Integer getNop() {
        return nop;
    }
    public void setNop(Integer nop) {
        this.nop = nop;
    }

    @Override
    public String toString() {
        return "Entry{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", doe=" + doe +
                ", nop=" + nop +
                '}';
    }
}