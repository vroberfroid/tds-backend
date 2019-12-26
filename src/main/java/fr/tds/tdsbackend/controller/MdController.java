package fr.tds.tdsbackend.controller;

import fr.tds.tdsbackend.model.MdContent;
import fr.tds.tdsbackend.repository.ContentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class MdController {
    @Autowired
    ContentRepository contentRepository;

    @RequestMapping("/content")
    public MdContent getContent(@RequestParam(value="name") String name) {
        // TODO check of exist
        return contentRepository.findByName(name).get(0);
    }

    @PutMapping("/content/update")
    public MdContent updateContent(@RequestBody MdContent content) {
        // TODO check of exist
        MdContent mdContent = contentRepository.findByName(content.getName()).get(0);
        mdContent.setContent(content.getContent());
        return contentRepository.save(mdContent);
    }
}
