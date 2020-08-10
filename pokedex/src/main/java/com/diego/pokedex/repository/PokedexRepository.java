package com.diego.pokedex.repository;

import com.diego.pokedex.model.Pokemon;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface PokedexRepository extends ReactiveMongoRepository<Pokemon, String> {

}
