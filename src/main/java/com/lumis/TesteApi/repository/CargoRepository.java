package com.lumis.TesteApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lumis.TesteApi.models.Cargo;

@Repository
public interface CargoRepository extends JpaRepository<Cargo, Long> {

}
