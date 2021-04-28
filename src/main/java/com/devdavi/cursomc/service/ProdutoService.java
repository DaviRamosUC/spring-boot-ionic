package com.devdavi.cursomc.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.devdavi.cursomc.domain.Categoria;
import com.devdavi.cursomc.domain.Produto;
import com.devdavi.cursomc.repositories.CategoriaRepository;
import com.devdavi.cursomc.repositories.ProdutoRepository;
import com.devdavi.cursomc.service.exception.ObjectNotFoundException;

@Service
public class ProdutoService{
	
	@Autowired
	private ProdutoRepository repo;

	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public List<Produto> findAll(){
		List<Produto> lista = repo.findAll();
		return lista;
	}
	
	public Produto findById(Integer id) {
		Optional<Produto> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				 "Objeto não encontrado! Id: " + id + ", Tipo: " + Produto.class.getName()));
	}
	
	public Page<Produto> search(String nome, List<Integer>ids, Integer page, Integer linesPerPage, String orderBy, String direction) {
		PageRequest pageRequest = PageRequest.of(page, linesPerPage,
				org.springframework.data.domain.Sort.Direction.valueOf(direction), orderBy);
		List<Categoria> categorias = categoriaRepository.findAllById(ids);
		
		return repo.search(nome,categorias, pageRequest);
		
	}
}
