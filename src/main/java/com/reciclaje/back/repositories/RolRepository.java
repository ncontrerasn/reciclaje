package com.reciclaje.back.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolRepository extends CrudRepository<com.reciclaje.back.models.Rol, Integer> {
}
