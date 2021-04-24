package com.devdavi.cursomc.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.devdavi.cursomc.domain.Categoria;
import com.devdavi.cursomc.domain.Produto;
import com.devdavi.cursomc.repositories.CategoriaRepository;
import com.devdavi.cursomc.repositories.ProdutoRepository;

@Configuration
@Profile("test")
public class Initiable implements CommandLineRunner{
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@Autowired
	private ProdutoRepository produtoRepository;

	@Override
	public void run(String... args) throws Exception {
		
		Categoria c1 = new Categoria(null, "Informática");
		Categoria c2 = new Categoria(null, "Escritório");
		
		
		Produto p1 = new Produto(null, "Computador", 2000.00); 
		Produto p2 = new Produto(null, "Impressora", 800.00); 
		Produto p3 = new Produto(null, "Mouse", 80.00);
		
		
		c1.getProdutos().addAll(Arrays.asList(p1,p2));
		c2.getProdutos().addAll(Arrays.asList(p3));
		
		p1.getCategorias().add(c1);
		p2.getCategorias().add(c1);
		p3.getCategorias().add(c2);

		categoriaRepository.saveAll(Arrays.asList(c1,c2));
		produtoRepository.saveAll(Arrays.asList(p1,p2,p3));
	}
	
	
}
