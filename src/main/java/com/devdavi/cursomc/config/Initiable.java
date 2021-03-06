package com.devdavi.cursomc.config;

//@Configuration
//@Profile("test")
public class Initiable{
//
//	@Autowired
//	private CategoriaRepository categoriaRepository;
//	
//	@Autowired
//	private ProdutoRepository produtoRepository;
//
//	@Autowired
//	private EstadoRepository estadoRepository;
//
//	@Autowired
//	private CidadeRepository cidadeRepository;
//
//	@Autowired
//	private ClienteRepository clienteRepository;
//
//	@Autowired
//	private EnderecoRepository enderecoRepository;
//
//	@Autowired
//	private PedidoRepository pedidoRepository;
//
//	@Autowired
//	private PagamentoRepository pagamentoRepository;
//
//	@Autowired
//	private ItemPedidoRepository itemPedidoRepository;
//
//	@Autowired
//	private BCryptPasswordEncoder pe;
//	
//	@Bean
//	public EmailService emailService() {
//		return new SmtpEmailService();
//	}
//
//	@Override
//	public void run(String... args) throws Exception {
//
//		Categoria c1 = new Categoria(null, "Informática");
//		Categoria c2 = new Categoria(null, "Escritório");
//		Categoria c3 = new Categoria(null, "Livros");
//		Categoria c4 = new Categoria(null, "Video Games");
//		Categoria c5 = new Categoria(null, "Eletrônicos");
//		Categoria c6 = new Categoria(null, "Decoração");
//		Categoria c7 = new Categoria(null, "Jardinagem");
//
//		Produto p1 = new Produto(null, "Computador", 2000.00);
//		Produto p2 = new Produto(null, "Impressora", 800.00);
//		Produto p3 = new Produto(null, "Mouse", 80.00);
//		Produto p4 = new Produto(null, "Mesa de escritório", 300.00);
//		Produto p5 = new Produto(null, "Toalha", 50.00);
//		Produto p6 = new Produto(null, "Colcha", 200.00);
//		Produto p7 = new Produto(null, "TV true color", 1200.00);
//		Produto p8 = new Produto(null, "Roçadeira", 800.00);
//		Produto p9 = new Produto(null, "Abajour", 100.00);
//		Produto p10 = new Produto(null, "Pendente", 180.00);
//		Produto p11 = new Produto(null, "Shampoo", 90.00);
//
//		Estado e1 = new Estado(null, "Minas Gerais");
//		Estado e2 = new Estado(null, "São Paulo");
//
//		Cidade cid1 = new Cidade(null, "Uberlândia", e1);
//		Cidade cid2 = new Cidade(null, "São Paulo", e2);
//		Cidade cid3 = new Cidade(null, "Campinas", e2);
//
//		e1.getCidades().add(cid1);
//		e2.getCidades().addAll(Arrays.asList(cid2, cid3));
//
//		estadoRepository.saveAll(Arrays.asList(e1, e2));
//		cidadeRepository.saveAll(Arrays.asList(cid1, cid2, cid3));
//
//		c1.getProdutos().addAll(Arrays.asList(p1, p2,p3));
//		c2.getProdutos().addAll(Arrays.asList(p2, p4));
//		c3.getProdutos().addAll(Arrays.asList(p5, p6));
//		c4.getProdutos().addAll(Arrays.asList(p1, p2, p3, p7));
//		c5.getProdutos().addAll(Arrays.asList(p8));
//		c6.getProdutos().addAll(Arrays.asList(p9, p10));
//		c7.getProdutos().addAll(Arrays.asList(p11));
//
//		p1.getCategorias().addAll(Arrays.asList(c1, c4));
//		p2.getCategorias().addAll(Arrays.asList(c1, c2, c4));
//		p3.getCategorias().addAll(Arrays.asList(c1, c4));
//		p4.getCategorias().addAll(Arrays.asList(c2));
//		p5.getCategorias().addAll(Arrays.asList(c3));
//		p6.getCategorias().addAll(Arrays.asList(c3));
//		p7.getCategorias().addAll(Arrays.asList(c4));
//		p8.getCategorias().addAll(Arrays.asList(c5));
//		p9.getCategorias().addAll(Arrays.asList(c6));
//		p10.getCategorias().addAll(Arrays.asList(c6));
//		p11.getCategorias().addAll(Arrays.asList(c7));
//
//		categoriaRepository.saveAll(Arrays.asList(c1, c2, c3, c4, c5, c6, c7));
//		produtoRepository.saveAll(Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11));
//
//		Cliente cli1 = new Cliente(null, "Maria Silva", "ifbadavi@gmail.com", "36378912377", TipoCliente.PESSOAFISICA, pe.encode("123"));
//		cli1.getTelefones().addAll(Arrays.asList("27363323", "93838393"));
//		
//		Cliente cli2 = new Cliente(null, "Davi Ramos", "dev.davi@yahoo.com", "68326816078", TipoCliente.PESSOAFISICA, pe.encode("123"));
//		cli2.addPerfil(Perfil.ADMIN);
//		cli2.getTelefones().addAll(Arrays.asList("938883321", "344252625"));
//
//
//		Endereco end1 = new Endereco(null, "Rua flores", "300", "Apto 303", "Jardim", "38220834", cli1, cid1);
//		Endereco end2 = new Endereco(null, "Avenida Matos", "105", "Sala 800", "Centro", "38777012", cli1, cid2);
//		Endereco end3 = new Endereco(null, "Avenida Floriano", "2106", null, "Centro", "281777012", cli2, cid2);
//
//		cli1.getEnderecos().addAll(Arrays.asList(end1, end2));
//		cli2.getEnderecos().addAll(Arrays.asList(end3));
//
//		clienteRepository.saveAll(Arrays.asList(cli1,cli2));
//		enderecoRepository.saveAll(Arrays.asList(end1, end2,end3));
//
//		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
//
//		Pedido ped1 = new Pedido(null, sdf.parse("30/09/2017 10:32"), cli1, end1);
//		Pedido ped2 = new Pedido(null, sdf.parse("10/10/2017 19:35"), cli1, end2);
//
//		Pagamento pagto1 = new PagamentoComCartao(null, EstadoPagamento.QUITADO, ped1, 6);
//
//		ped1.setPagamento(pagto1);
//
//		Pagamento pagto2 = new PagamentoComBoleto(null, EstadoPagamento.PENDENTE, ped2, sdf.parse("20/10/2017 00:00"),
//				null);
//
//		ped2.setPagamento(pagto2);
//
//		cli1.getPedidos().addAll(Arrays.asList(ped1, ped2));
//
//		pedidoRepository.saveAll(Arrays.asList(ped1, ped2));
//		pagamentoRepository.saveAll(Arrays.asList(pagto1, pagto2));
//
//		ItemPedido ip1 = new ItemPedido(ped1, p1, 0.00, 1, 2000.00);
//		ItemPedido ip2 = new ItemPedido(ped1, p3, 0.00, 2, 80.00);
//		ItemPedido ip3 = new ItemPedido(ped2, p2, 100.00, 1, 800.00);
//
//		ped1.getItens().addAll(Arrays.asList(ip1, ip2));
//		ped2.getItens().addAll(Arrays.asList(ip3));
//
//		p1.getItens().addAll(Arrays.asList(ip1));
//		p2.getItens().addAll(Arrays.asList(ip3));
//		p3.getItens().addAll(Arrays.asList(ip2));
//
//		itemPedidoRepository.saveAll(Arrays.asList(ip1, ip2, ip3));
//	}

}
