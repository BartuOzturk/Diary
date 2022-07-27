package com.example.demo.entry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EntryRepository extends JpaRepository<Entry, Long> {

    //Select * from student where title =?
    @Query("SELECT e from Entry e where e.title =?1")
    Optional<Entry> findEntryByTitle(String title);
}
