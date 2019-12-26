package fr.tds.tdsbackend.repository;

import fr.tds.tdsbackend.model.MdContent;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin(origins = "http://localhost")
public interface ContentRepository extends PagingAndSortingRepository<MdContent, Integer>{
    List<MdContent> findByName(String name);
}

