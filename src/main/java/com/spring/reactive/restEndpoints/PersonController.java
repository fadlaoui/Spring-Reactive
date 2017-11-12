package com.spring.reactive.restEndpoints;

import com.spring.reactive.data.PersonRepository;
import com.spring.reactive.model.Person;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Example;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * <h1>Role</h1>
 * <p>Description </p>
 * <b>Note:</b>
 *
 * @author Mohamed Fadlaoui
 * @version 1.0
 * @projet Tuto-SpringReactive
 * @since 17:22 12/11/2017
 */

@RestController
@RequestMapping("/")
public class PersonController {

    @Autowired
    private PersonRepository personRespository;

    @CrossOrigin
    @GetMapping
    public Flux<Person> index() {
        return personRespository.findAll();
    }

    @CrossOrigin
    @PostMapping("save")
    public Mono<Person> insert(@RequestBody Person person){

        return personRespository.insert(person);
    }


}
