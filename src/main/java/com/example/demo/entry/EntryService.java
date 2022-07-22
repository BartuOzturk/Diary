package com.example.demo.entry;


import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class EntryService {
    public List<Entry> getInfoOfEntry () {
        return List.of(new Entry(1L, "Test Title", "This is the Content of the first Entry of my diary", LocalDate.of(2002, Month.JULY, 22), 10
        ));

    }
}
