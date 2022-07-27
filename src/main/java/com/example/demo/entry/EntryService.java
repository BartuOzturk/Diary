package com.example.demo.entry;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;


import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class EntryService{
    private final EntryRepository entryRepository;
    @Autowired
    public EntryService(EntryRepository entryRepository) {
        this.entryRepository = entryRepository;
    }

    public List<Entry> getInfoOfEntry () {
        return entryRepository.findAll();

    }

    public void addNewEntry(Entry entry) {
        Optional<Entry> entryByTitle =
        entryRepository.findEntryByTitle(entry.getTitle());
        if (entryByTitle.isPresent()){
            throw new IllegalStateException("This Title already exists");
        }
        entryRepository.save(entry);
    }

    public void deleteEntry(Long entryId) {
        boolean exists = entryRepository.existsById(entryId);

        if(!exists){
            throw new IllegalStateException("Entry with ID" + entryId+ " does not exists");
        }entryRepository.deleteById(entryId);


    }
    @Transactional
    public void updateEntry(Long entryId, String title, String content) {
        Entry entry = entryRepository.findById(entryId)
                .orElseThrow(() -> new IllegalStateException("entry with id" + entryId + " does not exist"));

        if( content != null && content.length() > 0 && !Objects.equals(entry.getContent(), content)){
                entry.setContent(content);
        }

        if(title != null && title.length() > 0 && !Objects.equals(entry.getTitle(),title)){
            Optional<Entry> entryOptional = entryRepository.findEntryByTitle(title);
            if(entryOptional.isPresent()){
                throw new IllegalStateException("This Title is already taken");
            }
        }entry.setTitle(title);
    }
}
