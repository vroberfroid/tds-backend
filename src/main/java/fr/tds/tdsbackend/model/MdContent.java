package fr.tds.tdsbackend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "MD_CONTENT")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MdContent {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "NAME", unique = true)
    private String name;

    @Column(name = "CONTENT")
    private String content;
}
