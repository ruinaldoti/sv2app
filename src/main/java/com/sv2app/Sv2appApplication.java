package com.sv2app;

import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sv2app.domain.Categoria;
import com.sv2app.domain.Cidade;
import com.sv2app.domain.Cliente;
import com.sv2app.domain.Endereco;
import com.sv2app.domain.Estado;
import com.sv2app.domain.ItemPedido;
import com.sv2app.domain.Pagamento;
import com.sv2app.domain.PagamentoComBoleto;
import com.sv2app.domain.PagamentoComCartao;
import com.sv2app.domain.Pedido;
import com.sv2app.domain.Produto;
import com.sv2app.domain.enums.EstadoPagamento;
import com.sv2app.domain.enums.TipoCliente;
import com.sv2app.repositories.CategoriaRepository;
import com.sv2app.repositories.CidadeRepository;
import com.sv2app.repositories.ClienteRepository;
import com.sv2app.repositories.EnderecoRepository;
import com.sv2app.repositories.EstadoRepository;
import com.sv2app.repositories.ItemPedidoRepository;
import com.sv2app.repositories.PagamentoRepository;
import com.sv2app.repositories.PedidoRepository;
import com.sv2app.repositories.ProdutoRepository;

@SpringBootApplication
public class Sv2appApplication implements CommandLineRunner {

	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	@Autowired
	private CidadeRepository cidadeRepository;
	
	@Autowired
	private EstadoRepository estadoRepository;
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private EnderecoRepository enderecoRepository;
	
	@Autowired
	private PedidoRepository pedidoRepository;
	
	@Autowired
	private PagamentoRepository pagamentoRepository;
	
	@Autowired
	private ItemPedidoRepository itemPedidoRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(Sv2appApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/*
		Categoria cat1 = new Categoria(null, "Infomatica");
		Categoria cat2 = new Categoria(null, "Cama");
		Categoria cat3 = new Categoria(null, "Mesa");
		Categoria cat4 = new Categoria(null, "Banho");
		Categoria cat5 = new Categoria(null, "Decoração");
		Categoria cat6 = new Categoria(null, "Limpeza");
		Categoria cat7 = new Categoria(null, "Eletronicos");
		Categoria cat8 = new Categoria(null, "Moveis");
		
		Produto p1 = new Produto(null, "Computador", 2000.00);
		Produto p2 = new Produto(null, "Impressora", 800.00);
		Produto p3 = new Produto(null, "Mouse", 80.00);
		Produto p4 = new Produto(null, "Mesa de escritório", 300.00);
		Produto p5 = new Produto(null, "Toalha", 50.00);
		Produto p6 = new Produto(null, "Colcha", 200.00);
		Produto p7 = new Produto(null, "TV true color", 1200.00);
		Produto p8 = new Produto(null, "Roçadeira", 800.00);
		Produto p9 = new Produto(null, "Abajour", 100.00);
		Produto p10 = new Produto(null, "Pendente", 180.00);
		Produto p11 = new Produto(null, "Shampoo", 90.00);
		
		cat1.getProdutos().addAll(Arrays.asList(p1,p2,p3));
		cat2.getProdutos().addAll(Arrays.asList(p1));
		cat3.getProdutos().addAll(Arrays.asList(p5, p6));
		cat4.getProdutos().addAll(Arrays.asList(p1, p2, p3, p7));
		cat5.getProdutos().addAll(Arrays.asList(p8));
		cat6.getProdutos().addAll(Arrays.asList(p9, p10));
		cat7.getProdutos().addAll(Arrays.asList(p11));
		
		p1.getCategorias().addAll(Arrays.asList(cat1, cat4));
		p2.getCategorias().addAll(Arrays.asList(cat1, cat2, cat4));
		p3.getCategorias().addAll(Arrays.asList(cat1, cat4));
		p4.getCategorias().addAll(Arrays.asList(cat2));
		p5.getCategorias().addAll(Arrays.asList(cat3));
		p6.getCategorias().addAll(Arrays.asList(cat3));
		p7.getCategorias().addAll(Arrays.asList(cat4));
		p8.getCategorias().addAll(Arrays.asList(cat5));
		p9.getCategorias().addAll(Arrays.asList(cat6));
		p10.getCategorias().addAll(Arrays.asList(cat6));
		p11.getCategorias().addAll(Arrays.asList(cat7));
		
		categoriaRepository.saveAll(Arrays.asList(cat1, cat2, cat3, cat4, cat5, cat6, cat7));
		produtoRepository.saveAll(Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11));
		
		
		Estado est1 = new Estado(null, "Piaui");
		Estado est2 = new Estado(null, "Maranhão");
		
		Cidade cida1 = new Cidade(null, "São Luiz", est2);
		Cidade cida2 = new Cidade(null, "Terezina", est1);
		
		
		est1.getCidades().addAll(Arrays.asList(cida2));	
		est2.getCidades().addAll(Arrays.asList(cida1));
		
		estadoRepository.saveAll(Arrays.asList(est1, est2));
		cidadeRepository.saveAll(Arrays.asList(cida1, cida2));
		
		
		Cliente cli1 = new Cliente(null,"Ruinaldo Lopes", "ruinaldo.ti@gmail.com", "654654123164", TipoCliente.PESSOAFISICAS);
		cli1.getTelefones().addAll(Arrays.asList("998498489", "56456454456"));
		
		Endereco e1 = new Endereco(null, "Rua Primeiro de abril", "333", "Apto 32121", "Jardim", "32121561", cli1, cida2);
		Endereco e2 = new Endereco(null, "Rua Teste Teste", "333", "Apto 351", "Jardim", "32121561", cli1, cida1);
		
		cli1.getEnderecos().addAll(Arrays.asList(e1, e2));
		
		clienteRepository.saveAll(Arrays.asList(cli1));
		enderecoRepository.saveAll(Arrays.asList(e1,e2));
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		
		Pedido ped1 = new Pedido(null, sdf.parse("30/09/2017 10:32"), cli1, e1);
		Pedido ped2 = new Pedido(null, sdf.parse("05/09/2017 17:32"), cli1, e2);
		
		Pagamento pagto1 = new PagamentoComCartao (null, EstadoPagamento.QUITADO, ped1, 5);
		ped1.setPagamento(pagto1);
		
		Pagamento pagto2 = new PagamentoComBoleto (null, EstadoPagamento.PENDENTE, ped2, sdf.parse("18/09/2017 17:32"), null);
		ped2.setPagamento(pagto2);
		
		cli1.getPedidos().addAll(Arrays.asList(ped1,ped2));
		
		pedidoRepository.saveAll(Arrays.asList(ped1, ped2));
		pagamentoRepository.saveAll(Arrays.asList(pagto1, pagto2));
		
		ItemPedido ip1 = new ItemPedido(ped1, p1, 0.00, 1, 2000.00);
		ItemPedido ip2 = new ItemPedido(ped1, p3, 0.00, 2, 750.00);
		ItemPedido ip3 = new ItemPedido(ped2, p2, 0.00, 1, 800.00);
		
		ped1.getItens().addAll(Arrays.asList(ip1, ip2));
		ped2.getItens().addAll(Arrays.asList(ip3));
		
		p1.getItens().addAll(Arrays.asList(ip1));
		p2.getItens().addAll(Arrays.asList(ip2));
		p3.getItens().addAll(Arrays.asList(ip3));
		
		itemPedidoRepository.saveAll(Arrays.asList(ip1, ip2, ip3));
		
		
		*/
		
	}

}
