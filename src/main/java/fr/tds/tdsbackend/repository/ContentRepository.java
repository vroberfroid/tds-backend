package fr.tds.tdsbackend.repository;

import fr.tds.tdsbackend.model.MdContent;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ContentRepository extends PagingAndSortingRepository<MdContent, Integer>{

}

