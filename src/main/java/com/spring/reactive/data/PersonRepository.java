package com.spring.reactive.data;

import com.spring.reactive.model.Person;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
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
 * @since 17:19 12/11/2017
 */

public interface PersonRepository extends ReactiveMongoRepository<Person,String> {

    Flux<Person> findByName(String name);

    Mono<Person> insert(Person person);

}
