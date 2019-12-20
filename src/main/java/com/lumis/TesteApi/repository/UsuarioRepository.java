package com.lumis.TesteApi.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.lumis.TesteApi.models.Cargo;
import com.lumis.TesteApi.models.Perfil;
import com.lumis.TesteApi.models.Usuario;

@Repository
public interface UsuarioRepository extends PagingAndSortingRepository<Usuario, Long>{
	
	@Query("select usuario from Usuario usuario where usuario.nome like %:nome% or usuario.cpf like %:cpf% or usuario.sexo = :sexo or usuario.dtNascimento = :dtNascimento or usuario.status = :status")
	List<Usuario> findByNomeOrCpfOrSexoOrDtNascimentoOrStatus(
			@Param("nome") String nome,
			@Param("cpf") String cpf,
			@Param("sexo") String sexo,
			@Param("dtNascimento") Date dtNascimento,
			@Param("status") Boolean status);
}
