package com.example.demo.entry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;


@RestController
@RequestMapping("api/v1/InfoofEntry")
public class EntryController {

    private final EntryService entryService;
    @Autowired
    public EntryController(EntryService entryService) {
        this.entryService = entryService;
    }
    @GetMapping
    public List<Entry> getInfoOfEntry (){
        return entryService.getInfoOfEntry();
    }
}
