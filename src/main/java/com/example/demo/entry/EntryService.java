package com.example.demo.entry;


import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;


import java.util.List;

@Service
public class EntryService{
    private final EntryRepository entryRepository;

    public EntryService(EntryRepository entryRepository) {
        this.entryRepository = entryRepository;
    }

    public List<Entry> getInfoOfEntry () {
        return entryRepository.findAll();

    }

    public void addNewEntry(@RequestBody Entry entry) {
        System.out.println(entry);
    }
}
