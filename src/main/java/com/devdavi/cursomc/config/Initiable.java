package com.devdavi.cursomc.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.devdavi.cursomc.domain.Categoria;
import com.devdavi.cursomc.domain.Cidade;
import com.devdavi.cursomc.domain.Cliente;
import com.devdavi.cursomc.domain.Endereco;
import com.devdavi.cursomc.domain.Estado;
import com.devdavi.cursomc.domain.Produto;
import com.devdavi.cursomc.domain.enums.TipoCliente;
import com.devdavi.cursomc.repositories.CategoriaRepository;
import com.devdavi.cursomc.repositories.CidadeRepository;
import com.devdavi.cursomc.repositories.ClienteRepository;
import com.devdavi.cursomc.repositories.EnderecoRepository;
import com.devdavi.cursomc.repositories.EstadoRepository;
import com.devdavi.cursomc.repositories.ProdutoRepository;

@Configuration
@Profile("test")
public class Initiable implements CommandLineRunner{
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	@Autowired
	private EstadoRepository estadoRepository;

	@Autowired
	private CidadeRepository cidadeRepository;

	@Autowired
	private ClienteRepository clienteRepository;

	@Autowired
	private EnderecoRepository enderecoRepository;

	@Override
	public void run(String... args) throws Exception {
		
		Categoria c1 = new Categoria(null, "Informática");
		Categoria c2 = new Categoria(null, "Escritório");
		
		
		Produto p1 = new Produto(null, "Computador", 2000.00); 
		Produto p2 = new Produto(null, "Impressora", 800.00); 
		Produto p3 = new Produto(null, "Mouse", 80.00);
		
		
		Estado e1 = new Estado(null, "Minas Gerais");
		Estado e2 = new Estado(null, "São Paulo");
		
		
		Cidade cid1 = new Cidade(null, "Uberlândia", e1);
		Cidade cid2 = new Cidade(null, "São Paulo", e2);
		Cidade cid3 = new Cidade(null, "Campinas", e2);
		
		e1.getCidades().add(cid1);
		e2.getCidades().addAll(Arrays.asList(cid2,cid3));

		estadoRepository.saveAll(Arrays.asList(e1,e2));
		cidadeRepository.saveAll(Arrays.asList(cid1,cid2,cid3));
		
		c1.getProdutos().addAll(Arrays.asList(p1,p2));
		c2.getProdutos().addAll(Arrays.asList(p3));
		
		p1.getCategorias().add(c1);
		p2.getCategorias().add(c1);
		p3.getCategorias().add(c2);

		categoriaRepository.saveAll(Arrays.asList(c1,c2));
		produtoRepository.saveAll(Arrays.asList(p1,p2,p3));
		
		Cliente cli1 = new Cliente(null, "Maria Silva", "maria@gmail.com", "36378912377", TipoCliente.PESSOAFISICA);
			
		cli1.getTelefones().addAll(Arrays.asList("27363323","93838393"));
		
		Endereco end1 = new Endereco(null, "Rua flores", "300", "Apto 303", "Jardim", "38220834", cli1, cid1);
		Endereco end2 = new Endereco(null, "Avenida Matos", "105", "Sala 800", "Centro", "38777012", cli1, cid2);
		
		cli1.getEnderecos().addAll(Arrays.asList(end1,end2));
		
		clienteRepository.saveAll(Arrays.asList(cli1));
		
		enderecoRepository.saveAll(Arrays.asList(end1,end2));
		
		
	}
	
	
}
