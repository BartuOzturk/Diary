package com.example.demo.entry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

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
    @PostMapping
    public void registerNewEntry(@RequestBody Entry entry){
        entryService.addNewEntry(entry);
    }
    @PutMapping(path ="{entryId}")
    public void updateEntry(@PathVariable ("entryId") Long entryId,
                            @RequestParam(required = false) String title,
                            @RequestParam(required = false)String content) {
                            entryService.updateEntry(entryId,title,content);

    }

    @DeleteMapping(path = "{entryId}")
    public void deleteEntry(@PathVariable("entryId")Long entryId){
        entryService.deleteEntry(entryId);
    }
}
