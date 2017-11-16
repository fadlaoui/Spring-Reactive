package com.spring.reactive.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * <h1>Entité Personne</h1>
 * <p>Cette classe représente une Personne</p>
 * <b>Note: Cette classe est une entité dans une  base de donnée NOSQL (MongoDB)
 * L'annotation data c'est une annotation de la biblio lombok
 *  <b> C'est quoi ce Lombok ?</b>
 *  <p> Lombok c'est un projet qui était créer dans le but de nous simplifier la vie toute en nous créant les getters / setters , les méthodes toString ..
 *  par une simple annotation @Data  , qui sera responsable de la créations des accesseur et mutateur des champs de cette classe  </p>
 * </b>
 *
 * @author Mohamed Fadlaoui
 * @version 1.0
 * @projet Tuto-SpringReactive
 * @since 17:06 12/11/2017
 */
@Data
@Document
public class Person {
    @Id
    private String id;
    private String name;


}
