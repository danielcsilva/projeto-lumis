package com.lumis.TesteApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lumis.TesteApi.models.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}
