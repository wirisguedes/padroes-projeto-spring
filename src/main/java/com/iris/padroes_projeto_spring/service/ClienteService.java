package com.iris.padroes_projeto_spring.service;

import com.iris.padroes_projeto_spring.model.Cliente;

/**
 * Interface que define padrao Strategy
 * 
 * @author iviturin
 */
public interface ClienteService {
	
	Iterable<Cliente> buscarTodos();
	
	Cliente buscarPorId(Long id);
	
	void inserir(Cliente cliente);
	
	void atualizar(Long id, Cliente cliente);
	void deletar(Long id);

}
