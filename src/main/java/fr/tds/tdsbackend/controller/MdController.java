package fr.tds.tdsbackend.controller;

import fr.tds.tdsbackend.model.MdContent;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MdController {
    @RequestMapping("/content")
    public MdContent getContent(@RequestParam(value="name") String name) {
        return new MdContent(0, name, "# This si a first trial!");
    }
}
