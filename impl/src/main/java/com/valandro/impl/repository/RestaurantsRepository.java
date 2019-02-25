package com.valandro.impl.repository;

import com.valandro.impl.data.RestaurantEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RestaurantsRepository extends MongoRepository<RestaurantEntity, Long> {
    List<RestaurantEntity> findByTypeFood(String type);
}
