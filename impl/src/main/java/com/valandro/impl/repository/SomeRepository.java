package com.valandro.impl.repository;

import com.valandro.impl.data.SomeEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SomeRepository extends CrudRepository<SomeEntity, Long> {
}
