package com.lumis.TesteApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lumis.TesteApi.models.Perfil;

@Repository
public interface PerfilRespository extends JpaRepository<Perfil, Long> {

}
