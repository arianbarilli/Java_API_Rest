package br.edu.atitus.pooavancado.CadUsuario.services;

import org.springframework.data.repository.query.Param;
import org.springframework.security.core.userdetails.UserDetailsService;

import br.edu.atitus.pooavancado.CadUsuario.entities.Usuario;

public interface UsuarioService extends GenericService<Usuario>, UserDetailsService{
	
	void alteraStatus(@Param("id") long id) throws Exception;

}
