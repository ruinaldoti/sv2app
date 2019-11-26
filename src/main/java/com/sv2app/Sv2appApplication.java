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
		Categoria cat1 = new Categoria(null, "Janela2");
		Categoria cat2 = new Categoria(null, "Porta3");
		
		Produto p1 = new Produto(null, "JanelaTabicao", 450.00);
		Produto p2 = new Produto(null, "PortaTabicao", 895.00);
		Produto p3 = new Produto(null, "JanelaVidro", 300.00);
		
		cat1.getProdutos().addAll(Arrays.asList(p1,p2,p3));
		cat2.getProdutos().addAll(Arrays.asList(p1));
		
		p1.getCategorias().addAll(Arrays.asList(cat1));
		p2.getCategorias().addAll(Arrays.asList(cat1, cat2));
		p3.getCategorias().addAll(Arrays.asList(cat1));
		
		categoriaRepository.saveAll(Arrays.asList(cat1, cat2));
		produtoRepository.saveAll(Arrays.asList(p1,p2,p3));
		
		
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
